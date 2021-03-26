FROM java:8
EXPOSE 8080
ADD /target/mapleliv-feign-1.jar mapleliv-feign.jar
ENTRYPOINT ["java","-jar","mapleliv-feign.jar"]