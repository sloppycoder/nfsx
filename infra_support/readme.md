### Infra support

This folder stores scripts and configuration files related to infra setup, build and deployment. 

#### compose
Configuration files to launc the applicaiton using [Docker Compose](https://docs.docker.com/compose/)

To launch the entire app

1. Install dokcer locally, e.g. using [docker machine](https://www.docker.com/docker-machine).
2. ``` cd compose ; ./restart ```
3. Point your browser to the URL printed on the screen, e.g. http://192.168.99.100:8080/app


#### kubernetes
The application can be launched using single script in Kubernetes cluster.

To launch the entire app in locally installed Kuberntes cluster

1. Install [kubernetes](https://kubernetes.io) locally using [minikube](https://github.com/kubernetes/minikube)
2. ``` cd k8s ; ./startall_minikube ```
3. After launching the application the script will print out the URL to access the application. 
