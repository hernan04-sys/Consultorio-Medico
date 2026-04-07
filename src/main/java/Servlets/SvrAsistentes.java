
package Servlets;

import Logica.Asistente;
import Logica.ControladoraLogica;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
@WebServlet(name = "SvrAsistentes", urlPatterns = {"/SvrAsistentes"})
public class SvrAsistentes extends HttpServlet {

    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Asistente> listaAsistentes = new ArrayList<Asistente>();
        
        listaAsistentes = control.leerasistentes();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaAsistentes", listaAsistentes);
        
        
        
        response.sendRedirect("mostrarAsistente.jsp");

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
        
        control.crearasistente(nombreAsistente, apellidoAsistente, cedulaAsistente, direccionAsistente, telefonoAsistente, correoAsistente, fechNacAsistente, lugarDeTrabajo);
       
        response.sendRedirect("index.jsp");
        
        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
