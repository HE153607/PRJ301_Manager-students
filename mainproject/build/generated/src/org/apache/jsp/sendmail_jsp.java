package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sendmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Send mail</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            html{\n");
      out.write("                width: 100vw;\n");
      out.write("                height: 100vh;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("              width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                background:linear-gradient(to bottom left, white, yellow);\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                background:linear-gradient(to bottom left, #ccffff, #ccffcc);  \n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                width: 250px;\n");
      out.write("            }\n");
      out.write("            textarea{\n");
      out.write("                width: 252px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <form method=\"post\" action=\"mail\" enctype=\"multipart/form-data\">\n");
      out.write("            ");

            if(request.getSession().getAttribute("id")==null){
            response.sendRedirect("login.jsp");
        }System.out.println(request.getSession().getAttribute("id"));
            
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Your email:</td>  \n");
      out.write("                    <td><input type=\"mail\" name=\"mail\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>password:</td>  \n");
      out.write("                    <td><input type=\"password\" name=\"pass\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Subject:</td>  \n");
      out.write("                    <td><textarea name=\"subject\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Content:</td>  \n");
      out.write("                    <td><textarea name=\"content\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>file:</td>  \n");
      out.write("                    <td><input type=\"file\" id=\"file\" name=\"file\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>  \n");
      out.write("                    <td><button>Send</button></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </form>\n");
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
