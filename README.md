# base-app
spring boot app for testing on server

# run locally
mvnw spring-boot:run

# package
generates a fat jar 
mvnw package

# run jar
java -Dspring.profiles.active=production -jar target/crowe-0.0.1-SNAPSHOT.jar
