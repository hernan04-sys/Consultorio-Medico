
package Servlets;

import Logica.ControladoraLogica;
import Logica.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import java.io.PrintWriter;
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
@WebServlet(name = "SrvUsuarios", urlPatterns = {"/SrvUsuarios"})
public class SrvUsuarios extends HttpServlet {

    
   // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios = control.leerusuario();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaUsuarios", listaUsuarios);
        
        System.out.println("Usuario: " + listaUsuarios.get(0));
        
        response.sendRedirect("mostrarUsuario.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUrs = request.getParameter("nombreUsuario");
        String contrasenia = request.getParameter("contrasenia");
        
        control.crearusuario(nombreUrs, contrasenia);
        
       
        response.sendRedirect("index.jsp");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
