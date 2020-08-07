/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package research;

import dbConnection.DbConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author ISURU
 */
@MultipartConfig(location="/tmp", fileSizeThreshold=1024*1024,maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)
public class AddResearchServlet extends HttpServlet {

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
            out.println("<title>Servlet AddResearchServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddResearchServlet at " + request.getContextPath() + "</h1>");
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
                String name=request.getParameter("name");
                String type=request.getParameter("userType");
                String headline=request.getParameter("headline");
                String interestingSubjects=request.getParameter("interestingSubjects");
                String tagUnivercity=request.getParameter("tagUnivercity");
                String email=request.getParameter("email");
                
                InputStream inputStream = null;
                Part filePart = request.getPart("pdf");
                if (filePart != null) 
                {
                    System.out.println(filePart.getName());
                    System.out.println(filePart.getSize());
                    System.out.println(filePart.getContentType());
                    inputStream = filePart.getInputStream();
                }
                String discription=request.getParameter("discription");
                
              //  System.out.println("bnfjd"+firstName);
                String query="insert into post_reseach (name,userType,headline,subject,university,email,pdf ,details) values(?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString(1,name);
                preparedStmt.setString(2,type);
                preparedStmt.setString(3,headline);
                preparedStmt.setString(4,interestingSubjects);
                preparedStmt.setString(5,tagUnivercity);
                preparedStmt.setString(6,email);
                if (inputStream != null) 
                {
                    preparedStmt.setBlob(7, inputStream);
                }
                preparedStmt.setString(8,discription);
                
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
