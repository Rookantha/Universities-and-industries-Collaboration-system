package org.apache.jsp.events;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class uniRetriveEvents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Events</title>\n");
      out.write("          <style>\n");
      out.write("body {\n");
      out.write("  font-family: \"Lato\", sans-serif;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

String userType = request.getParameter("userType");          
String univercity= request.getParameter("univercity");
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
      out.write("<h2 align=\"center\" style=\"color: #4d88ff\"> <font><strong>Your University Events </strong></font></h2>\n");
      out.write("<table align=\"center\" cellpadding=\"8\" cellspacing=\"8\" border=\"0\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#ccccff\">\n");
      out.write("\n");
      out.write("<td><b>Event Name</b></td>\n");
      out.write("<td><b>Invited Universities</b></td>\n");
      out.write("<td><b>Subjects</b></td>\n");
      out.write("<td><b>Event Venue</b></td>\n");
      out.write("<td><b>Event Time</b></td>\n");
      out.write("<td><b>Description</b></td>\n");
      out.write("</tr>\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName ,userId, password);
statement=connection.createStatement();
String sql ="select userType,univercity from register where userType=? and Univercity=?  ";



resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<tr bgcolor=\"#4dff4d\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("eventName") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("tagUniversity") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("tagCategory") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("eventVenue") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("eventTime") );
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("discription") );
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
 
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("   ");
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
