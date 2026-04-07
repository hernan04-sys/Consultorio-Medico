
package Servlets;

import Logica.ControladoraLogica;
import Logica.Horario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "SrvHorarios", urlPatterns = {"/SrvHorarios"})
public class SrvHorarios extends HttpServlet {
    
    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Horario> listaHorarios = new ArrayList<Horario>();
        
        listaHorarios = control.leerhorarios();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaHorarios", listaHorarios);
        
        
        
        response.sendRedirect("mostrarHorario.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String horaInicial = request.getParameter("horaIni");
        String horaFinal = request.getParameter("horaFin");
        
        control.crearhorario(horaInicial, horaFinal);
        
        response.sendRedirect("index.jsp");

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
