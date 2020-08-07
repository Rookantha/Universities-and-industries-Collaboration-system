/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package research;

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
 * @author ISURU
 */
public class ComputerSceinceQuServlet extends HttpServlet {

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
            out.println("<title>Servlet ComputerSceinceQuServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ComputerSceinceQuServlet at " + request.getContextPath() + "</h1>");
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
        try
        {
          DbConnection db = new DbConnection();
          Connection con = db.getConnection();
                
          String Cat = request.getParameter("Category");
          String fullName=request.getParameter("name");
          String userType =request.getParameter("userType");                                                
          String askFrom=request.getParameter("askFrom");
          String qu=request.getParameter("query");
          
          
          String query="insert into query (name,subject,userType,askFrom,query) values(?,?,?,?,?)";
          PreparedStatement preparedStmt = con.prepareStatement(query);
          preparedStmt.setString(1,fullName);
          preparedStmt.setString(2,Cat);
          preparedStmt.setString(3,userType);
          preparedStmt.setString(4,askFrom);
          preparedStmt.setString(5,qu);              
          preparedStmt.execute();
          response.sendRedirect("http://localhost:8080/plymouthapp/research/researchHome.jsp");
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
