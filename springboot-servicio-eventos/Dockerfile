FROM openjdk:17
VOLUME /tmp
ADD ./target/springboot-servicio-eventos-0.0.1-SNAPSHOT.jar servicio-eventos.jar
ENTRYPOINT [ "java","-jar","/servicio-eventos.jar" ]