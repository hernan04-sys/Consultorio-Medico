
package Servlets;

import Logica.ControladoraLogica;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SrvActUsr", urlPatterns = {"/SrvActUsr"})
public class SrvActUsr extends HttpServlet {

    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         int id = Integer.parseInt(request.getParameter ("id"));
         Usuario usu = control.traerusuario(id);
         
         HttpSession misession = request.getSession();
         misession.setAttribute("usuEditar", usu);
         
         System.out.println("El usuario es: " + usu.getNombre_usuario());
         
         response.sendRedirect("actualizarUsuario.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUsurio = request.getParameter("nombreUsuario");
        String contrasenia = request.getParameter("contrasenia");
        
        
        Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar");
        usu.setNombre_usuario(nombreUsurio);
        usu.setContrasenia_usuario(contrasenia);
        
        
        control.actualizarusuario(usu);
        
        response.sendRedirect("SrvUsuarios");

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
