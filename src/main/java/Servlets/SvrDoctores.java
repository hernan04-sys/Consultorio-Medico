
package Servlets;

import Logica.ControladoraLogica;
import Logica.Doctor;
import java.io.IOException;
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
@WebServlet(name = "SvrDoctores", urlPatterns = {"/SvrDoctores"})
public class SvrDoctores extends HttpServlet {
    
    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Doctor> listaMedicos = new ArrayList<Doctor>();
        
        listaMedicos = control.leermedicos();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaMedicos", listaMedicos);
        
        System.out.println("Usuario: " + listaMedicos.get(0));
        
        response.sendRedirect("mostrarMedico.jsp");
        
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
        
        control.creardoctor(nombreDoctor, apellidoDoctor, cedulaDoctor, direccionDoctor, telefonoDoctor, correoDoctor, fechNacDoctor, especialidadDoctor);
       
        response.sendRedirect("index.jsp");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
