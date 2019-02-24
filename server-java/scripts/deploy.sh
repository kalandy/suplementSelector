#!/bin/bash
SERVER_VERSION=ubuntu@ec2-3-17-4-120.us-east-2.compute.amazonaws.com

SERVER_CONNECTION="ssh -i ~/.ssh/suplementslectorkey.pem $SERVER_VERSION"
#zabic proces jezeli istnieje
PID=$($SERVER_CONNECTION ps aux | grep java | head -n 1 | awk '{print $2}')
$SERVER_CONNECTION kill -9 $PID
#usunac plik z .jar
$SERVER_CONNECTION rm /home/ubuntu/suplementselector.jar
#upload pliku na serwer
scp -i ~/.ssh/suplementslectorkey.pem ../target/server-0.0.1-SNAPSHOT.jar ubuntu@ec2-3-17-4-120.us-east-2.compute.amazonaws.com:/home/ubuntu/suplementselector.jar




#uruchomienie pliku na serwerze


$SERVER_CONNECTION 'java -jar suplementselector.jar > log.txt &'
