package org.apache.jsp.events;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eventsJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" meta name=\"viewport\">\n");
      out.write("        <title>Events</title>\n");
      out.write("        \n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create a column layout with Flexbox */\n");
      out.write(".row {\n");
      out.write("  display: flex;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Left column (menu) */\n");
      out.write(".left {\n");
      out.write("  flex: 35%;\n");
      out.write("  padding: 15px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left h2 {\n");
      out.write("  padding-left: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Right column (page content) */\n");
      out.write(".right {\n");
      out.write("  flex: 65%;\n");
      out.write("  padding: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the search box */\n");
      out.write("#mySearch {\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 18px;\n");
      out.write("  padding: 11px;\n");
      out.write("  border:1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the navigation menu inside the left column */\n");
      out.write("#myMenu {\n");
      out.write("  list-style-type: none;\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myMenu li a {\n");
      out.write("  backgound-color: #66ff66;\n");
      out.write("  padding: 12px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 18px;\n");
      out.write("  color: White;\n");
      out.write("  display: block\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myMenu li a:hover {\n");
      out.write("  background-color: #000;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("<h2> Events Happening Around You</h2>\n");
      out.write("<p>Start to type for a specific category inside the search bar to \"filter\" the search options.</p>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"left\" style=\"background-color:#00cc00;\">\n");
      out.write("    <h2>EVENTS</h2>\n");
      out.write("    <input type=\"text\" id=\"mySearch\" onkeyup=\"myFunction()\" placeholder=\"Search..\" title=\"Type in a category\">\n");
      out.write("    <ul id=\"myMenu\">\n");
      out.write("        <li><a href=\"#\">Computer Science</a></li>\n");
      out.write("      <li><a href=\"#\">Software Engineering</a></li>\n");
      out.write("      <li><a href=\"#\">Network Engineer</a></li>\n");
      out.write("      <li><a href=\"#\">Engineering</a></li>\n");
      out.write("      <li><a href=\"#\">Medicine</a></li>\n");
      out.write("      <li><a href=\"#\">Accounting & Finance</a></li>\n");
      out.write("      <li><a href=\"#\">Business & Management</a></li>\n");
      out.write("      <li><a href=\"#\">Law</a></li>\n");
      out.write("      <li><a href=\"#\">Architecture</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"right\" style=\"background-color:#99ff99;\">\n");
      out.write("    <h2>About Professional Events</h2>\n");
      out.write("    \n");
      out.write("    <h4>  Professional Events provides a full service for events and conference planning and production. </h2>\n");
      out.write("\n");
      out.write("    <p> Areas of Expertise:</p>\n");
      out.write("    <p>Organization and provision of conferences for professionals\n");
      out.write("    Full venue finding service\n");
      out.write("    Organization of delegations to island wide events\n");
      out.write("    Integration of trade exhibitions\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("    <p>Organizing events for targeted groups </p>\n");
      out.write(" \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function myFunction() {\n");
      out.write("  var input, filter, ul, li, a, i;\n");
      out.write("  input = document.getElementById(\"mySearch\");\n");
      out.write("  filter = input.value.toUpperCase();\n");
      out.write("  ul = document.getElementById(\"myMenu\");\n");
      out.write("  li = ul.getElementsByTagName(\"li\");\n");
      out.write("  for (i = 0; i < li.length; i++) {\n");
      out.write("    a = li[i].getElementsByTagName(\"a\")[0];\n");
      out.write("    if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("      li[i].style.display = \"\";\n");
      out.write("    } else {\n");
      out.write("      li[i].style.display = \"none\";\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
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
