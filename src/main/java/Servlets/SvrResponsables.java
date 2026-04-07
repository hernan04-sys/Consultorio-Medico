
package Servlets;

import Logica.ControladoraLogica;
import Logica.Paciente;
import Logica.Responsable;
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
@WebServlet(name = "SvrResponsables", urlPatterns = {"/SvrResponsables"})
public class SvrResponsables extends HttpServlet {

    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Responsable> listaResponsables = new ArrayList<Responsable>();
        
        listaResponsables = control.leerresponsables();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaResponsables", listaResponsables);
        
        
        
        response.sendRedirect("mostrarResponsable.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreResponsable = request.getParameter("nombreResp");
        String apellidoResponsable = request.getParameter("apellidoResp");
        String cedulaResponsable = request.getParameter("cedulaResp");
        String direccionResponsable = request.getParameter("direccionResp");
        String telefonoResponsable = request.getParameter("telefonoResp");
        String correoResponsable = request.getParameter("correoResp");
        
        Date fecNacResponsable = null;
        try {
            String fechaNacimientoStr = request.getParameter("fecNacResp");
            if (fechaNacimientoStr != null && !fechaNacimientoStr.isEmpty()) {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                fecNacResponsable = formato.parse(fechaNacimientoStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        String tipoResponsabilidad = request.getParameter("tipoResp");
        
        control.crearresponsable(nombreResponsable, apellidoResponsable, cedulaResponsable, direccionResponsable, telefonoResponsable, correoResponsable, fecNacResponsable, tipoResponsabilidad);
       
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
