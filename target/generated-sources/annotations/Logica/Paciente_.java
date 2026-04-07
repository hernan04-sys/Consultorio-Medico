package Logica;

import Logica.Responsable;
import Logica.Turno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-28T12:37:44")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, String> tiene_seguro;
    public static volatile SingularAttribute<Paciente, Responsable> unResponsable;
    public static volatile SingularAttribute<Paciente, String> tipo_sangre;
    public static volatile ListAttribute<Paciente, Turno> listaTurnos;

}