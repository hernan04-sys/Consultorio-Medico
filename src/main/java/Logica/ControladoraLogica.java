/*ANGEL AMAGUAYA*/

package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControladoraLogica {
    
    // Instanciar la controladora de la Persistencia
    ControladoraPersistencia Ctrl_Pers = new ControladoraPersistencia();
    
    // Crear los Metodos CRUD
    
    // Para la clase Usuario
    
    // CREATE - USUARIO
    public void crearusuario(String nombre_usuario, String contrasenia_usuario) {
        Usuario usu = new Usuario();
        usu.setNombre_usuario(nombre_usuario);
        usu.setContrasenia_usuario(contrasenia_usuario);
        Ctrl_Pers.CrearUsuario(usu);   
    }
    
    // READ - USUARIO
    public List <Usuario> leerusuario() {
        return Ctrl_Pers.LeerUsuario();
    }
    
    // UPDATE - USUARIO
    public Usuario traerusuario(int id) {
        return Ctrl_Pers.TraerUsuario(id);
    }
    public void actualizarusuario(Usuario usu) {
        Ctrl_Pers.ActualizarUsuario(usu);
    }
    
    // DELETE - USUARIO
    public void eliminarusuario(int id) {
        Ctrl_Pers.EliminarUsuario(id);
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Para la clase Doctor
    
    // CREATE - DOCTOR
    public void creardoctor(String nombreDoctor, String apellidoDoctor, String cedulaDoctor, String direccionDoctor, String telefonoDoctor, String correoDoctor, Date fechNacDoctor, String especialidadDoctor) {
        Doctor doc = new Doctor();
        doc.setNombres(nombreDoctor);
        doc.setApellidos(apellidoDoctor);
        doc.setCciudadania(cedulaDoctor);
        doc.setDireccion(direccionDoctor);
        doc.setTelefono(telefonoDoctor);
        doc.setCorreo_electronico(correoDoctor);
        doc.setFecha_nacimiento(fechNacDoctor);
        doc.setEspecialidad(especialidadDoctor);
        Ctrl_Pers.CrearDoctor(doc);
    }
    
    // READ - DOCTOR
    public List<Doctor> leermedicos() { 
        return Ctrl_Pers.LeerMedicos();
    }
    
    // UPDATE - DOCTOR
    public Doctor traerdoctor(int id) {
        return Ctrl_Pers.TraerDoctor(id);
    }
    public void actualizardoctor(Doctor doc) {
        Ctrl_Pers.ActualizarDoctor(doc);
    }
    
    // DELETE - DOCTOR
    public void eliminardoctor(int id) {
        Ctrl_Pers.EliminarDoctor(id);
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Para la clase Paciente
    
    // CREATE - PACIENTE
    public void crearPaciente(String nombrePaciente, String apellidoPaciente, String cedulaPaciente, String direccionPaciente, String telefonoPaciente, String correoPaciente, Date fechNacPaciente, String tieneSeguro, String tipoSangre) {  
        Paciente pacien = new Paciente();
        pacien.setNombres(nombrePaciente);
        pacien.setApellidos(apellidoPaciente);
        pacien.setCciudadania(cedulaPaciente);
        pacien.setDireccion(direccionPaciente);
        pacien.setTelefono(telefonoPaciente);
        pacien.setCorreo_electronico(correoPaciente);
        pacien.setFecha_nacimiento(fechNacPaciente);
        pacien.setTiene_seguro(tieneSeguro);
        pacien.setTipo_sangre(tipoSangre);        
        Ctrl_Pers.CrearPaciente(pacien);
    }
    
    // READ - PACIENTE
    public List<Paciente> leerpacientes() {
        return Ctrl_Pers.LeerPacientes();  
    }
    
    // UPDATE - PACIENTE
    public Paciente traerpaciente(int id) {
        return Ctrl_Pers.TraerPaciente(id);
    }
    public void actualizarpaciente(Paciente pacien) {   
        Ctrl_Pers.ActualizarPaciente(pacien);
    }
    
    // DELETE - PACIENTE
    public void eliminarpaciente(int id) {
        Ctrl_Pers.EliminarPaciente(id);
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Para la clase Responsable
    
    // CREATE - RESPONSABLE
    public void crearresponsable(String nombreResponsable, String apellidoResponsable, String cedulaResponsable, String direccionResponsable, String telefonoResponsable, String correoResponsable, Date fecNacResponsable, String tipoResponsabilidad) { 
        Responsable resp = new Responsable();
        resp.setNombres(nombreResponsable);
        resp.setApellidos(apellidoResponsable);
        resp.setCciudadania(cedulaResponsable);
        resp.setDireccion(direccionResponsable);
        resp.setTelefono(telefonoResponsable);
        resp.setCorreo_electronico(correoResponsable);
        resp.setFecha_nacimiento(fecNacResponsable);
        resp.setTipo_responsabilidad(tipoResponsabilidad);      
        Ctrl_Pers.CrearResponsable(resp);
    }
    
    // READ - RESPONSABLE
    public List<Responsable> leerresponsables() {
        return Ctrl_Pers.LeerResponsables();
    }
    
    // UPDATE - RESPONSABLE
    public Responsable traeresponsable(int id) {        
        return Ctrl_Pers.TraeResponsable(id);
    }
    public void actualizaResponsable(Responsable resp) {
        Ctrl_Pers.ActualizaResponsable(resp);
    }
    
    // DELETE - RESPONSABLE
    public void eliminaresponsable(int id) {
        Ctrl_Pers.EliminaResponsable(id);
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Para la clase Asistente
    
    // CREATE - ASISTENTE
    public void crearasistente(String nombreAsistente, String apellidoAsistente, String cedulaAsistente, String direccionAsistente, String telefonoAsistente, String correoAsistente, Date fechNacAsistente, String lugarDeTrabajo) {  
        Asistente asis = new Asistente();
        asis.setNombres(nombreAsistente);
        asis.setApellidos(apellidoAsistente);
        asis.setCciudadania(cedulaAsistente);
        asis.setDireccion(direccionAsistente);
        asis.setTelefono(telefonoAsistente);
        asis.setCorreo_electronico(correoAsistente);
        asis.setFecha_nacimiento(fechNacAsistente);
        asis.setLugar_trabajo(lugarDeTrabajo);   
        Ctrl_Pers.CrearAsistente(asis);
    }
    
    // READ - ASISTENTE
    public List<Asistente> leerasistentes() { 
        return Ctrl_Pers.LeerAsistentes();
    }
    
    // UPDATE - ASISTENTE
    public Asistente traerasistente(int id) {      
        return Ctrl_Pers.TraerAsistente(id);
    }
    public void actualizarasistente(Asistente asis) {      
        Ctrl_Pers.ActualizarAsistente(asis);
    }
    
    // DELETE - ASISTENTE
    public void eliminarasistente(int id) {   
        Ctrl_Pers.EliminarAsistente(id);
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Para la clase Turno
    
    // CREATE - TURNO
    public void crearturno(Date fechaTurno, String horaTurno) {   
        Turno turn = new Turno();
        turn.setFecha_turno(fechaTurno);
        turn.setHora_turno(horaTurno);      
        Ctrl_Pers.CrearTurno(turn);
    }
    
    // READ - TURNO
    public List<Turno> leerturnos() {  
        return Ctrl_Pers.LeerTurnos();
    }
    
    // UPDATE - TURNO
    public Turno traerturno(int id) {       
        return Ctrl_Pers.TraerTurno(id);
    }
    public void actualizarTurno(Turno turn) {       
        Ctrl_Pers.ActualizarTurno(turn);
    }
    
    // DELETE - TURNO
    public void eliminarturno(int id) {   
        Ctrl_Pers.EliminarTurno(id);
    }   
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Para la clase Horario
    
    // CREATE - HORARIO
    public void crearhorario(String horaInicial, String horaFinal) { 
        Horario hora = new Horario();
        hora.setHorario_inicial(horaInicial);
        hora.setHorario_final(horaFinal);
        Ctrl_Pers.CrearHorario(hora);
    }
    
    // READ - HORARIO
    public List<Horario> leerhorarios() {        
        return Ctrl_Pers.LeerHorarios();       
    }
    
    // UPDATE - HORARIO
    public Horario traerhorario(int id) {   
        return Ctrl_Pers.TraerHorario(id);
    }
    public void actualizarhorario(Horario hora) {   
        Ctrl_Pers.ActualizarHorario(hora);
    }
    
    // DELETE - HORARIO
    public void eliminarhorario(int id) {        
        Ctrl_Pers.EliminarHorario(id);        
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // COMPROBAR INGRESO AL SISTEMA
    public boolean comprobarIngreso(String usuario, String contrasenia) {
        
        boolean ingreso = false;
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = Ctrl_Pers.LeerUsuario();
        
        for (Usuario usu : listaUsuarios) {
            if(usu.getNombre_usuario().equals(usuario)) {
                if (usu.getContrasenia_usuario().equals(contrasenia)) {
                    ingreso = true; 
                }
                else {
                    ingreso = false;
                }
            }
        }
       return ingreso; 
    }

}