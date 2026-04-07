/*ANGEL AMAGUAYA*/
package Logica;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona{  
    // Atributos
  //private int id_responsable;
    private String tipo_responsabilidad;
    
    // Constructores
    public Responsable() {
    }

    public Responsable(String tipo_responsabilidad, int id, String nombres, String apellidos, String cciudadania, String direccion, String telefono, String correo_electronico, Date fecha_nacimiento) {
        super(id, nombres, apellidos, cciudadania, direccion, telefono, correo_electronico, fecha_nacimiento);
        this.tipo_responsabilidad = tipo_responsabilidad;
    }

    // Get and Set
    public String getTipo_responsabilidad() {
        return tipo_responsabilidad;
    }

    public void setTipo_responsabilidad(String tipo_responsabilidad) {
        this.tipo_responsabilidad = tipo_responsabilidad;
    }
}