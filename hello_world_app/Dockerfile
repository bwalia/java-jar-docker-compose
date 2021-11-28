#Base docker for compline the content 
#FROM openjdk:18-jdk-alpine3.14 As Compiler
FROM openjdk:18-oraclelinux7 As Compiler
ADD . .
RUN javac /HelloWorld/Main.java
RUN java -cp . HelloWorld.Main
RUN jar cfme /opt/Hello.jar Manifest.txt HelloWorld.Main HelloWorld/Main.class
#Main docker image that will hold jar file only
#FROM openjdk:18-jdk-alpine3.14
FROM openjdk:18-oraclelinux7
COPY --from=Compiler /opt/Hello.jar /opt/
CMD java  -jar /opt/Hello.jar & sleep 10000
