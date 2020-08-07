package org.apache.jsp.dashbord;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentDashbordJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Students Dashboard</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("body { \n");
      out.write("  margin: 0;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navbar {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  padding: 90px 10px;\n");
      out.write("  transition: 0.4s;\n");
      out.write("  position: fixed;\n");
      out.write("  width: 100%;\n");
      out.write("  top: 0;\n");
      out.write("  z-index: 99;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navbar a {\n");
      out.write("  float: left;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 12px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 18px; \n");
      out.write("  line-height: 25px;\n");
      out.write("  border-radius: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navbar #logo {\n");
      out.write("  font-size: 35px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  transition: 0.4s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navbar a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navbar a.active {\n");
      out.write("  background-color: dodgerblue;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navbar-right {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 580px) {\n");
      out.write("  #navbar {\n");
      out.write("    padding: 20px 10px !important;\n");
      out.write("  }\n");
      out.write("  #navbar a {\n");
      out.write("    float: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("  }\n");
      out.write("  #navbar-right {\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"navbar\">\n");
      out.write("  <a href=\"#default\" id=\"logo\">Students</a>\n");
      out.write("  <div id=\"navbar-right\">\n");
      out.write("    <a class=\"active\" href=\"http://localhost:8080/plymouthapp/events/studentRetriveEvent.jsp\"> Industry Events </a>\n");
      out.write("    <a href=\"http://localhost:8080/plymouthapp/events/studentRetriveuniEventsJsp.jsp\"> University Events</a>\n");
      out.write("    <a href=\"http://localhost:8080/plymouthapp/events/retrieveUniPostJsp.jsp\">All University Events</a>\n");
      out.write("    <a href=\"http://localhost:8080/plymouthapp/events/retrieveIndustyPostJsp.jsp\">All Industry Events</a>\n");
      out.write("    <a href=\"http://localhost:8080/plymouthapp/events/industryPostEvents.jsp\">Category Events</a>\n");
      out.write("     <a href=\"http://localhost:8080/plymouthapp/dashbord/dashboardJsp.jsp\">Log Out</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"margin-top:210px;padding:15px 15px 750px;font-size:30px\">\n");
      out.write("  <p>Annual events organized by different industries !</p>\n");
      out.write("  <p>can be made visible to universities and students can prepare for such events well in advance. This may be meet ups.</p>\n");
      out.write("  <p><b>Note:</b> . University or the faculty can provide a login within the university domain. So, industry can select a university when uploading posts or events particular to the university. .</p>\n");
      out.write("  <p>Collaboration is limited for industry talks, workshops and guest lectures. But a strong collaboration can do \n");
      out.write("      lot more than this. Research collaboration is one among that and industries can upload problems to be solved and University students can take over these as their final research projects and deliver it with the mentoring of industry and with the academic supervisor.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// When the user scrolls down 80px from the top of the document, resize the navbar's padding and the logo's font size\n");
      out.write("window.onscroll = function() {scrollFunction()};\n");
      out.write("\n");
      out.write("function scrollFunction() {\n");
      out.write("  if (document.body.scrollTop > 80 || document.documentElement.scrollTop > 80) {\n");
      out.write("    document.getElementById(\"navbar\").style.padding = \"30px 10px\";\n");
      out.write("    document.getElementById(\"logo\").style.fontSize = \"25px\";\n");
      out.write("  } else {\n");
      out.write("    document.getElementById(\"navbar\").style.padding = \"80px 10px\";\n");
      out.write("    document.getElementById(\"logo\").style.fontSize = \"35px\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
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
