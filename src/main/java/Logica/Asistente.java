/*ANGEL AMAGUAYA*/
package Logica;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Asistente extends Persona implements Serializable{ 
    // Atributos
  //private int id_asistente;
    private String lugar_trabajo;
    // Relaciones 
    // Se relaciona Asistente de uno a uno con Usuario (Se relaciona con la misma clase)
    @OneToOne
    private Usuario unUsuario;
    
    // Constructores
    public Asistente() {
    }

    public Asistente(String lugar_trabajo, Usuario unUsuario, int id, String nombres, String apellidos, String cciudadania, String direccion, String telefono, String correo_electronico, Date fecha_nacimiento) {
        super(id, nombres, apellidos, cciudadania, direccion, telefono, correo_electronico, fecha_nacimiento);
        this.lugar_trabajo = lugar_trabajo;
        this.unUsuario = unUsuario;
    }

    // Get and Set
    public String getLugar_trabajo() {
        return lugar_trabajo;
    }

    public void setLugar_trabajo(String lugar_trabajo) {
        this.lugar_trabajo = lugar_trabajo;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
}