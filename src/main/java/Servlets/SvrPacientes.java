
package Servlets;

import Logica.ControladoraLogica;
import Logica.Paciente;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ANGEL AMAGUAYA
 */
@WebServlet(name = "SvrPacientes", urlPatterns = {"/SvrPacientes"})
public class SvrPacientes extends HttpServlet {
    
    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        
        listaPacientes = control.leerpacientes();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaPacientes", listaPacientes);
        
        
        
        response.sendRedirect("mostrarPaciente.jsp");
       
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombrePaciente = request.getParameter("nombrePacien");
        String apellidoPaciente = request.getParameter("apellidoPacien");
        String cedulaPaciente = request.getParameter("cedulaPacien");
        String direccionPaciente = request.getParameter("direccionPacien");
        String telefonoPaciente = request.getParameter("telefonoPacien");
        String correoPaciente = request.getParameter("correoPacien");
        
        Date fechNacPaciente = null;
        try {
            String fechaNacimientoStr = request.getParameter("fecNacPacien");
            if (fechaNacimientoStr != null && !fechaNacimientoStr.isEmpty()) {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                fechNacPaciente = formato.parse(fechaNacimientoStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        String tieneSeguro = request.getParameter("seguro");
        String tipoSangre = request.getParameter("tipsangre");
        
        control.crearPaciente(nombrePaciente, apellidoPaciente, cedulaPaciente, direccionPaciente, telefonoPaciente, correoPaciente, fechNacPaciente, tieneSeguro, tipoSangre);
       
        // Calcular la edad del paciente
        int edad = 0;
            if (fechNacPaciente != null) {
                Calendar fechaNacimiento = Calendar.getInstance();
                fechaNacimiento.setTime(fechNacPaciente);
                Calendar hoy = Calendar.getInstance();
                edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
                if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
                    edad--;
                }
            }

        // Redirigir según la edad del paciente
        if (edad < 18) {
            response.sendRedirect("ingresarResponsable.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
