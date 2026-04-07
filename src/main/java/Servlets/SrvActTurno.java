
package Servlets;


import Logica.Turno;
import Logica.ControladoraLogica;
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
@WebServlet(name = "SrvActTurno", urlPatterns = {"/SrvActTurno"})
public class SrvActTurno extends HttpServlet {
    
    // Instanciar Controladora Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter ("id"));
        Turno turn = control.traerturno(id);
         
        HttpSession misession = request.getSession();
        misession.setAttribute("turnEditar", turn);
        
        response.sendRedirect("actualizarTurno.jsp");
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
        
        Turno turn = (Turno) request.getSession().getAttribute("turnEditar");
        turn.setFecha_turno(fechaTurno);
        turn.setHora_turno(horaTurno);
        
        control.actualizarTurno(turn);
        
        response.sendRedirect("SrvTurnos");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
