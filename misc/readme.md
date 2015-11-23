### Misc files

This folder stores misc files related to this project. 

#### compose
Configuration files to launc the applicaiton using [Docker Compose]()

To launch the entire app

1. Install [docker machine](https://www.docker.com/docker-machine).
2. ``` cd compose ; docker-compose up ```
3. Point your browser to http://<your_docker_machine_IP>:8080/app

#### dbsetup
Scripts to initialize databases.

#### kubernetes
Configurations for running the application under kubernetes. 

To launch the entire app

1. Install [kubernetes](https://kubernetes.io) locally using [Vagrant setup](http://kubernetes.io/v1.1/docs/getting-started-guides/vagrant.html)
2. Edit ```env``` file to make sure the alias poitns to the correct path on your machine.
3. ``` cd kubernetes ; startall ```  you mean need to change the alias in ```env``` file 
4. Point your browser to http://<your_minion_public_IP>:8080/app

#### ibank-httpd
Dockerfile for fornt end http server.

#### proxy
configuration files for use with http server as reverse proxy to the ibank application.

#### scripts
Other scripts.

