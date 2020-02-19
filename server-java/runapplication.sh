#zabic proces jezeli istnieje
PID=$( ps aux | grep java | head -n 1 | awk '{print $2}')
kill -9 $PID
cd /home/ubuntu/suplementSelector/server-java
git pull
mvn clean install
java -jar target/server-0.0.1-SNAPSHOT.jar > log.txt &