package org.apache.jsp.calender;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class colUniCalenderPost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Calender</title>\n");
      out.write("          <style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  margin-top: 6px;\n");
      out.write("  margin-bottom: 16px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
      out.write("input[type=date] {\n");
      out.write("  width: 40%;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  margin-top: 6px;\n");
      out.write("  margin-bottom: 16px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          ");

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
      out.write("<h2 align=\"center\" style=\"color: #009900\"> <font><strong>Add Activities to Academic Calendar</strong></font></h2>\n");
      out.write(" \n");
      out.write("<h3 align=\"left\" style=\"color: #009900\">Fill with Relevant Details</h3>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <form action=\"../ColUniCalenderPostSevlet\" method=\"post\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"country\">University</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <select id=\"country\" name=\"name\" required> \n");
      out.write("          <option value=\"\">Select Your University</option>\n");
      out.write("          <option value=\"University of Colombo\">University of Colombo (Western Province)</option>\n");
      out.write("          <option value=\"University of Peradeniy\">University of Peradeniya (Central Province)</option>\n");
      out.write("          <option value=\"NSBM\">NSBM(Western Province)</option>\n");
      out.write("          <option value=\"University of Ruhuna \">University of Ruhuna (Southern Province)</option>\n");
      out.write("          <option value=\"University of Peradeniya \">University of Peradeniya (Central Province)</option>\n");
      out.write("          <option value=\"University of Sri Jayewardenepura\">University of Sri Jayewardenepura (Western Province)</option>\n");
      out.write("           <option value=\"University of Kelaniya\">University of Kelaniya (Western Province)</option>\n");
      out.write("          <option value=\"University of Moratuwa\">University of Moratuwa (Western Province)</option>\n");
      out.write("          <option value=\"University of Jaffna \">University of Jaffna (Northern Province)</option>\n");
      out.write("           <option value=\"Eastern University\">Eastern University, Sri Lanka (Eastern Province)</option>\n");
      out.write("          <option value=\"South Eastern University\">South Eastern University of Sri Lanka, Oluvil (Eastern Province)</option>\n");
      out.write("          <option value=\"Open University of Sri Lanka\">Open University of Sri Lanka(distance education)</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("    </div>  \n");
      out.write("    <label for=\"fname\">Faculty</label>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"faculty\" placeholder=\"Faculty Name..\">\n");
      out.write("\n");
      out.write("    <label for=\"lname\">Activity</label>\n");
      out.write("    <input type=\"text\" id=\"lname\" name=\"activity\" placeholder=\"Activity Name..\">\n");
      out.write("\n");
      out.write("    <label for=\"country\">Activity</label>\n");
      out.write("    <label for=\"country\">Start Date</label><br>\n");
      out.write("    <input type=\"date\" name=\"sday\" ><br><br>\n");
      out.write("    \n");
      out.write("    <label for=\"country\">End Date</label><br>\n");
      out.write("    <input type=\"date\" name=\"eday\" ><br><br>\n");
      out.write("    \n");
      out.write("    <label for=\"subject\">Subject</label>\n");
      out.write("    <textarea id=\"subject\" name=\"discription\" placeholder=\"Description here..\" style=\"height:200px\"></textarea>\n");
      out.write("    \n");
      out.write("    <label for=\"uName\">Username</label>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"uni_username\" placeholder=\"University registered Username..\" required=\"\">\n");
      out.write("    \n");
      out.write("    <label for=\"Pass\">Password</label><br>\n");
      out.write("    <input type=\"password\" id=\"fname\" name=\"uni_password\" style=\"height:40px; width: 200px\" placeholder=\"   University registered Password..\" required=\"\">\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <input type=\"submit\" value=\"Submit\">\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
