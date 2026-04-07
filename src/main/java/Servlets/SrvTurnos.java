
package Servlets;

import Logica.Turno;
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
@WebServlet(name = "SrvTurnos", urlPatterns = {"/SrvTurnos"})
public class SrvTurnos extends HttpServlet {
    
    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Turno> listaTurnos = new ArrayList<Turno>();
        
        listaTurnos = control.leerturnos();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaTurnos", listaTurnos);
        
        
        
        response.sendRedirect("mostrarTurno.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Date fechaTurno = null;
        try {
            String fechaNacimientoStr = request.getParameter("fecTurn");
            if (fechaNacimientoStr != null && !fechaNacimientoStr.isEmpty()) {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                fechaTurno = formato.parse(fechaNacimientoStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        String horaTurno = request.getParameter("HoraTurn");
        
        control.crearturno(fechaTurno, horaTurno);
        
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
