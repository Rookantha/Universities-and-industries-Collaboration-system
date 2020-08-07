package org.apache.jsp.dashbord;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Locale.Category;
import java.util.ArrayList;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import dbConnection.DbConnection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class universityHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("   \n");
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>University Home</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("\n");
      out.write(".sidebar {\n");
      out.write("  height: 100%;\n");
      out.write("  width: 0;\n");
      out.write("  position: fixed;\n");
      out.write("  z-index: 1;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  background-color: #111;\n");
      out.write("  overflow-x: hidden;\n");
      out.write("  transition: 0.5s;\n");
      out.write("  padding-top: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar a {\n");
      out.write("  padding: 8px 8px 8px 32px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 25px;\n");
      out.write("  color: #818181;\n");
      out.write("  display: block;\n");
      out.write("  transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar a:hover {\n");
      out.write("  color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar .closebtn {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  right: 25px;\n");
      out.write("  font-size: 36px;\n");
      out.write("  margin-left: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".openbtn {\n");
      out.write("  font-size: 20px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  background-color: #111;\n");
      out.write("  color: white;\n");
      out.write("  padding: 10px 15px;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".openbtn:hover {\n");
      out.write("  background-color: #444;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#main {\n");
      out.write("  transition: margin-left .5s;\n");
      out.write("  padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */\n");
      out.write("@media screen and (max-height: 450px) {\n");
      out.write("  .sidebar {padding-top: 15px;}\n");
      out.write("  .sidebar a {font-size: 18px;}\n");
      out.write("}\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write(".form-inline {  \n");
      out.write("  display: flex;\n");
      out.write("  flex-flow: row wrap;\n");
      out.write("  align-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-inline label,select {\n");
      out.write("  margin: 5px 10px 5px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-inline input,select {\n");
      out.write("  vertical-align: middle;\n");
      out.write("  margin: 5px 10px 5px 0;\n");
      out.write("  padding: 10px;\n");
      out.write("  background-color: #fff;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-inline button {\n");
      out.write("  padding: 10px 20px;\n");
      out.write("  background-color:#009900;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  color: white;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-inline button:hover {\n");
      out.write("  background-color: #ff0000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#select {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (max-width: 800px) {\n");
      out.write("  .form-inline input {\n");
      out.write("    margin: 10px 0;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .form-inline {\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: stretch;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".dropbtn \n");
      out.write("{\n");
      out.write("  background-color: #111;\n");
      out.write("  padding: 8px 8px 8px 32px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 25px;\n");
      out.write("  color: #818181;\n");
      out.write("  display: block;\n");
      out.write("  transition: 0.3s;  \n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropbtn:hover, .dropbtn:focus {\n");
      out.write("  color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown \n");
      out.write("{\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content \n");
      out.write("{\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color: #fff;\n");
      out.write("  min-width: 160px;\n");
      out.write("  overflow: auto;\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown a:hover {\n");
      out.write("    background-color: #ff0000;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".show {display: block;}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"mySidebar\" class=\"sidebar\">\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">×</a>\n");
      out.write("  <a href=\"http://localhost:8080/plymouthapp/events/universityPostEventsJsp.jsp\">Post Event</a>\n");
      out.write("  <a href=\"http://localhost:8080/plymouthapp/events/retrieveIndustyPostJsp.jsp\">Corporate Events</a>\n");
      out.write("  <a href=\"http://localhost:8080/plymouthapp/events/retrieveUniPostJsp.jsp\">Professional Events</a>\n");
      out.write("  \n");
      out.write("   <div class=\"dropdown\">\n");
      out.write("      <button onClick=\"myFunction()\" class=\"dropbtn\">Academic<br>Calender</button>\n");
      out.write("  <div id=\"myDropdown\" class=\"dropdown-content\">\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      ");

      
            try
            {
                DbConnection db = new DbConnection();
                Connection con = db.getConnection();
                
            String UType = "univercity";
            String Check_query="select univercity from register where userType=?";
            PreparedStatement Check_preparedStmt = con.prepareStatement(Check_query);
            Check_preparedStmt.setString(1,UType);
            ArrayList UniName  = new ArrayList();
            ResultSet Check_rs = Check_preparedStmt.executeQuery();
                while(Check_rs.next())
                {
                    UniName.add(Check_rs.getString("Univercity"));
                }
            }
            catch(ClassNotFoundException | SQLException ex)
            {
                out.println(ex);
            }   
      out.write("\n");
      out.write("      \n");
      out.write("      <table>\n");
      out.write("    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.UniName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"UniName\">\n");
      out.write("        <tr>\n");
      out.write("           <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UniName.Name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("    </c:forEach>\n");
      out.write("</table>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("                    \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    \n");
      out.write("    <a href=\"http://localhost:8080/plymouthapp/calender/colUniCalenderPost.jsp\">Colombo University Calender</a>\n");
      out.write("    <a href=\"http://localhost:8080/plymouthapp/calender/paradeniyaUniCalenderPost.jsp\">Peradeniya University Calender</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("  <script>\n");
      out.write("/* When the user clicks on the button, \n");
      out.write("toggle between hiding and showing the dropdown content */\n");
      out.write("function myFunction() {\n");
      out.write("  document.getElementById(\"myDropdown\").classList.toggle(\"show\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Close the dropdown if the user clicks outside of it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (!event.target.matches('.dropbtn')) {\n");
      out.write("    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\n");
      out.write("    var i;\n");
      out.write("    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("      var openDropdown = dropdowns[i];\n");
      out.write("      if (openDropdown.classList.contains('show')) {\n");
      out.write("        openDropdown.classList.remove('show');\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("  <a href=\"http://localhost:8080/plymouthapp/research/researchHome.jsp\">Research</a>\n");
      out.write("  <a onclick=\"Navigate()\" style=\"cursor: pointer;\">Logout</a>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    function Navigate()\n");
      out.write("    {   \n");
      out.write("         window.location.replace('http://localhost:8080/plymouthapp/user/userLog.jsp');\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("   </script>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"main\">\n");
      out.write("  <button class=\"openbtn\" onclick=\"openNav()\">☰ University </button>  \n");
      out.write("   <h3>Sharing With University and Industry Talks , Workshops , Events , Research , Academic Calendar Mach more ....</h3>\n");
      out.write("<div id = \"select\">      \n");
      out.write("   <h3>Check the Activities by Category...</h3>\n");
      out.write("\n");
      out.write("<form class=\"form-inline\" action=\"../univercityHomeServlet\" method=\"post\">\n");
      out.write("  <label for=\"uni\">Category</label>\n");
      out.write("        <select id=\"country\" name=\"event\"required>\n");
      out.write("        <option value=\"professional\">Professional</option>\n");
      out.write("        <option value=\"corporate\">Corporate</option> \n");
      out.write("        <option value=\"calender\">Calender</option>  \n");
      out.write("</select>  \n");
      out.write("  \n");
      out.write("<label for=\"uni\">University</label>\n");
      out.write("\n");
      out.write("        <select id=\"country\" name=\"univercity\">\n");
      out.write("        <option value=\"University-of-Colombo\">University of Colombo (Western Province)</option>\n");
      out.write("        <option value=\"University-of-Peradeniya\">University of Peradeniya (Central Province)</option>\n");
      out.write("        <option value=\"NSBM\">NSBM(Western Province)</option>\n");
      out.write("         \n");
      out.write("</select>\n");
      out.write("        <br>\n");
      out.write("  \n");
      out.write("<button type=\"submit\">Enter</button>\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write(" </div>   \n");
      out.write(" </div>   \n");
      out.write("    <br>\n");
      out.write("    <h3 style=\"color: #009900\"> All Industrial Events .......</h3>\n");
      out.write("    <br>\n");
      out.write("<table align=\"center\" style=\"border:1px solid #000000;\">\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function openNav() {\n");
      out.write("  document.getElementById(\"mySidebar\").style.width = \"250px\";\n");
      out.write("  document.getElementById(\"main\").style.marginLeft = \"250px\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function closeNav() {\n");
      out.write("  document.getElementById(\"mySidebar\").style.width = \"0\";\n");
      out.write("  document.getElementById(\"main\").style.marginLeft= \"0\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<div style=\"margin-top:25px;padding:8px 8px 8px;font-size:18px\">\n");
      out.write("     ");

String id = request.getParameter("userId");
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
      out.write("\n");
      out.write("<table align=\"center\" cellpadding=\"8\" cellspacing=\"10\" border=\"0\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#009900\">\n");
      out.write("<td><b><font color=\"White\">Industry Name</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Event Category</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Event Name</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Selected Universities</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Selected Subjects</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Event Venue</font></b></td> \n");
      out.write("<td><b><font color=\"White\">Event Time</font></b></td>\n");
      out.write("<td><b><font color=\"White\">Description</font></b></td> \n");
      out.write("\n");
      out.write("</tr>\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName , userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM industry_post_events ORDER BY eventTime DESC";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<tr bgcolor=\"#e6ffe6\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("industryName") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("eventCategory") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("eventName") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("tagUnivercity") );
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
      out.write("<td>");
      out.print(resultSet.getString("discription") );
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
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
