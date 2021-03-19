In this example I have used H2 as in memory database and rest web services are exposed Postman . Project can be executed as follows:

mvn clean
mvn install
mvn spring-boot:run
After the project is up and running DB:

DB

Access localhost:202/h2-console with schema jdbc:h2:mem:testdb connect and see tables data.
Services

Movies

GET http://localhost:2021/api/movies
GET http://localhost:2021/api/movies/watched
POST http://localhost:2021/api/movies
PUT http://localhost:2021/api/movies/{id}
DELETE http://localhost:2021/api/movies/{id}
