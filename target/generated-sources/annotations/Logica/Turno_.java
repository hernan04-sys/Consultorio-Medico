package Logica;

import Logica.Doctor;
import Logica.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-28T12:37:44")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, String> hora_turno;
    public static volatile SingularAttribute<Turno, Doctor> doct;
    public static volatile SingularAttribute<Turno, Paciente> pacien;
    public static volatile SingularAttribute<Turno, Date> fecha_turno;
    public static volatile SingularAttribute<Turno, Integer> id_turno;

}