FROM openjdk:17
EXPOSE 8080
ADD target/spring-argocd-app.jar spring-argocd-app.jar
ENTRYPOINT ["java","-jar","/spring-argocd-app.jar"]