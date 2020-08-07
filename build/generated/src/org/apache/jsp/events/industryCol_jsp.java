package org.apache.jsp.events;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class industryCol_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         ");
String UniversityName = request.getAttribute("NameUniversity").toString();
      out.write("\n");
      out.write("        <title>");
      out.print(UniversityName);
      out.write(" - Co-operate Events</title>\n");
      out.write("          <style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  background-color: #008000 ;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 16px;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  border: 2px solid #4CAF50;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  display: inline-block;\n");
      out.write("  cursor: pointer;\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("input[type=text],select {\n");
      out.write("  width: 30%;\n");
      out.write("  padding: 8px 20px;\n");
      out.write("  margin: 8px 0;  \n");
      out.write("  border: 2px solid #4CAF50;\n");
      out.write("  border-radius: 4px;\n");
      out.write("} \n");
      out.write("textarea{\n");
      out.write(" width: 35%;\n");
      out.write(" padding: 12px 20px;\n");
      out.write(" margin: 8px 0;   \n");
      out.write(" border: 2px solid #4CAF50;\n");
      out.write(" border-radius: 4px;    \n");
      out.write("}\n");
      out.write("label{\n");
      out.write("    \n");
      out.write("font-size: 16px;\n");
      out.write("}\n");
      out.write("div {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

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
      out.write("<h2 align=\"center\" style=\"color: #009900\"> <font><strong> Opportunities for ");
      out.print(UniversityName);
      out.write("</strong></font></h2>\n");
      out.write("<table align=\"center\" cellpadding=\"8\" cellspacing=\"8\" border=\"0\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#009900\">\n");
      out.write("\n");
      out.write("<td><b><font color=\"White\">Event ID</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Industry Name</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Event Category</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Event Name</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Selected Universities</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Selected Subjects</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Event Venue</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Event Time</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Description</font></b></td>\n");
      out.write("</tr>\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName ,userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM industry_post_events WHERE  tagUnivercity=? ORDER BY eventTime";
PreparedStatement preparedStatement = connection.prepareStatement(sql);
preparedStatement.setString(1,UniversityName);
resultSet = preparedStatement.executeQuery();
while(resultSet.next()){

      out.write("\n");
      out.write("\n");
      out.write("<tr bgcolor=\"#e6ffe6\">\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("eventID"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("industryName"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("eventCategory"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("eventName"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("tagUnivercity"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("tagCategory"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("eventVenue"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("eventTime"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("discription"));
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div>\n");
      out.write("<br>\n");
      out.write("<h3 align=\"left\"style=\"color: #009900\"> <font><strong>Get social and leave your comment here...</strong></font></h3>\n");
      out.write("<br>\n");
      out.write("<form action=\"../IndustryColoServlet\" id=\"usrform\"  method=\"post\">\n");
      out.write("<label for=\"subject\">Your University</label> \n");
      out.write("<br>\n");
      out.write("<input type=\"text\" name=\"UniName\" align=\"right\" readonly=\"true\" value=\"");
      out.print(UniversityName);
      out.write("\">  \n");
      out.write("<br>\n");
      out.write("<label for=\"subject\">Event ID</label> \n");
      out.write("<br>\n");
      out.write("<input type=\"text\" name=\"eventID\" align=\"right\" required >  \n");
      out.write("<br>\n");
      out.write("<label for=\"subject\">User Type</label>\n");
      out.write("<br>\n");
      out.write("        <select name=\"userType\" required>\n");
      out.write("                <option value=\"\"></option>\n");
      out.write("                <option value=\"student\">Student</option>\n");
      out.write("                <option value=\"univercity\">University</option>\n");
      out.write("                <option value=\"industry\">Industry</option>\n");
      out.write("                <option value=\"member\">Member</option>          \n");
      out.write("        </select>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<label for=\"subject\">Name</label> \n");
      out.write("<br>\n");
      out.write("<input type=\"text\" name=\"usrname\"align=\"right\" required >\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write(" <label for=\"subject\">Comment</label>  \n");
      out.write("<br>\n");
      out.write("<textarea rows=\"4\" cols=\"50\" name=\"comment\" form=\"usrform\">\n");
      out.write("</textarea>\n");
      out.write("<br>\n");
      out.write("<input type=\"submit\" value=\"Enter\">\n");
      out.write("<br>\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<p><b>Note : please do not Abusive, vulgar, obscene, racist, threatening, or harassing comments.</b> </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("</div>\n");
      out.write("<table align=\"center\" cellpadding=\"8\" cellspacing=\"8\" border=\"0\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<h3 align=\"left\"style=\"color: #009900\"> <font><strong>All comments are welcome...</strong></font></h3>\n");
      out.write("<table align=\"left\" cellpadding=\"8\" cellspacing=\"8\" border=\"0\">\n");
      out.write("<tr >\n");
      out.write("\n");
      out.write("<tr bgcolor=\"#009900\">\n");
      out.write("<td><b><font color=\"White\">Name</font></b></td>\n");
      out.write("<td><b><font color=\"White\">User Type</font></b></td> \n");
      out.write("<td><b><font color=\"White\">Event ID</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Comment</font></b></td>    \n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName ,userId, password);
statement=connection.createStatement();
String sqlone ="SELECT * FROM industy_comment WHERE  univercity =?";
PreparedStatement preparedStatement1 = connection.prepareStatement(sqlone);
preparedStatement1.setString(1, UniversityName);
resultSet = preparedStatement1.executeQuery();
while(resultSet.next()){

      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<tr bgcolor=\"#e6ffe6\">\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("userType") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("evnetID") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("comment") );
      out.write("</td>\n");
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
      out.write("    </body>\n");
      out.write("    <br>\n");
      out.write("</html>\n");
      out.write("   \n");
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
