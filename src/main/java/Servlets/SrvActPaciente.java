
package Servlets;

import Logica.ControladoraLogica;
import Logica.Paciente;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "SrvActPaciente", urlPatterns = {"/SrvActPaciente"})
public class SrvActPaciente extends HttpServlet {
    
    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter ("id"));
        Paciente pacien = control.traerpaciente(id);
         
        HttpSession misession = request.getSession();
        misession.setAttribute("pacienEditar", pacien);
         

         
        response.sendRedirect("actualizarPaciente.jsp");

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
        
        Paciente pacien = (Paciente) request.getSession().getAttribute("pacienEditar");
        pacien.setNombres(nombrePaciente);
        pacien.setApellidos(apellidoPaciente);
        pacien.setCciudadania(cedulaPaciente);
        pacien.setDireccion(direccionPaciente);
        pacien.setTelefono(telefonoPaciente);
        pacien.setCorreo_electronico(correoPaciente);
        pacien.setFecha_nacimiento(fechNacPaciente);
        pacien.setTiene_seguro(tieneSeguro);
        pacien.setTipo_sangre(tipoSangre);
        
        control.actualizarpaciente(pacien);
        
        response.sendRedirect("SvrPacientes");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
