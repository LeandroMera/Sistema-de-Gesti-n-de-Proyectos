# 🏢 Sistema de Gestión de Proyectos

![Banner](https://img.shields.io/badge/Sistema-GestionProyectos-blue)  

Sistema web para la **gestión de departamentos, empleados y proyectos**, desarrollado con **Spring Boot**, **Thymeleaf** y **Bootstrap**.  

---

## 📌 Tecnologías Utilizadas

- **Java 17+**  
- **Spring Boot** (MVC, Web)  
- **MyBatis** (Persistencia de datos)  
- **Thymeleaf** (Vistas dinámicas)  
- **Bootstrap 4** (Diseño responsive)  
- **Maven** (Gestión de dependencias)  
- **Base de datos**: MySQL / H2  

---

## 🗂 Estructura del Proyecto

text
gestionador-de-proyectos/
│
├── src/main/java/org/gorditodev/gestionadordeproyectos
│   ├── controllers
│   │   └── DepartamentoController.java
│   ├── mappers
│   │   └── DepartamentoMapper.java
│   ├── model
│   │   ├── Departamento.java
│   │   ├── Empleado.java
│   │   └── Proyecto.java
│   └── GestionadorDeProyectosApplication.java
│
├── src/main/resources/templates
│   └── departamentos
│       ├── crearDepartamento.html
│       ├── editarDepartamento.html
│       ├── listarDepartamentos.html
│       └── detallesDepartamento.html
│
├── src/main/resources/application.properties
└── pom.xml


💻 Funcionalidades Principales
1. Departamentos

Crear, editar, listar y ver detalles de departamentos.

Cada departamento tiene:

ID

Nombre

Ubicación

Vista Lista de Departamentos

Formulario Crear Departamento

Formulario Editar Departamento

Detalles del Departamento

2. Empleados (en desarrollo)

Registrar y editar empleados.

Asignación de proyectos y departamentos.

Vista Lista de Empleados (simulada)

3. Proyectos (en desarrollo)

Crear proyectos y asignar empleados.

Visualización de empleados asignados a cada proyecto.

Vista Lista de Proyectos (simulada)

🛠 Funcionalidades Técnicas

Uso de MyBatis para consultas SQL personalizadas.

Plantillas Thymeleaf para vistas dinámicas.

Navegación responsiva con Bootstrap.

Formularios con validación mínima (Thymeleaf + HTML5).

Navegación principal con enlaces a Departamentos, Empleados y Proyectos.

🚀 Cómo Ejecutar

Clonar el repositorio:

git clone https://github.com/tuusuario/gestion-de-proyectos.git
cd gestionador-de-proyectos


Configurar base de datos en application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/gestion_proyectos
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update


Ejecutar el proyecto:

mvn spring-boot:run


Abrir en el navegador:

http://localhost:8080/departamentos

🎯 Mejoras Futuras

Gestión completa de empleados y proyectos con asignaciones entre ellos.

Exportación de datos a PDF y Excel.

Paginación y búsqueda avanzada en listas.

Seguridad y autenticación de usuarios.💻 Funcionalidades Principales
1. Departamentos

Crear, editar, listar y ver detalles de departamentos.

Cada departamento tiene:

ID

Nombre

Ubicación

Vista Lista de Departamentos

Formulario Crear Departamento

Formulario Editar Departamento

Detalles del Departamento

2. Empleados (en desarrollo)

Registrar y editar empleados.

Asignación de proyectos y departamentos.

Vista Lista de Empleados (simulada)

3. Proyectos (en desarrollo)

Crear proyectos y asignar empleados.

Visualización de empleados asignados a cada proyecto.

Vista Lista de Proyectos (simulada)

🛠 Funcionalidades Técnicas

Uso de MyBatis para consultas SQL personalizadas.

Plantillas Thymeleaf para vistas dinámicas.

Navegación responsiva con Bootstrap.

Formularios con validación mínima (Thymeleaf + HTML5).

Navegación principal con enlaces a Departamentos, Empleados y Proyectos.

🚀 Cómo Ejecutar

Clonar el repositorio:

git clone https://github.com/tuusuario/gestion-de-proyectos.git
cd gestionador-de-proyectos


Configurar base de datos en application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/gestion_proyectos
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update


Ejecutar el proyecto:

mvn spring-boot:run


Abrir en el navegador:

http://localhost:8080/departamentos

🎯 Mejoras Futuras

Gestión completa de empleados y proyectos con asignaciones entre ellos.

Exportación de datos a PDF y Excel.

Paginación y búsqueda avanzada en listas.

Seguridad y autenticación de usuarios.

💻 Funcionalidades Principales
1. Departamentos

Crear, editar, listar y ver detalles de departamentos.

Cada departamento tiene:

ID

Nombre

Ubicación

Vista Lista de Departamentos

Formulario Crear Departamento

Formulario Editar Departamento

Detalles del Departamento

2. Empleados (en desarrollo)

Registrar y editar empleados.

Asignación de proyectos y departamentos.

Vista Lista de Empleados (simulada)

3. Proyectos (en desarrollo)

Crear proyectos y asignar empleados.

Visualización de empleados asignados a cada proyecto.

Vista Lista de Proyectos (simulada)

🛠 Funcionalidades Técnicas

Uso de MyBatis para consultas SQL personalizadas.

Plantillas Thymeleaf para vistas dinámicas.

Navegación responsiva con Bootstrap.

Formularios con validación mínima (Thymeleaf + HTML5).

Navegación principal con enlaces a Departamentos, Empleados y Proyectos.

🚀 Cómo Ejecutar

Clonar el repositorio:

git clone https://github.com/tuusuario/gestion-de-proyectos.git
cd gestionador-de-proyectos


Configurar base de datos en application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/gestion_proyectos
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update


Ejecutar el proyecto:

mvn spring-boot:run


Abrir en el navegador:

http://localhost:8080/departamentos

🎯 Mejoras Futuras

Gestión completa de empleados y proyectos con asignaciones entre ellos.

Exportación de datos a PDF y Excel.

Paginación y búsqueda avanzada en listas.

Seguridad y autenticación de usuarios.
