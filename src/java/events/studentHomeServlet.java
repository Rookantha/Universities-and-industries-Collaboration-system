/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ISURU
 */
public class studentHomeServlet extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet studentHomeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet studentHomeServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                   
                    String univercity=request.getParameter("univercity");
                    String event=request.getParameter("event");
                    String UName = request.getParameter("UName");
                    String UType = request.getParameter("UType");
            
                    if (event.contains("professional") ) 
                    {
                        HttpSession session = request.getSession(false);
                        session.setAttribute("NameUniversity", ""+univercity);
                        session.setAttribute("UserName", ""+UName);
                        session.setAttribute("UserType", ""+UType);
                        response.sendRedirect("http://localhost:8080/plymouthapp/events/colPost.jsp");
                    }
                    else  if(event.contains("corporate")) 
                    {
                        HttpSession session = request.getSession(false);
                        session.setAttribute("NameUniversity", ""+univercity);
                        session.setAttribute("UserName", ""+UName);
                        session.setAttribute("UserType", ""+UType);
                        response.sendRedirect("http://localhost:8080/plymouthapp/events/industryCol.jsp");
                    }
                    
                    
                    
                   /* else if (univercity.equals("University-of-Peradeniya") && event.contains("professional")) {    
                        response.sendRedirect("http://localhost:8080/plymouthapp/events/paradeniyaPost.jsp");        
                    }
                    else if (event.contains("professional") && univercity.equals("NSBM")) {    
                        response.sendRedirect("http://localhost:8080/plymouthapp/events/nsbmPost.jsp");          
                    }
                     
                    else  if(event.contains("corporate") && univercity.equals("University-of-Peradeniya")) {
                        response.sendRedirect("http://localhost:8080/plymouthapp/events/industyPeradeniya.jsp");
                    } 
                    else  if(event.contains("corporate") && univercity.equals("NSBM")) {
                        response.sendRedirect("http://localhost:8080/plymouthapp/events/industryNNsbm.jsp");
                    }*/
                    else 
                    {
                        response.sendRedirect("http://localhost:8080/plymouthapp/dashbord/studentHome.jsp");
                    } 
        
        
        
        
        
        
        
        
        
        
                    /*String userType=request.getParameter("userType");
                    String univercity=request.getParameter("univercity");
                 
                      if(univercity.contains("University-of-Colombo")&& userType.contains("student"))
                        {
                        response.sendRedirect("http://localhost:8080/plymouthapp/events/colPost.jsp");
                        }
                    else if(univercity.contains("University-of-Peradeniya")&& userType.contains("student"))
                        {
                        response.sendRedirect("http://localhost:8080/plymouthapp/events/paradeniyaPost.jsp");
                        
                        }
                      else if (univercity.contains("NSBM")&& userType.contains("student"))
                        {
                         response.sendRedirect("http://localhost:8080/plymouthapp/events/nsbmPost.jsp");
                        
                        }*/
                      
                 
    
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
