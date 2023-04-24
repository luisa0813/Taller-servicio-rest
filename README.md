# Taller-servicio-rest

Biblioteca Basica

Es una API REST realizada en Spring Boot, que permite gestionar el inventario de una biblioteca

Hermientas
-JAVA (Versión 17)
-Spring Boot
Basese de datos:h2 
http://localhost:8080/h2-console
![image](https://user-images.githubusercontent.com/130800990/234017814-35d2576a-5e83-4bb3-b843-96c75c9b292a.png)



DEPENDENCIAS SPRING BOOT
-Spring Web
-Lombok
-h2 Database
-Spring Data JPA

Ejecucion del servicio Rest

Endpoint Usuario:

POST: http://localhost:8080/usuario

{
	
	"cedula": 123,
	"nombre": "luisa",
	"fechaNacimiento": "1997-08-15"
}

GET: http://localhost:8080/usuario

PUT: http://localhost:8080/usuario
{
	"id":1,
	"cedula": 123,
	"nombre": "luis",
	"fechaNacimiento": "1997-08-15"
}

DELETE: http://localhost:8080/usuario

Enpoint Libro:
POST: http://localhost:8080/libro
{
	
	"autor": "gabriel",
	"fecha": "2021-04-22",
	"nombre": "prueba1",
	"estado":"prestado",
	"vecesPrestadas": 1
	
}

GET
http://localhost:8080/libro
Lista todos los libros
http://localhost:8080/libro/1
Hace la busqueda de un libro en especifico y trae la informacion del usuario que lo tiene prestado en caso de que este prestado

PUT http://localhost:8080/libro/1

DELETE http://localhost:8080/libro/1

ESTADO PROYECTO
En desarrollo



