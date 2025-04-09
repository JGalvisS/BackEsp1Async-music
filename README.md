# 🎶 BackEsp1Async-music

Proyecto de backend en **Java con Spring Boot 3** utilizando una **arquitectura de microservicios**. Este proyecto fue desarrollado como **ejercicio académico para la carrera de Especialización Backend** en **Digital House**.

---

## 🧩 Arquitectura del proyecto

El sistema se compone de los siguientes microservicios:

- `config-server`: Servidor central de configuración.
- `eureka-server`: Registro de servicios (Service Discovery).
- `gateway`: Puerta de entrada a los servicios.
- `music-service`: Microservicio de gestión de canciones.
- `playlist-service`: Microservicio de gestión de playlists.

Todos los servicios están orquestados utilizando Spring Cloud y registrados en Eureka.

---

## 🧰 Tecnologías utilizadas

- Java 19
- Spring Boot 3
- Spring Cloud Config
- Spring Cloud Netflix Eureka
- Spring Gateway
- Docker & Docker Compose
- MySQL
- Postman

---

## 📁 Configuración de los archivos externos

El `config-server` utiliza un repositorio externo con los archivos `application.yml` de cada microservicio:

🔗 [Repositorio de configuración](https://github.com/JGalvisS/repaso-config-Backend1Esp)

Este repositorio debe estar disponible para que `config-server` pueda leer las configuraciones.

---

## 📦 Requisitos previos

Antes de ejecutar este proyecto, asegúrate de tener instalado:

- Java 19
- Maven
- Docker y Docker Compose
- MySQL (si no usas Docker)
- Postman (para ejecutar pruebas)

---

## 🚀 Pasos para ejecutar el proyecto

### 1. Clonar este repositorio

```bash
git clone https://github.com/JGalvisS/BackEsp1Async-music.git
cd BackEsp1Async-music
```

### 2. Levantar el contenedor de MySQL

En la carpeta `docker/` hay un archivo `docker-compose.yml`. Ejecuta:

```bash
docker-compose up -d
```

Esto iniciará un contenedor de MySQL con las configuraciones necesarias y persistencia de datos.

---

### 3. Levantar los microservicios (en orden)

- a) Config Server

- b) Eureka Server

- c) Gateway

- d) Music Service

- e) Playlist Service


---

## 🧪 Pruebas de integración

El repositorio incluye una colección de pruebas de integración con Postman para comprobar el funcionamiento de los endpoints de los servicios.

📁 Archivo: `BackEndAsyncEspecializacion1.postman_collection.json`

Puedes importarlo en Postman para probar los siguientes casos:

- Crear canciones (`music-service`)
- Consultar canciones
- Crear playlists (`playlist-service`)
- Consultar playlists

Cada prueba incluye una respuesta de ejemplo como resultado esperado.

---

## 📎 Notas importantes

- El `config-server` debe iniciarse antes que cualquier otro microservicio.
- Todos los servicios deben estar correctamente registrados en **Eureka** para su correcto funcionamiento.
- El archivo `application.yml` de cada microservicio se encuentra en el repositorio de configuración externo y es leído automáticamente por el `config-server`.

---

## 🧑‍💻 Autor

Desarrollado por [@JGalvisS](https://github.com/JGalvisS)  
📚 Proyecto académico para **Digital House - Especialización Backend**

---
