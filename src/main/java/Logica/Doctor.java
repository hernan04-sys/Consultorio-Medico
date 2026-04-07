/*ANGEL AMAGUAYA*/
package Logica;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Doctor extends Persona implements Serializable{
    // Atributos
  //private int id_doctor;
    private String especialidad;
    // Relaciones 
    // Se relaciona Doctor de uno a uno con Horario (Se relaciona con la misma clase)
    @OneToOne
    private Horario unHorario;
    // Se relaciona Doctor de uno a uno con Usuario (Se relaciona con la misma clase)
    @OneToOne
    private Usuario unUsuario;
    // Se relaciona Doctor de uno a muchos con Turno (Se relaciona con una coleccion)
    // Una relacion de uno a muchos BIDIRECCIONAL significa que en ambas clases deben existir la anotaciones correspondientes
    @OneToMany(mappedBy = "doct")
    private List<Turno> listaTurnos;
    
    // Constructores
    public Doctor() {
    }

    public Doctor(String especialidad, Horario unHorario, Usuario unUsuario, List<Turno> listaTurnos, int id, String nombres, String apellidos, String cciudadania, String direccion, String telefono, String correo_electronico, Date fecha_nacimiento) {
        super(id, nombres, apellidos, cciudadania, direccion, telefono, correo_electronico, fecha_nacimiento);
        this.especialidad = especialidad;
        this.unHorario = unHorario;
        this.unUsuario = unUsuario;
        this.listaTurnos = listaTurnos;
    }

    // Get and Set
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }   
}