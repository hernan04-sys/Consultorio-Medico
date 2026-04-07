
package Servlets;

import Logica.ControladoraLogica;
import Logica.Asistente;
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
@WebServlet(name = "SrvActAsistente", urlPatterns = {"/SrvActAsistente"})
public class SrvActAsistente extends HttpServlet {
    
    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter ("id"));
        Asistente asis = control.traerasistente(id);
         
        HttpSession misession = request.getSession();
        misession.setAttribute("asisEditar", asis);
        
        response.sendRedirect("actualizarAsistente.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreAsistente = request.getParameter("nombreAsis");
        String apellidoAsistente = request.getParameter("apellidoAsis");
        String cedulaAsistente = request.getParameter("cedulaAsis");
        String direccionAsistente = request.getParameter("direccionAsis");
        String telefonoAsistente = request.getParameter("telefonoAsis");
        String correoAsistente = request.getParameter("correoAsis");
        
        Date fechNacAsistente = null;
        try {
            String fechaNacimientoStr = request.getParameter("fecNacAsis");
            if (fechaNacimientoStr != null && !fechaNacimientoStr.isEmpty()) {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                fechNacAsistente = formato.parse(fechaNacimientoStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        String lugarDeTrabajo = request.getParameter("lugarTrab");
        
        Asistente asis = (Asistente) request.getSession().getAttribute("asisEditar");
        asis.setNombres(nombreAsistente);
        asis.setApellidos(apellidoAsistente);
        asis.setCciudadania(cedulaAsistente);
        asis.setDireccion(direccionAsistente);
        asis.setTelefono(telefonoAsistente);
        asis.setCorreo_electronico(correoAsistente);
        asis.setFecha_nacimiento(fechNacAsistente);
        asis.setLugar_trabajo(lugarDeTrabajo);
        
        control.actualizarasistente(asis);
        
        response.sendRedirect("SvrAsistentes");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
