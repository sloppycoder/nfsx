#
# scripts to pass to GCE when creating a runner instance
# based on image centos-7-v20151104
#

yum update -y
yum install -y java-1.8.0-openjdk-devel lsof bzip2 wget patch psmisc bind-utils

# jq
curl -sL https://github.com/stedolan/jq/releases/download/jq-1.5/jq-linux64 -o /usr/local/bin/jq
chmod +x /usr/local/bin/jq

# phantomjs
curl -sL https://phantomjs.googlecode.com/files/phantomjs-1.9.2-linux-x86_64.tar.bz2 -o - | tar jxf - -C /opt
ln -s /opt/phantomjs-1.9.2-linux-x86_64/bin/phantomjs /usr/local/bin/.

# install docker from official repo
tee /etc/yum.repos.d/docker.repo <<-'EOF'
[dockerrepo]
name=Docker Repository
baseurl=https://yum.dockerproject.org/repo/main/centos/$releasever/
enabled=1
gpgcheck=1
gpgkey=https://yum.dockerproject.org/gpg

EOF

yum update -y
yum install -y docker-engine
systemctl enable docker
systemctl start docker

# install docker-compose binary
curl -L https://github.com/docker/compose/releases/download/1.5.1/docker-compose-`uname -s`-`uname -m` > /usr/local/bin/docker-compose
chmod +x /usr/local/bin/docker-compose

# install google cloud sdk
export CLOUDSDK_CORE_DISABLE_PROMPTS=1
export CLOUDSDK_INSTALL_DIR=/opt
curl -sL https://sdk.cloud.google.com | bash


# install additiona ca certs.
curl --insecure https://www.vino9.net/ca-bundle.crt  -o /etc/pki/ca-trust/source/anchors/ca-bundle.crt
update-ca-trust

# install development tool so as to be able to install gem which needs compilation
yum install -y ruby ruby-devel rubygem-bundler
yum install -y gcc openssl-devel libyaml-devel libffi-devel readline-devel zlib-devel gdbm-devel ncurses-devel


# gitlab-ci-multi-runner
curl -sL https://packages.gitlab.com/install/repositories/runner/gitlab-ci-multi-runner/script.rpm.sh | bash
yum install -y gitlab-ci-multi-runner
usermod -aG docker gitlab-runner

RUNNER_NAME=$(curl -sL -H "Metadata-Flavor: Google" http://metadata/computeMetadata/v1/instance/hostname | cut -d '.' -f 1)
REG_TOKEN=$(curl -sL -H "Metadata-Flavor: Google" http://metadata/computeMetadata/v1/instance/attributes/reg-token)

# need logic to parse token and name from metadata, below doesn't work
gitlab-runner register -n --url https://vino9.net/ci -r $REG_TOKEN --executor shell --name "$RUNNER_NAME"

