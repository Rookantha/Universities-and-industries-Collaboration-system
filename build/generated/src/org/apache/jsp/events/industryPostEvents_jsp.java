package org.apache.jsp.events;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class industryPostEvents_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Events</title>\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text],select, textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  padding: 12px 12px 12px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  background-color: #595959;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #ff0000;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("  float: left;\n");
      out.write("  width: 25%;\n");
      out.write("  margin-top: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("  float: left;\n");
      out.write("  width: 75%;\n");
      out.write("  margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  .col-25, .col-75, input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    margin-top: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"color: #4d88ff\">Industry Events Post Form</h1>\n");
      out.write("        <h3 style=\"color: #a6a6a6;\"> Fill with Your Event Details</h3> \n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <form  method=\"post\" action=\"../IndustryPostEventsServlet\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"industryName\">Industry Name</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"fname\" name=\"name\" placeholder=\"Your Industry Name ...\"required>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"country\">Corporate Events </label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <select id=\"country\" name=\"eventCategory\"required>\n");
      out.write("          <option value=\"\">Select Event Category </option>\n");
      out.write("          <option value=\"Interviews\">Interviews</option>\n");
      out.write("          <option value=\"Seminars and Conferences\">Seminars and Conferences</option>\n");
      out.write("          <option value=\"Trade Shows\">Trade Shows</option>\n");
      out.write("           <option value=\"Team-Building Events\">Team-Building Events</option>\n");
      out.write("        <option value=\"other\">Other</option>\n");
      out.write("          \n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"lname\">Event Name</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"lname\" name=\"eventName\" placeholder=\"Your Event Name..\"required>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("       <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"country\">University</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"University of Colombo\" > University of Colombo (Western Province)<br>\n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"University of Ruhuna \" > University of Ruhuna (Southern Province)<br>    \n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"NSBM\" > NSBM(Western Province)  <br>\n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"University of Peradeniya\" > University of Peradeniya (Central Province)<br>\n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"University of Sri Jayewardenepura \" > University of Sri Jayewardenepura (Western Province)<br>    \n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"University of Kelaniya \" > University of Kelaniya (Western Province)<br>\n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"University of Moratuwa \" > University of Moratuwa (Western Province)<br>\n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"University of Jaffna \" > University of Jaffna (Northern Province)<br>    \n");
      out.write("          <input type=\"checkbox\" name=\"university\" value=\"University of Peradeniya\" > University of Peradeniya (Central Province)<br>\n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"University of Sri Jayewardenepura \" > University of Sri Jayewardenepura (Western Province)<br>    \n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"Eastern University Sri Lanka \" >South Eastern University Sri Lanka (Eastern Province)<br>\n");
      out.write("         <input type=\"checkbox\" name=\"university\" value=\"Open University of Sri Lanka\" > Open University of Sri Lanka(distance education)<br>    \n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"country\">Category</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"checkbox\" name=\"subjects\" value=\"Software Engineering\" > Software Engineering<br>\n");
      out.write("         <input type=\"checkbox\" name=\"subjects\" value=\"Network Engineer\" > Network Engineer<br>    \n");
      out.write("         <input type=\"checkbox\" name=\"subjects\" value=\"Computer Security\" > Computer Security<br>\n");
      out.write("         <input type=\"checkbox\" name=\"subjects\" value=\"Medicine\" > Medicine<br>\n");
      out.write("         <input type=\"checkbox\" name=\"subjects\" value=\"Accounting & Finance\" > Accounting & Finance<br>    \n");
      out.write("         <input type=\"checkbox\" name=\"subjects\" value=\"Business & Management\" > Business & Management<br>\n");
      out.write("         <input type=\"checkbox\" name=\"subjects\" value=\"Medicine\" > Medicine<br>\n");
      out.write("         <input type=\"checkbox\" name=\"subjects\" value=\"Law\" > Law<br>    \n");
      out.write("         <input type=\"checkbox\" name=\"subjects\" value=\"Architecture\" > Architecture<br>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"eventVenue\">Event Venue</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"eventVenue\" name=\"eventVenue\" placeholder=\"Your Event Venue..\"required>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"datetime-local\">Event Date And Time</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"datetime-local\" id=\"eventTime\" name=\"eventTime\" placeholder=\"Your Event Time..\"required>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"subject\">Subject</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <textarea id=\"subject\" name=\"discription\" placeholder=\"Description..\" style=\"height:200px\"></textarea>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
