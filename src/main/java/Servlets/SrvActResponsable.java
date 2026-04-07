
package Servlets;

import Logica.ControladoraLogica;
import Logica.Responsable;
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
@WebServlet(name = "SrvActResponsable", urlPatterns = {"/SrvActResponsable"})
public class SrvActResponsable extends HttpServlet {
    
    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter ("id"));
        Responsable resp = control.traeresponsable(id);
         
        HttpSession misession = request.getSession();
        misession.setAttribute("respEditar", resp);
         

         
        response.sendRedirect("actualizarResponsable.jsp");

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
        
        Responsable resp = (Responsable) request.getSession().getAttribute("respEditar");
        resp.setNombres(nombreResponsable);
        resp.setApellidos(apellidoResponsable);
        resp.setCciudadania(cedulaResponsable);
        resp.setDireccion(direccionResponsable);
        resp.setTelefono(telefonoResponsable);
        resp.setCorreo_electronico(correoResponsable);
        resp.setFecha_nacimiento(fecNacResponsable);
        resp.setTipo_responsabilidad(tipoResponsabilidad);
        
        control.actualizaResponsable(resp);
        
        response.sendRedirect("SvrResponsables");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
