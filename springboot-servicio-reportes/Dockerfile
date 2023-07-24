FROM openjdk:17
VOLUME /tmp
EXPOSE 8091
ADD ./target/springboot-servicio-reportes-0.0.1-SNAPSHOT.jar servicio-reportes.jar
ENTRYPOINT [ "java","-jar","/servicio-reportes.jar" ]