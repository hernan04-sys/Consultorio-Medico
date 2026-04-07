/*ANGEL AMAGUAYA*/
package Logica;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
    // Atributos
  //private int id_paciente;
    private String tiene_seguro;
    private String tipo_sangre;
    // Relaciones
    // Se relaciona Paciente de uno a uno con Responsable (Se relaciona con la misma clase)
    @OneToOne
    private Responsable unResponsable;
    // Se relaciona Paciente de uno a muchos con Turno (Se relaciona con una coleccion)
    // Una relacion de uno a muchos BIDIRECCIONAL significa que en ambas clases deben existir la anotaciones correspondientes
    @OneToMany(mappedBy = "pacien")
    private List<Turno> listaTurnos;
    
    // Constructores
    public Paciente() {
    }

    public Paciente(String tiene_seguro, String tipo_sangre, Responsable unResponsable, List<Turno> listaTurnos, int id, String nombres, String apellidos, String cciudadania, String direccion, String telefono, String correo_electronico, Date fecha_nacimiento) {
        super(id, nombres, apellidos, cciudadania, direccion, telefono, correo_electronico, fecha_nacimiento);
        this.tiene_seguro = tiene_seguro;
        this.tipo_sangre = tipo_sangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    // Get and Set
    public String getTiene_seguro() {
        return tiene_seguro;
    }

    public void setTiene_seguro(String tiene_seguro) {
        this.tiene_seguro = tiene_seguro;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
}