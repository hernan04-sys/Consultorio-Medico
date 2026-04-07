
package Servlets;

import Logica.ControladoraLogica;
import Logica.Horario;
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
@WebServlet(name = "SrvActHorario", urlPatterns = {"/SrvActHorario"})
public class SrvActHorario extends HttpServlet {
    
    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter ("id"));
        Horario hora = control.traerhorario(id);
         
        HttpSession misession = request.getSession();
        misession.setAttribute("horaEditar", hora);
        
        response.sendRedirect("actualizarHorario.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String horaInicial = request.getParameter("horaIni");
        String horaFinal = request.getParameter("horaFin");
        
        Horario hora = (Horario) request.getSession().getAttribute("horaEditar");
        hora.setHorario_inicial(horaInicial);
        hora.setHorario_final(horaFinal);
        
        control.actualizarhorario(hora);
        
        response.sendRedirect("SrvHorarios");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
