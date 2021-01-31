FROM openjdk:16-jdk-alpine

LABEL maintainer="gubbaraviteja@gmail.com"

COPY target/CuisineDiaryApi-0.0.1-SNAPSHOT.jar /usr/app/
COPY src/main/resources/db/cuisinediarydb.mv.db /usr/app/src/main/resources/db/cuisinediarydb.mv.db

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "CuisineDiaryApi-0.0.1-SNAPSHOT.jar"]
