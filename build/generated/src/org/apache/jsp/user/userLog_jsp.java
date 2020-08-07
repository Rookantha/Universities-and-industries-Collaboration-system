package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userLog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Login</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* style the container */\n");
      out.write(".container {\n");
      out.write("  position: relative;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 20px 0 30px 0;\n");
      out.write("} \n");
      out.write("\n");
      out.write("/* style inputs and link buttons */\n");
      out.write("input,select,option ,\n");
      out.write(".btn {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  margin: 5px 0;\n");
      out.write("  opacity: 0.85;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 17px;\n");
      out.write("  line-height: 20px;\n");
      out.write("  text-decoration: none; /* remove underline from anchors */\n");
      out.write("}\n");
      out.write("\n");
      out.write("input:hover,\n");
      out.write(".btn:hover {\n");
      out.write("  opacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* add appropriate colors to fb, twitter and google buttons */\n");
      out.write(".fb {\n");
      out.write("  background-color: #3B5998;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".twitter {\n");
      out.write("  background-color: #55ACEE;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".github {\n");
      out.write("  background-color: #000066;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* style the submit button */\n");
      out.write("input[type=submit] \n");
      out.write("{\n");
      out.write("  background-color: #595959;\n");
      out.write("  color: white;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #ff0000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Two-column layout */\n");
      out.write(".col {\n");
      out.write("  float: left;\n");
      out.write("  width: 50%;\n");
      out.write("  margin: auto;\n");
      out.write("  padding: 0 50px;\n");
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
      out.write("/* vertical line */\n");
      out.write(".vl {\n");
      out.write("  position: absolute;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%);\n");
      out.write("  border: 2px solid #ddd;\n");
      out.write("  height: 175px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* text inside the vertical line */\n");
      out.write(".vl-innertext {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  padding: 8px 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* hide some text on medium and large screens */\n");
      out.write(".hide-md-lg {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* bottom container */\n");
      out.write(".bottom-container \n");
      out.write("{\n");
      out.write("  width: 600px;\n");
      out.write("  text-align: center;\n");
      out.write("  background-color: #737373;\n");
      out.write("  border-radius: 4px 4px 4px 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - when the screen is less than 650px wide, make the two columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 650px) {\n");
      out.write("  .col {\n");
      out.write("    width: 100%;\n");
      out.write("    margin-top: 0;\n");
      out.write("  }\n");
      out.write("  /* hide the vertical line */\n");
      out.write("  .vl {\n");
      out.write("    display: none;\n");
      out.write("  }\n");
      out.write("  /* show the hidden text on small screens */\n");
      out.write("  .hide-md-lg {\n");
      out.write("    display: block;\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>  \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h1 style=\"color: #4d88ff\" > Connect with.....  </h1>\n");
      out.write("         <h2 style=\"color: #a6a6a6;\" >700000+ Students , 58+ Universities , 100+ Companies , 8900+ Events islandwide ....<h2/>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <form   method=\"post\" action=\"../LoginServlet\" >\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <h2 style=\"text-align:center\">Login </h2>\n");
      out.write("      <div class=\"vl\">\n");
      out.write("        <span class=\"vl-innertext\">or</span>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col\">\n");
      out.write("        <a href=\"https://www.facebook.com/\" class=\"fb btn\">\n");
      out.write("          <i class=\"fa fa-facebook fa-fw\"></i> Login with Facebook\n");
      out.write("         </a>\n");
      out.write("        <a href=\"https://twitter.com/\" class=\"twitter btn\">\n");
      out.write("          <i class=\"fa fa-twitter fa-fw\"></i> Login with Twitter\n");
      out.write("        </a>\n");
      out.write("        <a href=\"https://github.com/login\" class=\"github btn\"><i class=\"fa fa-github fa-fw\">\n");
      out.write("          </i> Login with GitHub\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col\">\n");
      out.write("        <div class=\"hide-md-lg\">\n");
      out.write("          <p>Or sign in manually:</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <input type=\"text\" name=\"username\" placeholder=\"Username\" required>\n");
      out.write("        \n");
      out.write("        <select name=\"userType\" required>\n");
      out.write("                <option value=\"\">User Type</option>\n");
      out.write("                <option value=\"student\">student</option>\n");
      out.write("                <option value=\"univercity\">university</option>\n");
      out.write("                <option value=\"industry\">industry</option>\n");
      out.write("                <option value=\"member\">member</option>\n");
      out.write("                <option value=\"administrator\">administrator</option>\n");
      out.write("                \n");
      out.write("        </select>\n");
      out.write("  \n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"Password\" pattern=\".{3,}\" title=\"Six or more characters\" required/>\n");
      out.write("        <input type=\"submit\" value=\"Login\" />\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("             <input type=\"submit\" value=\"Forgot Password..?\"/>\n");
      out.write("             <input type=\"submit\" value=\"Back to Home Page\" onclick=\"window.location='http://localhost:8080/plymouthapp/dashbord/dashboardJsp.jsp';\"/>                    \n");
      out.write("           \n");
      out.write("</body>\n");
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
