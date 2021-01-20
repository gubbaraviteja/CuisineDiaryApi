FROM openjdk:16-jdk-alpine

LABEL maintainer="gubbaraviteja@gmail.com"

COPY target/CuisineDiaryApi-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "CuisineDiaryApi-0.0.1-SNAPSHOT.jar"]
