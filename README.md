# Temperature Converter Service

## Service Implementation

The service is implemented using [Javalin](https://javalin.io/) framework using Java language.

The project is setup using IngelliJ and Gradle

To build:

`./gradlew build`

unzip the build/distributions/temp_converter-1.0-SNAPSHOT.zip

The project is also dockerized. To start the service locally:

`docker-compose up`

## Deploy to Kubernetes (need privilege to the dev cluster)

`kubectl create -f deployment.yaml`
`kubectl create -f service.yaml`
`kubectl create -f ingress.yaml`

## Using the service

If deployed locally:

`localhost:7000/c2f/?temp=<temperature to be converted>`
`localhost:7000/f2c/?temp=<temperature to be converted>`

If deployed to Kubernetes

`https://temp-convert.ae.dev.us-east-1.k8s.appianci.net/c2f/?temp=<temperature to be converted>`
`https://temp-convert.ae.dev.us-east-1.k8s.appianci.net/f2c/?temp=<temperature to be converted>`
