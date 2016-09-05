/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pweb.business.Login;
import pweb.business.Alumno;
import pweb.business.Matricula;
import pweb.data.Alumno1DB;
import pweb.data.MatriculaDB;


public class server extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String url = "/index2.html";

        // reuperar accion actual 
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // accion por defecto 
        }

        // realizar accion y establecer la URL a una pagina apropiada
        if (action.equals("join")) {
            url = "/index2.html";    // la pagina "join" 
        }
        else if (action.equals("add")) {                
            // obtener parametros de la peticion
            String codigo = request.getParameter("codigo");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            
            // almacenar datos en el objeto User y guardar el objeto User en la base de datos
            Alumno user = new Alumno(codigo ,firstName, lastName, email);
            Alumno1DB.insert(user);
            
            // establecer objeto Usuario en el objeto request y establecer la URL
            request.setAttribute("user", user);
            url = "/thanks.jsp";   // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
    
    
}
