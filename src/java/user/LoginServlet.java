/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import dbConnection.DbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ISURU
 */
public class LoginServlet extends HttpServlet {

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
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
            throws ServletException, IOException
    {
        String Input_username=request.getParameter("username").toUpperCase();
        String Input_userType=request.getParameter("userType");
        String Input_password=request.getParameter("password");
        
        HttpSession session = request.getSession(false);
        session.setAttribute("UserName", ""+Input_username);
        session.setAttribute("UserType", ""+Input_userType);
                        
        
        try
        {    
            DbConnection db = new DbConnection();
            Connection con = db.getConnection();
            String query="select userName,userType,password from register where userName=? and userType=? and password=?" ;
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1,Input_username);
            preparedStmt.setString(2,Input_userType);
            preparedStmt.setString(3,Input_password);
            
     
            ResultSet rs = preparedStmt.executeQuery();
            if(rs.next() == false)
            {
                PrintWriter writer = response.getWriter();
                String htmlRespone = "<html>";
                htmlRespone +=("<script type=\"text/javascript\">");
                htmlRespone +=("alert('Invalid Username, Usertype or Password \\nYou will be redirected to Login Page once clicked on OK button');");
                htmlRespone +=("location='http://localhost:8080/plymouthapp/user/userLog.jsp';");
                htmlRespone +=("</script>");
                writer.println(htmlRespone);
                //response.sendRedirect("http://localhost:8080/plymouthapp/user/userLog.jsp");
            }
            else
            {
              do 
              {
                switch (Input_userType) 
                {
                    case "student":
                        response.sendRedirect("http://localhost:8080/plymouthapp/dashbord/studentHome.jsp");
                        break;
                        
                    case "univercity":
                        response.sendRedirect("http://localhost:8080/plymouthapp/dashbord/universityHome.jsp");
                        break;
                        
                    case "industry":
                        response.sendRedirect("http://localhost:8080/plymouthapp/dashbord/industryHome.jsp");
                        break;
                        
                    case "member":
                        response.sendRedirect("http://localhost:8080/plymouthapp/dashbord/memberHome.jsp");
                        break;        
                        
                    default:
                        response.sendRedirect("http://localhost:8080/plymouthapp/dashbord/adminHome.jsp");
                        break;
                }
              } while (rs.next()); 
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
