FROM  openjdk:11
EXPOSE 9090
ADD   target/docker-spring-boot-greet.jar     docker-spring-boot-greet
ENTRYPOINT ["java","-jar","docker-spring-boot-greet"]