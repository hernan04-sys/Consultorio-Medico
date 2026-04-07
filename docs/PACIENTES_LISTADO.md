# 👥 Listado de Pacientes

Permite la administración y visualización de todos los pacientes atendidos en el consultorio.

## 📸 Visualización de Datos
![Lista de Pacientes](./img/patient_list.jpeg)

## 🛠️ Detalles de Implementación

- **Visualización:**
  - Tabla dinámica generada con JSP.
  - Columnas: DNI, Nombre, Apellido, Fecha de Nacimiento, Obra Social.
- **Acciones Disponibles:**
  - **Editar:** Abre el formulario de actualización (`actualizarPaciente.jsp`).
  - **Eliminar:** Realiza la baja lógica/física del paciente (`SrvElimPaciente.java`).
- **Tecnologías:** Combinación de `SvrPacientes.java` para obtener la lista y `mostrarPaciente.jsp` para el renderizado.
