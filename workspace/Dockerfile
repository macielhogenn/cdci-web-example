FROM java:8-jre
MAINTAINER Maciel Hogenn

RUN mkdir /usr/local/hello
WORKDIR /usr/local/hello

ADD build/libs/*.jar /usr/local/hello/hello.jar
ADD build/libs/lib/*.jar /usr/local/hello/lib/

ENV HELLO_REST_API_VERSION=1.0.0-SNAPSHOT

EXPOSE 8080

LABEL description="The Hello REST API server."

CMD ["java", "-jar", "hello.jar"]