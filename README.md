# warehouse-microservice
## Project overview 



## Tech stack 
+ Microservices 
    + Spring cloud config server
    + Eureka server 
    + Messaging: RabbitMQ 
+ Spring boot 
+ Spring data 
+ Spring cloud 
+ Messaging 
+ Container: Docker 
+ Database: MySQL, MongoDB 


## Service 
+ Account service 
    + Account service cassandra keyspace configuration 
        +  `CREATE KEYSPACE accountEventKeyspace WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};
            CREATE KEYSPACE productCatalogEventKeyspace WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};
            CREATE KEYSPACE purchaseOrderEventKeyspace WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};`


## How to run 



