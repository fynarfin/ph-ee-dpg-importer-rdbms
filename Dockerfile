FROM openjdk:17
EXPOSE 8080

COPY build/libs/*.jar ./
CMD java -jar ph-ee-dpg-importer-rdbms-1.0.0-SNAPSHOT.jar
