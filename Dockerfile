FROM openjdk:11
COPY . .
RUN ./test/gradlew -p ./test test
