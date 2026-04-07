# 🔐 Módulo de Acceso (Login)

Este módulo es la puerta de entrada al sistema del **Consultorio Médico**. Garantiza que solo el personal autorizado pueda acceder a la gestión de datos sensibles de los pacientes y la clínica.

## 📸 Interfaz de Login
![Login](./img/login.jpeg)

## 🛠️ Detalles de Implementación

- **Componentes:**
  - Campo de Usuario (Email/DNI).
  - Campo de Contraseña con encriptación básica.
  - Botón de Entrar.
- **Backend:**
  - Gestionado por el `SrvLogin.java`.
  - Verifica las credenciales consultando la entidad `Usuario` a través de la `ControladoraLogica`.
- **Seguridad:**
  - Manejo de sesiones HTTP.
  - Redirección automática en caso de error de autenticación (`errLogin.jsp`).
