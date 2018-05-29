FROM openjdk:8-jre
COPY ./build/distributions/temp_converter-1.0-SNAPSHOT /temp_converter
WORKDIR /temp_converter
RUN groupadd -g 1000 app && useradd -m -u 1001 -g app app
USER 1001
EXPOSE 7000
CMD java -jar temp_converter-1.0-SNAPSHOT.jar
