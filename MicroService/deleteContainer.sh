#!/bin/bash

#Bash script to create container. Parameter is the port.
docker stop $1
# Delete all containers not used
docker rm $(docker ps -a -q)


