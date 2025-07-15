# Use an official OpenJDK image as the base
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project files into the container
COPY . /app

# Install Maven and bash
RUN apt-get update && \
    apt-get install -y maven bash && \
    rm -rf /var/lib/apt/lists/*

# Set bash as the default shell (optional, for interactive use)
SHELL ["/bin/bash", "-c"]

# Run tests using Maven
CMD ["bash", "-c", "ls -l src/test/java && mvn test -Dsurefire.useFile=false"]