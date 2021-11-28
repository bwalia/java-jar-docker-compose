FROM maven:3.8.4-openjdk-8-slim As Compiler
ADD . .
RUN cd my-app && mvn package

#Main docker image that will hold jar file only
FROM  openjdk:8-oraclelinux7
COPY --from=Compiler /my-app/target/my-app-1.0-SNAPSHOT.jar /opt/
CMD java  -jar /opt/my-app-1.0-SNAPSHOT.jar & sleep 10000

