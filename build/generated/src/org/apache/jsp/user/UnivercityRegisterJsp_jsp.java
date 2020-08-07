package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UnivercityRegisterJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>University Registration</title>\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
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
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #009933;\n");
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
      out.write("  margin-top: 6px;\n");
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
      out.write("        <h1 style=\"color: #4d88ff\">University Register </h1>\n");
      out.write("        <h3 style=\"color: #a6a6a6;\"> Fill with University Details</h3> \n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <form  method=\"post\" action=\"../universityRegisterServlet\" enctype=\"multipart/form-data\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"country\">University</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <select id=\"country\" name=\"name\" required>\n");
      out.write("          <option value=\"\">Select Your University</option>  \n");
      out.write("          <option value=\"University of Colombo\">University of Colombo (Western Province)</option>\n");
      out.write("          <option value=\"University of Peradeniy\">University of Peradeniya (Central Province)</option>\n");
      out.write("          <option value=\"University of Ruhuna \">University of Ruhuna (Southern Province)</option>\n");
      out.write("           <option value=\"NSBM\">NSBM(Western Province)</option>\n");
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
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"Subjects\">Subjects </label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("         <input type=\"checkbox\" name=\"interestingSubjects\" value=\"Law\" > All<br>\n");
      out.write("         <input type=\"checkbox\" name=\"interestingSubjects\" value=\"Software Engineering\" > Software Engineering<br>\n");
      out.write("         <input type=\"checkbox\" name=\"interestingSubjects\" value=\"Network Engineer\" > Network Engineer<br>    \n");
      out.write("         <input type=\"checkbox\" name=\"interestingSubjects\" value=\"Computer Security\" > Computer Security<br>\n");
      out.write("         <input type=\"checkbox\" name=\"interestingSubjects\" value=\"Medicine\" > Medicine<br>\n");
      out.write("         <input type=\"checkbox\" name=\"interestingSubjects\" value=\"Accounting & Finance\" > Accounting & Finance<br>    \n");
      out.write("         <input type=\"checkbox\" name=\"interestingSubjects\" value=\"Business & Management\" > Business & Management<br>\n");
      out.write("         <input type=\"checkbox\" name=\"interestingSubjects\" value=\"Medicine\" > Medicine<br>\n");
      out.write("         <input type=\"checkbox\" name=\"interestingSubjects\" value=\"Law\" > Law<br>    \n");
      out.write("         <input type=\"checkbox\" name=\"interestingSubjects\" value=\"Architecture\" > Architecture<br>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"eventVenue\">Email</label>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"eventVenue\" name=\"email\" placeholder=\"We will Send your Account Details via This Email..\"required>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("          <label for=\"lname\">Legal Document For Verification</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("          <input type=\"file\" accept=\"application/pdf\" id=\"eventVenue\" name=\"emaile\" style=\"margin-top:10px\" placeholder=\"University ID\"required> \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"subject\">Other Details</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <textarea id=\"subject\" name=\"discription\" placeholder=\"Description here..\" style=\"height:200px\"></textarea>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <input type=\"submit\" value=\"Register\">\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("    \n");
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
