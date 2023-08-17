FROM  openjdk:11
EXPOSE 9090
ADD   target/DockerFile.jar  DockerFile
ENTRYPOINT ["java","-jar","Dockerfile"]