package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Login</title>\n");
      out.write("        <script>\n");
      out.write("function validLogin(){\n");
      out.write("if (document.form.username.value == \"\"){\n");
      out.write("alert ( \"Please enter Login Name.\" );\n");
      out.write("document.loginform.username.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.form.password.value == \"\"){\n");
      out.write("alert ( \"Please enter password.\" );\n");
      out.write("document.userform.password.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("alert ( \"Welcome User\" );\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <form name=\"loginform\" method=\"post\" action=\"loginbean.jsp\">\n");
      out.write("<br><br>\n");
      out.write("<table align=\"center\"><tr><td><h2>Login Authentication</h2></td></tr></table>\n");
      out.write("<table width=\"300px\" align=\"center\" style=\"border:1px solid #000000;background-color:#efefef;\">\n");
      out.write("<tr><td colspan=2></td></tr>\n");
      out.write("<tr><td colspan=2>&nbsp;</td></tr>\n");
      out.write("  <tr>\n");
      out.write("  <td><b>Login Name</b></td>\n");
      out.write("  <td><input type=\"text\" name=\"username\" value=\"\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("  <td><b>Password</b></td>\n");
      out.write("  <td><input type=\"password\" name=\"password\" value=\"\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("  <td></td>\n");
      out.write("  <td><input type=\"submit\" name=\"Submit\" value=\"Submit\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr><td colspan=2>&nbsp;</td></tr>\n");
      out.write("</table>\n");
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
