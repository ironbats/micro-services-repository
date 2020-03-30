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


# agregador de logs 
 papertrail  -- > https://papertrailapp.com  : free e registra log ate 7 dias  </br>
 para tornar os logs mais rastreaveis ,e ficarem mais visiveis utilizaremos o  : </br>
 Spring Sleuth , que nos ajudara a identificar e formatar melhor os nossos logs   --> https://cloud.spring.io/spring-cloud-static/spring-cloud-sleuth/2.2.2.RELEASE/reference/html/


# Spring tecnologias
* Spring Tecnologias 
  - Spring cloud
  - Lombok
  - Sleuth
  - Spring data JPA/Hibernate
  - Hystrix/Netflix tecnologia
  - Eureka
  - slf4j 


# objetivo 
 Passar conhecimento as pessoas e conceito de micro servicos .







