
package Servlets;

import Logica.ControladoraLogica;
import Logica.Doctor;
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
@WebServlet(name = "SrvActMedico", urlPatterns = {"/SrvActMedico"})
public class SrvActMedico extends HttpServlet {
    
    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter ("id"));
        Doctor doc = control.traerdoctor(id);
         
        HttpSession misession = request.getSession();
        misession.setAttribute("docEditar", doc);
         

         
        response.sendRedirect("actualizarMedico.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreDoctor = request.getParameter("nombreDoc");
        String apellidoDoctor = request.getParameter("apellidoDoc");
        String cedulaDoctor = request.getParameter("cedulaDoc");
        String direccionDoctor = request.getParameter("direccionDoc");
        String telefonoDoctor = request.getParameter("telefonoDoc");
        String correoDoctor = request.getParameter("correoDoc");
       
        String especialidadDoctor = request.getParameter("especiDoc");
        
        Date fechNacDoctor = null;
        try {
            String fechaNacimientoStr = request.getParameter("fecNacDoc");
            if (fechaNacimientoStr != null && !fechaNacimientoStr.isEmpty()) {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                fechNacDoctor = formato.parse(fechaNacimientoStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        
        Doctor doc = (Doctor) request.getSession().getAttribute("docEditar");
        doc.setNombres(nombreDoctor);
        doc.setApellidos(apellidoDoctor);
        doc.setCciudadania(cedulaDoctor);
        doc.setDireccion(direccionDoctor);
        doc.setTelefono(telefonoDoctor);
        doc.setCorreo_electronico(correoDoctor);
        doc.setFecha_nacimiento(fechNacDoctor);
        doc.setEspecialidad(especialidadDoctor);
        
        
        control.actualizardoctor(doc);
        
        response.sendRedirect("SvrDoctores");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
