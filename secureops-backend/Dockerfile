FROM openjdk:17-jdk-slim

# Install netcat for wait-for-mongo.sh
RUN apt-get update && apt-get install -y netcat && rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Copy JAR and wait script
COPY target/secureops-backend-0.0.1-SNAPSHOT.jar app.jar
COPY wait-for-mongo.sh .

# Make script executable
RUN chmod +x wait-for-mongo.sh

# Expose port
EXPOSE 8080

# Use wait-for script to delay startup
ENTRYPOINT ["./wait-for-mongo.sh"]