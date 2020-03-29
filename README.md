# micro-services-repository
Projeto destinado a trabalhar com diversos micro services , usando Spring data Cloud , Spring configuration , Eureka Server 


# create many instances to test your micro services instances

# loja
mvn spring-boot:run  -Dspring-boot.run.arguments=--server.port=8085
mvn spring-boot:run  -Dspring-boot.run.arguments=--server.port=8086
mvn spring-boot:run  -Dspring-boot.run.arguments=--server.port=8087


# fornecedor
mvn spring-boot:run  -Dspring-boot.run.arguments=--server.port=8088
mvn spring-boot:run  -Dspring-boot.run.arguments=--server.port=8089
mvn spring-boot:run  -Dspring-boot.run.arguments=--server.port=8090




