FROM openjdk:17

COPY target/gt_docker_app.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","gt_docker_app.jar"]