# distributed-logging-microservice-zipkin-slueth

Zipkin Url : http://localhost:9411/
First run zipkin in local using docker

dependencies: slueth and zipkin
Configuration:
in properties file:
```
spring.zipkin.base-url=http://localhost:9411
spring.sleuth.sampler.probability=1.0
```

Usually, in logs you will see, [,trace-id, span-id,]
trace-id - it will be same for all the mricroservice call
span-id - it changes as per microservices
