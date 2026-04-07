/*ANGEL AMAGUAYA*/

package Persistencia;

import Logica.Asistente;
import Logica.Doctor;
import Logica.Horario;
import Logica.Paciente;
import Logica.Responsable;
import Logica.Turno;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    // Crear las instancias de los Jpa Controllers
    AsistenteJpaController AsisJPA = new AsistenteJpaController();
    DoctorJpaController DoctJPA = new DoctorJpaController();
    HorarioJpaController HoraJPA = new HorarioJpaController();
    PacienteJpaController PaciJPA = new PacienteJpaController();
    PersonaJpaController PersJPA = new PersonaJpaController();
    ResponsableJpaController RespJPA = new ResponsableJpaController();
    TurnoJpaController TurnJPA = new TurnoJpaController();
    UsuarioJpaController UsuaJPA = new UsuarioJpaController();
    
    // Crear los Metodos CRUD
    
    // Con la clase Usuario
    
    // CREATE - USUARIO
    public void CrearUsuario(Usuario usu) {
        UsuaJPA.create(usu);
    }
    
    // READ - USUARIO
    public List<Usuario> LeerUsuario() {
        return UsuaJPA.findUsuarioEntities();
    }

    // UPDATE - USUARIO
    public Usuario TraerUsuario(int id) {
        return UsuaJPA.findUsuario(id);
    }
    public void ActualizarUsuario(Usuario usu) {
        try {
            UsuaJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // DELETE - USUARIO
    public void EliminarUsuario(int id) {
        try {
            UsuaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Con la clase Doctor
    
    // CREATE - DOCTOR
    public void CrearDoctor(Doctor doc) {       
        DoctJPA.create(doc);     
    }
    
    // READ - DOCTOR
    public List<Doctor> LeerMedicos() {    
        return DoctJPA.findDoctorEntities();     
    }
    
    // UPDATE - DOCTOR
    public Doctor TraerDoctor(int id) {
        return  DoctJPA.findDoctor(id);
    }
    public void ActualizarDoctor(Doctor doc) {    
        try {
            DoctJPA.edit(doc);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    // DELETE - DOCTOR
    public void EliminarDoctor(int id) {       
        try {
            DoctJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Con la clase Paciente
    
    // CREATE - PACIENTE
    public void CrearPaciente(Paciente pacien) {        
        PaciJPA.create(pacien);
    }
    
    // READ - PACIENTE
    public List<Paciente> LeerPacientes() {       
        return PaciJPA.findPacienteEntities();       
    }
    
    // UPDATE - PACIENTE
    public Paciente TraerPaciente(int id) {       
        return PaciJPA.findPaciente(id);
    }
    public void ActualizarPaciente(Paciente pacien) {
        try {
            PaciJPA.edit(pacien);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // DELETE - PACIENTE
    public void EliminarPaciente(int id) {       
        try {
            PaciJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Con la clase Responsable
    
    // CREATE - RESPONSABLE
    public void CrearResponsable(Responsable resp) {   
        RespJPA.create(resp);   
    }
    
    // READ - RESPONSABLE
    public List<Responsable> LeerResponsables() {       
        return RespJPA.findResponsableEntities();       
    }
    
    // UPDATE - RESPONSABLE
    public Responsable TraeResponsable(int id) {       
        return RespJPA.findResponsable(id);
    }
    public void ActualizaResponsable(Responsable resp) {      
        try {
            RespJPA.edit(resp);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // DELETE - RESPONSABLE
    public void EliminaResponsable(int id) {       
        try {
            RespJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Con la clase Asistente
    
    // CREATE - ASISTENTE
    public void CrearAsistente(Asistente asis) {       
        AsisJPA.create(asis);       
    }
    
    // READ - ASISTENTE
    public List<Asistente> LeerAsistentes() {       
        return AsisJPA.findAsistenteEntities();
    }
    
    // UPDATE - ASISTENTE
    public Asistente TraerAsistente(int id) {  
        return  AsisJPA.findAsistente(id);
    }
    public void ActualizarAsistente(Asistente asis) {
        try {
            AsisJPA.edit(asis);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // DELETE - ASISTENTE
    public void EliminarAsistente(int id) {    
        try {
            AsisJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Con la clase Turno
    
    // CREATE - TURNO
    public void CrearTurno(Turno turn) {      
        TurnJPA.create(turn);     
    }
    
    // READ - TURNO
    public List<Turno> LeerTurnos() {       
        return TurnJPA.findTurnoEntities();
    }
    
    // UPDATE - TURNO
    public Turno TraerTurno(int id) {       
        return TurnJPA.findTurno(id);
    }
    public void ActualizarTurno(Turno turn) {    
        try {
            TurnJPA.edit(turn);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // DELETE - TURNO
    public void EliminarTurno(int id) {   
        try {
            TurnJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------
    
    // Con la clase Horario
    
    // CREATE - HORARIO
    public void CrearHorario(Horario hora) {    
        HoraJPA.create(hora);     
    }
    
    // READ - HORARIO
    public List<Horario> LeerHorarios() {        
        return  HoraJPA.findHorarioEntities();
    }
    
    // UPDATE - HORARIO
    public Horario TraerHorario(int id) {       
        return HoraJPA.findHorario(id);
    }
    public void ActualizarHorario(Horario hora) {     
        try {
            HoraJPA.edit(hora);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // DELETE - HORARIO
    public void EliminarHorario(int id) {   
        try {
            HoraJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }   
 
}
