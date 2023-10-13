FROM adoptopenjdk/openjdk15:ubi

WORKDIR /app

COPY build/libs/*SNAPSHOT.jar app.jar

EXPOSE 8082

CMD ["java","-jar","app.jar"]
