FROM openjdk:8-jdk-alpine
VOLUME /tmp

ENV PORT 8080
ENV HOST 0.0.0.0

EXPOSE 8080

#ADD attach_db.sh /tmp/attach_db.sh
#RUN /tmp/attach_db.sh

ARG JAR_FILE
COPY build/libs/main-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
