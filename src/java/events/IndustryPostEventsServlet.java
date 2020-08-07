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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pubudu
 */
public class IndustryPostEventsServlet extends HttpServlet {

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
            out.println("<title>Servlet IndustryPostEventsServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IndustryPostEventsServlet at " + request.getContextPath() + "</h1>");
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
                String industryName=request.getParameter("name"); // get username from the form
                String eventCategory=request.getParameter("eventCategory"); // get eventCategory from the form
                String eventName=request.getParameter("eventName"); // get eventName from the form
                String tagUnivercity=request.getParameter("university"); // get university from the form
                String tagCategory=request.getParameter("subjects"); // get subjects from the form
                String eventVenue=request.getParameter("eventVenue"); // get eventVenue from the form
                String eventTime=request.getParameter("eventTime"); // get eventTime from the form
                String discription=request.getParameter("discription"); // get description from the form

                String query="insert into industry_post_events (industryName,eventCategory,eventName,tagUnivercity,tagCategory,eventVenue,eventTime,discription) values(?,?,?,?,?,?,?,?)";
                // query to insert to database
                PreparedStatement preparedStmt = con.prepareStatement(query);/* prepare statement for the query*/
                preparedStmt.setString(1,industryName);
                preparedStmt.setString(2,eventCategory);
                preparedStmt.setString(3,eventName);
                preparedStmt.setString(4,tagUnivercity);
                preparedStmt.setString(5,tagCategory);
                preparedStmt.setString(6,eventVenue);
                preparedStmt.setString(7,eventTime);
                preparedStmt.setString(8,discription);
                preparedStmt.execute();   // run the query
                response.sendRedirect("http://localhost:8080/plymouthapp/dashbord/industryHome.jsp"); //redirect if the query failed
             
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
