/*ANGEL AMAGUAYA*/
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {    
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombres;
    private String apellidos;
    private String cciudadania;
    private String direccion;
    private String telefono;
    private String correo_electronico;
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;  
    
    // Constructores
    public Persona() {
    }

    public Persona(int id, String nombres, String apellidos, String cciudadania, String direccion, String telefono, String correo_electronico, Date fecha_nacimiento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cciudadania = cciudadania;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    // Get and Set
    public int getId() {
        return id;
    }

    public void setId(int id) {    
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCciudadania() {
        return cciudadania;
    }

    public void setCciudadania(String cciudadania) {
        this.cciudadania = cciudadania;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
