# 🩺 Gestión de Consultorio Médico

Este es un sistema basado en la web para la gestión integral de un consultorio médico, que permite administrar la información de pacientes, médicos, turnos y personal administrativo.

## 🚀 Inicio Rápido

### Requisitos previos:
- **Java 17 o superior**
- **Maven**
- **Base de Datos:** MySQL (con soporte JPA)
- **Servidor:** Apache Tomcat 9/10

### Instalación:
1. Clonar el repositorio.
2. Configurar la base de datos en el archivo `persistence.xml` dentro de `src/main/resources/META-INF`.
3. Ejecutar `mvn clean install` para construir el proyecto.
4. Desplegar el archivo `.war` generado en el servidor Tomcat.

---

## 🏛️ Documentación de Arquitectura

Para un análisis detallado sobre el diseño técnico y la arquitectura del sistema, consulte el siguiente documento:

👉 **[Documentación de Arquitectura y Guía Visual](./docs/ARCHITECTURE.md)**

---

## ✨ Características Principales

- **Gestión de Entidades:** Control completo sobre Médicos, Pacientes, Turnos y Usuarios.
- **Acceso Directo:** Sistema de autenticación seguro.
- **Consultas Dinámicas:** Visualización organizada de datos a través de tablas dinámicas.
- **Interfaz Responsiva:** Basado en SB Admin 2, compatible con dispositivos móviles y escritorio.

---

## 📐 Capas del Sistema

- **Capa de Negocio:** Lógica central y procesamiento de datos.
- **Capa de Persistencia:** Manejo transparente de la base de datos con JPA.
- **Capa de Presentación:** Interfaz de usuario intuitiva mediante JSP.

---

Desarrollado para la eficiencia operativa en entornos sanitarios.
