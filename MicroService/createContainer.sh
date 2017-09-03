#!/bin/bash

#Bash script to create container. Parameter is the port.
dockerImage=fbf0a5cfdfc6
docker run -p $1:8090 -d $dockerImage


