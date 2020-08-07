package org.apache.jsp.calender;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class colUniCalender_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
String UniversityName = session.getAttribute("NameUniversity").toString();//"University of Colombo";
      out.write("\n");
      out.write("        <title>");
      out.print(UniversityName);
      out.write(" - Calender</title>\n");
      out.write("        <style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

String id = request.getParameter("uniEventID");

String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "plymouth";
String userId = "root";
String password = "";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("<table align=\"center\" cellpadding=\"8\" cellspacing=\"8\" border=\"0\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<h2 align=\"center\" style=\"color: #009900\"> <font><strong>Academic Calendar of ");
      out.print(UniversityName);
      out.write("</strong></font></h2>\n");
      out.write("<table align=\"left\" cellpadding=\"8\" cellspacing=\"8\" border=\"0\">\n");
      out.write("<tr >\n");
      out.write("<tr bgcolor=\"#009900\">\n");
      out.write("<td><b><font color=\"White\">Faculty</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Activity</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Activity Start Date</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Activity End Date</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Description</font></b></td>    \n");
      out.write("</tr>\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName ,userId, password);
statement=connection.createStatement();
String sqlone ="SELECT * FROM activities WHERE organiztionName=? AND organiztionType ='university' ORDER BY activitySdate DESC ";
PreparedStatement preparedStatement = connection.prepareStatement(sqlone);
preparedStatement.setString(1,UniversityName);

resultSet = preparedStatement.executeQuery();
while(resultSet.next()){

      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<tr bgcolor=\"#e6ffe6\">\n");
      out.write("<td>");
      out.print(resultSet.getString("faculty") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("activity"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("activitySdate"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("activityEdate"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("discription"));
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
