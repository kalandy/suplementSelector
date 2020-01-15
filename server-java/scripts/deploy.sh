#!/bin/bash
SERVER_ADDRESS=ubuntu@ec2-52-14-145-69.us-east-2.compute.amazonaws.com
SSH_KEY=~/.ssh/suplementselector.pem
SERVER_CONNECTION="ssh -i $SSH_KEY $SERVER_ADDRESS"
cd ../
mvn clean install
#zabic proces jezeli istnieje
PID=$($SERVER_CONNECTION ps aux | grep java | head -n 1 | awk '{print $2}')
$SERVER_CONNECTION kill -9 $PID
#usunac plik z .jar
$SERVER_CONNECTION rm /home/ubuntu/suplementselector.jar
#upload pliku na serwer
scp -i $SSH_KEY target/server-0.0.1-SNAPSHOT.jar $SERVER_ADDRESS:/home/ubuntu/suplementselector.jar




#uruchomienie pliku na serwerze


$SERVER_CONNECTION 'java -jar suplementselector.jar > log.txt &'
