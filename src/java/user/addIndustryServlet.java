/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

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
 * @author HP
 */
public class addIndustryServlet extends HttpServlet {

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
            out.println("<title>Servlet addIndustryServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addIndustryServlet at " + request.getContextPath() + "</h1>");
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
               Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/plymouth","root","");  
                String userType="industry";
                String fullName=request.getParameter("fullName");
                String subject=request.getParameter("interestingSubjects");
                String univercity="null";
                String email=request.getParameter("email");
                String userName=request.getParameter("userName");
                String psw=request.getParameter("psw");
                String pswRepeat=request.getParameter("pswRepeat");
                String discription=request.getParameter("discription");
                
                
                
                String queryupdate = "UPDATE `industry_reg_details` SET `Status` = 'Registered' WHERE `industry_reg_details`.`Organization` = ?";
                PreparedStatement preparedStatemet = con.prepareStatement(queryupdate);
                preparedStatemet.setString(1,fullName);
                preparedStatemet.execute();
                
                
                
              //  System.out.println("bnfjd"+firstName);
                String query="insert into register (userType,fullName,subjects,univercity,email,userName,password,pswRepeat,discription) values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString(1,userType);
                preparedStmt.setString(2,fullName);
                preparedStmt.setString(3,subject);
                preparedStmt.setString(4,univercity);
                preparedStmt.setString(5,email);
                preparedStmt.setString(6,userName);
                preparedStmt.setString(7,psw);
                preparedStmt.setString(8,pswRepeat);
                preparedStmt.setString(9,discription);
                preparedStmt.execute();   
                response.sendRedirect("http://localhost:8080/plymouthapp/user/userLog.jsp");
             
            }
            catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex)
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
