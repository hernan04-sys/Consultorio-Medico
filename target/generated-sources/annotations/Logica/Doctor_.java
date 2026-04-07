package Logica;

import Logica.Horario;
import Logica.Turno;
import Logica.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-28T12:37:44")
@StaticMetamodel(Doctor.class)
public class Doctor_ extends Persona_ {

    public static volatile SingularAttribute<Doctor, Usuario> unUsuario;
    public static volatile SingularAttribute<Doctor, String> especialidad;
    public static volatile ListAttribute<Doctor, Turno> listaTurnos;
    public static volatile SingularAttribute<Doctor, Horario> unHorario;

}