#
# scripts to pass to GCE when creating a runner instance
# based on image centos-7-v20151104
#

yum update -y
yum install -y java-1.8.0-openjdk-devel ruby rubygem-bundler lsof bzip2 wget

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

# install docker-compose binary
curl -L https://github.com/docker/compose/releases/download/1.5.1/docker-compose-`uname -s`-`uname -m` > /usr/local/bin/docker-compose
chmod +x /usr/local/bin/docker-compose

# gitlab-ci-multi-runner
curl -sL https://packages.gitlab.com/install/repositories/runner/gitlab-ci-multi-runner/script.rpm.sh | bash
yum install -y gitlab-ci-multi-runner

# phantomjs
curl -sL https://phantomjs.googlecode.com/files/phantomjs-1.9.2-linux-x86_64.tar.bz2 -o - | tar jxf - -C /usr/local
ln -s /usr/local/phantomjs-1.9.2-linux-x86_64/bin/phantomjs /usr/local/bin/.

# jq
curl -sL https://github.com/stedolan/jq/releases/download/jq-1.5/jq-linux64 -o /usr/local/bin/jq
chmod +x /usr/local/bin/jq

# install google cloud sdk
export CLOUDSDK_CORE_DISABLE_PROMPTS=1
export CLOUDSDK_INSTALL_DIR=/usr/local
curl -sL https://sdk.cloud.google.com | bash

# let login user and ci runner run docker
usermod -aG docker guru_lin
usermod -aG docker gitlab-runner

systemctl enable docker
systemctl start docker
