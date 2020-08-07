/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calender;

import dbConnection.DbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class ColUniCalenderPostSevlet extends HttpServlet {

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
            out.println("<title>Servlet ColUniCalenderPostSevlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ColUniCalenderPostSevlet at " + request.getContextPath() + "</h1>");
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
            throws ServletException, IOException 
    
    
    {
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
                
                String username = request.getParameter("uni_username");
                String Password = request.getParameter("uni_password");
                String fullName=request.getParameter("name");
                String univercity="university";
                String faculty=request.getParameter("faculty");
                String activity=request.getParameter("activity");
                String sDate=request.getParameter("sday");
                String eDate=request.getParameter("eday");
                String discription=request.getParameter("discription");
                
            String Check_query="select userName,password,univercity from register where userName=? and password=? and univercity=?" ;
            PreparedStatement Check_preparedStmt = con.prepareStatement(Check_query);
            Check_preparedStmt.setString(1,username);
            Check_preparedStmt.setString(2,Password);
            Check_preparedStmt.setString(3,fullName);
            
            ResultSet Check_rs = Check_preparedStmt.executeQuery();
            if(Check_rs.next() == false)
            {
                PrintWriter writer = response.getWriter();
                String htmlRespone = "<html>";
                htmlRespone +=("<script type=\"text/javascript\">");
                htmlRespone +=("alert('Invalid Username or Password \\nYou will be redirected once clicked on OK button');");
                htmlRespone +=("location='http://localhost:8080/plymouthapp/calender/colUniCalenderPost.jsp';");
                htmlRespone +=("</script>");
                writer.println(htmlRespone);
            }
            else
            {
                //  System.out.println("bnfjd"+firstName);
                String query="insert into activities(organiztionName,organiztionType,faculty,activity,activitySdate,activityEdate,discription) values(?,?,?,?,?,?,?)";
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString(1,fullName);
                preparedStmt.setString(2,univercity);
                preparedStmt.setString(3,faculty);
                preparedStmt.setString(4,activity);
                preparedStmt.setString(5,sDate);
                preparedStmt.setString(6,eDate);
                preparedStmt.setString(7,discription);
                preparedStmt.execute(); 
                
                PrintWriter writer1 = response.getWriter();
                String htmlRespone = "<html>";
                htmlRespone +=("<script type=\"text/javascript\">");
                htmlRespone +=("alert('Calender Event " +fullName+ " Inserted Successfully');");
                htmlRespone +=("location='http://localhost:8080/plymouthapp/dashbord/universityHome.jsp';");
                htmlRespone +=("</script>");
                writer1.println(htmlRespone);
            }
             
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
