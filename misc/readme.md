### Misc files

This folder stores misc files related to this project. 

#### compose
Configuration files to launc the applicaiton using [Docker Compose](https://docs.docker.com/compose/)

To launch the entire app

1. Install [docker machine](https://www.docker.com/docker-machine).
2. ``` cd compose ; docker-compose up ```
3. Point your browser to http://<your_docker_machine_IP>:8080/app

#### dbsetup
Scripts to initialize databases.

#### kubernetes
The application can be launched using single script in Kubernetes cluster.

To launch the entire app in locally installed Kuberntes cluster

1. Install [kubernetes](https://kubernetes.io) locally using [Vagrant setup](http://kubernetes.io/v1.1/docs/getting-started-guides/vagrant.html)
2. ``` cd kubernetes ; ./startall_vagrant ```
3. After launching the application the script will print out the URL to access the application. 

Better yet, 
1. Use [Google Container Engine](https://cloud.google.com/container-engine/), create the cluster.
2. Get your [Google Cloud SDK](https://cloud.google.com/sdk/?hl=en) and [install kubectl](https://cloud.google.com/container-engine/docs/before-you-begin) and configure your credentails.
3. ``` cd kubernetes ; ./startall_gce ```
4. After launching the application the script will print out the URL to access the application. 


#### ibank-httpd
Dockerfile for fornt end http server.

#### proxy
configuration files for use with http server as reverse proxy to the ibank application.

#### scripts
Other scripts.

