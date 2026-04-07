/*ANGEL AMAGUAYA*/
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turno implements Serializable { 
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_turno;
    @Temporal(TemporalType.DATE)
    private Date fecha_turno;
    private String hora_turno;
    // Debemos relacionar con doctor el uno a muchos, y en caso de turnos seria de uno a muchos por la BIDIRECCIONALIDAD CON DOCTOR
    @ManyToOne
    @JoinColumn(name = "id_doct")
    private Doctor doct;
    // Debemos relacionar con paciente el uno a muchos, y en caso de turnos seria de uno a muchos por la BIDIRECCIONALIDAD CON PACIENTE
    @ManyToOne
    @JoinColumn(name = "id_pacien")
    private Paciente pacien;
    // Constructores
    public Turno() {
    }

    public Turno(int id_turno, Date fecha_turno, String hora_turno) {
        this.id_turno = id_turno;
        this.fecha_turno = fecha_turno;
        this.hora_turno = hora_turno;
    }
    // Get and Set
    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public Date getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public String getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(String hora_turno) {
        this.hora_turno = hora_turno;
    }
}