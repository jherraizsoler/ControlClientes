
**                 Readme realizado por Jorge Herraiz Soler                   **

# **_GymFlow_**


##    ¿Por que? 

El propósito principal de la aplicación GymTrack Management System es proveer una solución integral y moderna para la 
gestión de gimnasios, optimizando las operaciones diarias y mejorando el control sobre la base de clientes. 
La aplicación permite a los administradores registrar, actualizar y consultar de forma eficiente la información de cada 
cliente, incluyendo sus datos personales, cantidad de cada membresia membresías. Al combinar un potente backend con 
tecnologías de vanguardia como Spring Boot y MySQL con un frontend web dinámico y elegante construido con JSF 
y PrimeFaces, la aplicación no solo asegura la integridad de los datos, sino que también ofrece una experiencia de 
usuario superior, facilitando la administración del gimnasio y el seguimiento de los socios de manera profesional y efectiva.

##   Tecnologias

Frontend (Interfaz de Usuario Web)

* JSF (JavaServer Faces): Framework de componentes de interfaz de usuario. Los archivos .xhtml son la base de la interfaz de usuario.
* PrimeFaces: Es una librería de componentes JSF que proporciona widgets interactivos y un diseño moderno para la interfaz del gimnasio.
* HTML, CSS, JavaScript: Las tecnologías web estándar subyacentes que JSF y PrimeFaces utilizan para renderizar la interfaz en el navegador.


Backend (Lógica de Negocio y Persistencia)

* Spring Boot: Framework principal de la aplicación Java, que gestiona el arranque, la configuración y el despliegue del sistema.
* JPA (Java Persistence API): Utilizado para la capa de persistencia, facilitando la conexión y las operaciones con la base de datos de clientes.
* MySQL: La base de datos relacional donde se almacena toda la información del gimnasio.
* Lombok: Una librería que reduce el código repetitivo en las clases Java, como la creación de getters y setters.
* Tomcat: El servidor web embebido que Spring Boot utiliza por defecto para alojar y ejecutar la aplicación web, sirviendo
  las páginas y gestionando las peticiones HTTP.

##  Procedimiento para iniciar desde cero este proyecto fullstack Sistemas de tareas.


### REQUERIMIENTOS  TECNICOS  Y  PRACTICOS

1. Tener IntelliJ IDEA 2023.3.4 (Community Edition)
   Runtime version: 17.0.10+1-b1087.17 amd64
   VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
   Lombook Plugin (233.14475.39)
 
2. Tener instalado el SDK java -  21 Oracle OpenJDK version 21.0.7



### PROCEDIMIENTO  START   PROYECT   FULLSTACK   SISTEMA DE TAREAS 

1. Tener instalado MySQL Workbench 8.0.42  (Community Version)

2. Dentro de MySQL Workbench crear Schema con el nombre zona_fit_db

3. Dentro de MySQL Workbench en Server > Data Import  seleccionar la carpeta que esta en Documentation que se llama importarBD_zonaFit y darle a importar

4. En IntelliJ IDEA tenemos 3 archivos
   
   - ZonaFitConsole   (Version Consola)
     + Descomentar @SpringBootApplication en la clase ZonaFitConsole
     + Comentar @SpringBootApplication en la clase ZonaFitSwing y comentar @Component en la linea 16 de la clase ZonaFitForma
     + Comentar @SpringBootApplication en la clase ZonaFitWeb
     
   - ZonaFitSwing     (Version Desktop)
     + Descomentar @SpringBootApplication en la clase ZonaFitSwing
     + Descomentar linea 16 de la clase ZonaFitForma  @Component
     + Comentar @SpringBootApplication en la clase ZonaFitConsole
     + Comentar @SpringBootApplication en la clase ZonaFitWeb
     
   - ZonaFitWeb       (Version Web)
     + Descomentar @SpringBootApplication en la clase ZonaFitWeb
     + Comentar @SpringBootApplication en la clase ZonaFitSwing y comentar @Component en la linea 16 de la clase ZonaFitForma
     + Comentar @SpringBootApplication en la clase ZonaFitConsole
     
     Acceso por URL en el navegador =  http://localhost:8080/index.xhtml
    
     Seleccionas un archivo el que quieras ejecutar y lanzar, descomentas @SpringBootApplication y 
     en los otros dos archivos tiene que estas comentado @SpringBootApplication y despues ejecutar la clase (darle a run()) 

   ** Esto se realiza para que sepa que es lo que tiene que ejecutar como una aplicacion si no dará error.
  
