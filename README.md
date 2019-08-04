# Zuul API Gateway


## Getting started
* Zuul API Gateway could be used with Eureka and Feign Client and act as loadblancer
* It has Ribbon client support inbuilt
* Used as a proxy and aggregation point for all the APIs
* Could be used to handle DOS attacks, checking security, send logs etc cross cutting concerns
* Have added some sample Pre, Post, Route and Error filters

## Install

```
	mvn clean package
```

## Running Test

```
	TBD
```

### Running the microservice

```
	java -jar zuul-api-gateway-0.0.1-SNAPSHOT.jar -Dspring.profiles.active=local
```
#
