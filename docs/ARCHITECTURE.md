# Arquitectura del Sistema - Consultorio Médico

Este documento detalla la estructura, capas y tecnologías utilizadas en el desarrollo del sistema de gestión para el **Consultorio Médico**.

## 🏗️ Estructura del Proyecto

El sistema sigue un patrón de **Arquitectura en 3 Capas**, lo que permite una separación clara de responsabilidades, facilitando el mantenimiento y la escalabilidad.

### 1. Capa de Presentación (Frontend)
Responsable de la interfaz de usuario y la interacción con el sistema.
- **Tecnologías:** JSP (JavaServer Pages), HTML5, CSS3, JavaScript.
- **Framework UI:** Basado en SB Admin 2 para un diseño responsivo y profesional.
- **Componentes:** Formularios de ingreso, tablas de visualización y paneles de control dinámicos.

### 2. Capa de Lógica de Negocio (Backend)
Contiene la inteligencia del sistema y procesa las peticiones del usuario.
- **Tecnologías:** Java Servlets.
- **Controladores:** 
  - `ControladoraLogica`: Actúa como fachada para todas las operaciones de negocio.
  - Servlets específicos por entidad (`SrvActMedico`, `SvrPacientes`, etc.) para manejar el flujo HTTP.
- **Entidades:** Clases POJO que representan el modelo de datos (`Doctor`, `Paciente`, `Turno`, etc.).

### 3. Capa de Persistencia (Base de Datos)
Encargada del almacenamiento y recuperación de la información.
- **Tecnologías:** JPA (Java Persistence API), Hibernate.
- **Mecanismo:** Uso de `JpaControllers` para abstracción de consultas SQL.
- **Controladora de Persistencia:** Punto único de acceso para la gestión de datos.

---

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java 17+
- **Gestor de Dependencias:** Maven
- **Servidor de Aplicaciones:** Apache Tomcat (recomendado)
- **Persistencia:** JPA / Hibernate
- **Frontend:** Bootstrap 4 (vía SB Admin 2)

---

> [!NOTE]
> Para ver una guía visual detallada de los módulos del sistema (Screenshots), consulte el archivo **[README.md](../README.md)** en la raíz del proyecto.
