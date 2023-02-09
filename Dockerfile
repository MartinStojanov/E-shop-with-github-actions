FROM openjdk:11
ADD target/e-shop-springboot.jar e-shop-springboot.jar
ENTRYPOINT ["java", "-jar","e-shop-springboot.jar"]
EXPOSE 9090