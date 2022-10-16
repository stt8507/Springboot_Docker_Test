FROM openjdk:8-jdk-alpine
WORKDIR /project/Springboot_Docker_Test
RUN wget http://ftp.mirror.tw/pub/apache/maven/maven-3/3.5.4/binaries/apache-maven-3.5.4-bin.tar.gz
RUN tar -zxvf apache-maven-3.5.4-bin.tar.gz
ENV PATH=$PATH:/project/Springboot_Docker_Test/apache-maven-3.5.4/bin/

FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]