/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import dbConnection.DbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class UniversityPostEventServlet extends HttpServlet {

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
            out.println("<title>Servlet UniversityPostEventServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UniversityPostEventServlet at " + request.getContextPath() + "</h1>");
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
         try{
                DbConnection db = new DbConnection();
                Connection con = db.getConnection();  
                String uniName=request.getParameter("name");
                String eventCategory=request.getParameter("eventCategory");
                String eventName=request.getParameter("eventName");
                String tagUnivercity=request.getParameter("university");
                String tagCategory=request.getParameter("subjects");
                String eventVenue=request.getParameter("eventVenue");
                String eventTime=request.getParameter("eventTime");
                String discription=request.getParameter("discription");
              //  System.out.println("bnfjd"+firstName);
                String query="insert into university_post_events (universityName,eventCategory,eventName,tagUniversity,tagCategory,eventVenue,eventTime,discription) values(?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString(1,uniName);
                preparedStmt.setString(2,eventCategory);
                preparedStmt.setString(3,eventName);
                preparedStmt.setString(4,tagUnivercity);
                preparedStmt.setString(5,tagCategory);
                preparedStmt.setString(6,eventVenue);
                preparedStmt.setString(7,eventTime);
                preparedStmt.setString(8,discription);
                preparedStmt.execute();   
                response.sendRedirect("http://localhost:8080/plymouthapp/dashbord/universityHome.jsp");
             
            }
            catch(ClassNotFoundException | SQLException ex)
            {
                PrintWriter out = response.getWriter();
                out.println(ex);
            }   
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
