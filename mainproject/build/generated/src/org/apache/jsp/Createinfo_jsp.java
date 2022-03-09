package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Createinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            html{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                width: 100vw;\n");
      out.write("                height: 98vh;\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: yellow;\n");
      out.write("                text-align: center;\n");
      out.write("                height: 50vh;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                height: 30px;\n");
      out.write("                width: 200px;\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        if(request.getSession().getAttribute("user")==null)
        response.sendRedirect("login.html");
        
      out.write("\n");
      out.write("        <form action=\"add\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("        <table>\n");
      out.write("            <tbody><tr>\n");
      out.write("                <td>your's Name:</td>\n");
      out.write("                <td><input type=\"text\" name=\"name\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Email:</td>\n");
      out.write("                <td><input type=\"text\" name=\"email\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>image:</td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"file\" name=\"file\" id=\"file\" accept=\".jpg,.png,.jfif\" style=\"display:none;\">\n");
      out.write("                    <label for=\"file\">Choose your image</label>\n");
      out.write("                    <img src=\"#\" style=\"width:90px;height: 110px;\" name=\"image\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Code join(send to your student to join):</td>\n");
      out.write("                <td><input type=\"text\" name=\"code\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("        </table>\n");
      out.write("        <button>OK</button>\n");
      out.write("            ");

            if(request.getAttribute("error")!=null){
            
      out.write("\n");
      out.write("            <p style=\"color: red;\">");
      out.print(request.getAttribute("error"));
      out.write("</p>\n");
      out.write("            ");
 
            }
            
      out.write("\n");
      out.write("         <script>\n");
      out.write("                document.getElementsByName(\"file\")[0].onchange=function (e){\n");
      out.write("                    document.getElementsByName(\"image\")[0].style.display='block';\n");
      out.write("                   document.getElementsByName(\"image\")[0].src=URL.createObjectURL(e.target.files[0]);\n");
      out.write("                };\n");
      out.write("            </script>\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
