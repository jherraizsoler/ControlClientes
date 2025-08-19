
** Readme realizado por Jorge Herraiz Soler                 **

# **_Control de Clientes_**

---

##    ¿Por qué?

El propósito de esta aplicación web es proveer una solución robusta y moderna para la gestión de clientes. Combina un potente backend desarrollado con **Spring Boot** y **MySQL** con un frontend dinámico y visualmente atractivo construido con **Thymeleaf** y librerías como **Bootstrap y Font Awesome**.

La aplicación no solo permite registrar, actualizar y consultar la información de cada cliente, sino que también incluye características avanzadas como la **internacionalización** en múltiples idiomas y una gestión de seguridad integral con **roles de usuario**. Esto asegura que solo los usuarios autorizados puedan editar y eliminar datos, garantizando la integridad de la información. La combinación de estas tecnologías y funcionalidades ofrece una experiencia de usuario superior, facilitando la administración de la base de clientes de forma profesional y efectiva.

---

##    Tecnologías

### Frontend (Interfaz de Usuario Web)

* **Thymeleaf:** Motor de plantillas que permite generar páginas web dinámicas desde el servidor.
* **Bootstrap 5:** Framework de CSS utilizado para crear un diseño moderno y totalmente responsivo.
* **Font Awesome:** Librería de íconos que enriquece la interfaz de usuario con elementos visuales.
* **Webjars:** Para la gestión de dependencias frontend como Bootstrap y Font Awesome de manera eficiente en un proyecto Java.

### Backend (Lógica de Negocio y Persistencia)

* **Spring Boot:** Framework principal de la aplicación Java que gestiona el arranque, la configuración y el despliegue del sistema de manera sencilla.
* **Spring Boot Starter Data JPA:** Facilita la implementación de la capa de persistencia y la conexión con la base de datos.
* **MySQL Connector/J:** Driver oficial para la conexión con la base de datos MySQL.
* **Spring Boot Starter Validation:** Para la validación de los datos de entrada en el servidor, asegurando la integridad de la información.
* **Lombok:** Una librería que reduce la cantidad de código repetitivo en las clases Java, como la creación de getters, setters y constructores.
* **Spring Boot Starter Security:** Provee seguridad integral para la aplicación, manejando la autenticación y la autorización.
* **Thymeleaf Extras Spring Security 6:** Permite la integración de las etiquetas de seguridad de Spring en las plantillas de Thymeleaf.

---

##    Procedimiento para iniciar desde cero este proyecto fullstack

### REQUERIMIENTOS  TÉCNICOS  Y  PRÁCTICOS

1.  Tener **NetBeans IDE** (versión reciente recomendada).
2.  Tener instalado el SDK de Java - **OpenJDK version 21**.

### PROCEDIMIENTO   START    PROYECT    FULLSTACK

1.  Tener instalado **MySQL Workbench** (versión reciente).

2.  Dentro de MySQL Workbench, crear un Schema con el nombre `test`.

3.  Importar la base de datos dentro de Documentation se encuentra importarBD_test.  
    Dentro de MySQL Workbench, en `Server > Data Import`, seleccionar la carpeta 
    que contenga el archivo de la base de datos e importar.

4.  En NetBeans, abrir el proyecto y verificar que las dependencias de Maven se 
    hayan descargado correctamente.

5.  Ajustar la configuración de la base de datos en el archivo `application.properties`
    para que coincida con tus credenciales de MySQL.

6.  Ejecutar la clase principal de la aplicación gm/HolaSpringApplication.java
    (la que contiene la anotación `@SpringBootApplication`).

7.  Acceder a la aplicación desde tu navegador: `http://localhost:8080/login`

**Nota:** La aplicación cuenta con un sistema de seguridad y roles. Si intentas acceder a las páginas protegidas, se te redirigirá a la página de inicio de sesión.
En la tabla usuario tienes el nombre de usuario las contraseñas son 123 