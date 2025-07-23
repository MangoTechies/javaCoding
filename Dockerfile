# ----- Build Stage -----
FROM eclipse-temurin:21-jdk AS builder

WORKDIR /app

# Copy necessary files
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
COPY src ./src

# Make mvnw executable and build
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# ----- Runtime Stage -----
FROM eclipse-temurin:21-jdk AS runtime

WORKDIR /app

# Copy final jar
COPY --from=builder /app/target/simpleapp.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
