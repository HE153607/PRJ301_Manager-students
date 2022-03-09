package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Teacher;
import Model.Student;
import java.util.ArrayList;

public final class individual_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"error.jsp", true, 8192, true);
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
      out.write("        <title>Individual</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        <form action=\"./\" method=\"post\" name=\"form-l\">\n");
      out.write("            ");
 
                
                if(request.getAttribute("info")==null)
                response.sendRedirect("list/individual");
                Teacher b=(Teacher)request.getAttribute("info");
            
      out.write("\n");
      out.write("            <style>\n");
      out.write("                body{\n");
      out.write("                    position: relative;\n");
      out.write("                    overflow-x:  hidden;\n");
      out.write("                }\n");
      out.write("                header{\n");
      out.write("                    display: flex;\n");
      out.write("                    justify-content: space-between;\n");
      out.write("                    position: fixed;\n");
      out.write("                    top: 0;\n");
      out.write("                    width: 99vw;\n");
      out.write("                    height: 167px;\n");
      out.write("                    background-color: beige;\n");
      out.write("                }\n");
      out.write("                .head{\n");
      out.write("                    background-color: gainsboro;\n");
      out.write("                    width: 99vw;position: fixed;\n");
      out.write("                    top:22.3%;\n");
      out.write("                    height: 100px;\n");
      out.write("                    \n");
      out.write("                    text-align: center;\n");
      out.write("                }\n");
      out.write("                .head h1{\n");
      out.write("                    margin-bottom: 20px;\n");
      out.write("                }\n");
      out.write("                .head a{ \n");
      out.write("                    margin-left: 20px;\n");
      out.write("                }\n");
      out.write("                .in{\n");
      out.write("                     margin-top: 269px;\n");
      out.write("                    background-color: #cccccc;\n");
      out.write("                    width: 99vw;\n");
      out.write("                }\n");
      out.write("                .hleft{\n");
      out.write("                    float: left;\n");
      out.write("                    height: 483px;\n");
      out.write("                    width: 40%;\n");
      out.write("                }\n");
      out.write("                .hleft img{\n");
      out.write("                    width: 100%;\n");
      out.write("                    height: 100%;\n");
      out.write("                }\n");
      out.write("                .hright{\n");
      out.write("                    float: right;\n");
      out.write("                    width: 57%;\n");
      out.write("                    height: 483px;\n");
      out.write("                    background-color: #cccccc;\n");
      out.write("                    padding-left: 3%;\n");
      out.write("                }\n");
      out.write("                .frame{\n");
      out.write("                    width: 20%;\n");
      out.write("                    height: 185px;\n");
      out.write("                }\n");
      out.write("                .frame img{\n");
      out.write("                    border-radius: 7px;\n");
      out.write("                    width: 100%;\n");
      out.write("                    height: 165px;\n");
      out.write("                }\n");
      out.write("                .in4 a{\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    background-color: #bad1fa;\n");
      out.write("                    border-radius: 4px;\n");
      out.write("                    padding: 10px 7px;\n");
      out.write("                    color: black;vertical-align: middle;\n");
      out.write("                }\n");
      out.write("                .in4 button{\n");
      out.write("                    margin-left: 10px;\n");
      out.write("                    margin-right: 10px;\n");
      out.write("                    background-color: #bad1fa;\n");
      out.write("                    border-radius: 4px;\n");
      out.write("                    padding: 11px 7px;  \n");
      out.write("                    color: black;\n");
      out.write("                    border: none;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                }\n");
      out.write("                .in4{\n");
      out.write("                    align-items: center;\n");
      out.write("                    width: 70%;\n");
      out.write("                    display: flex;\n");
      out.write("                    justify-content: space-between;\n");
      out.write("                    padding-right: 60px;\n");
      out.write("                }\n");
      out.write("                li{\n");
      out.write("                    border-bottom: 1px solid black;\n");
      out.write("                    height: 20px;\n");
      out.write("                    width: 100%;\n");
      out.write("                    list-style-type: none;\n");
      out.write("                    background-color: #ffffff;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                }ul{\n");
      out.write("                    position: absolute;\n");
      out.write("                    top:115px;\n");
      out.write("                    right: 138px;\n");
      out.write("                    \n");
      out.write("                    display: block;\n");
      out.write("                    background-color: #cccccc;\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                li:hover{\n");
      out.write("                    \n");
      out.write("                    background-color: #ccffff;\n");
      out.write("                }\n");
      out.write("                .set{\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("            <header>\n");
      out.write("                <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIOA8gn2Q36sSKPCW7yf_pz712jwbIHvJUEQ&usqp=CAU\"/>\n");
      out.write("                <div style=\"display:flex;width: 400px;height: 100%;padding-right: 60px;\">\n");
      out.write("                    <img src=\"/manager/image/");
if (b.getImg() == null || b.getImg().trim().equals("")) {
      out.print("profile.jfif");
} else {
      out.print(b.getImg());
 }
      out.write("\">\n");
      out.write("                    <div>\n");
      out.write("                        <p>Campus:");
      out.print(b.getCampus());
      out.write("</p>\n");
      out.write("                        <p>Email:");
      out.print(b.getEmail());
      out.write("</p>\n");
      out.write("                        <img id=\"set\" style=\"cursor: pointer;width:30px;height:30px;\" src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcTRtwtu2UDtXRt6H87BmJeHqJvj4U09V2ZQ&usqp=CAU\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        <ul name=\"set\" class=\"set\" style=\"margin: 0;padding: 0;width:120px;height:40px;border: 1px solid black;\">\n");
      out.write("                            <li name=\"logout\">log out</li>  \n");
      out.write("                            <li><a href=\"/manager/change\">change password</a></li>  \n");
      out.write("                        </ul>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"head\">\n");
      out.write("                <h1>Manager Student</h1>\n");
      out.write("                <a class=\"1\" href=\"/manager/list\">List Of Students</a>\n");
      out.write("                <a class=\"1\" href=\"/individual\">Individual</a>\n");
      out.write("            </div>     \n");
      out.write("                        \n");
      out.write("                <div class=\"in\">\n");
      out.write("                    <div class=\"hleft\">\n");
      out.write("                        <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDmdcW4LanNtXrBBcfaz8_lJTU_sD_cITM6g&usqp=CAU\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"hright\">\n");
      out.write("                        <div style=\"display: flex;margin-bottom: 0;\">\n");
      out.write("                            <h2 style=\"margin-bottom: 10px;\">Your Name:");
      out.print(b.getName());
      out.write("</h2>   \n");
      out.write("                        </div>\n");
      out.write("                        <h2 style=\"margin-top: 0;\">ID:");
      out.print(session.getAttribute("id"));
      out.write("</h2>\n");
      out.write("                        code join:<Strong> ");
      out.print(b.getCode());
      out.write("</Strong>\n");
      out.write("                        <div style=\"background-color: cadetblue;border-radius: 3px;padding: 5px 2px;width:120px;height:20px;cursor:pointer;\" class=\"join\">change Code Join </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <script> \n");
      out.write("                let u=0;\n");
      out.write("                document.getElementById(\"set\").onclick = function (){\n");
      out.write("                    if(u===1){\n");
      out.write("                 document.getElementsByName(\"set\")[0].style.display=\"block\";u=0;}\n");
      out.write("             else {document.getElementsByName(\"set\")[0].style.display=\"none\";u=1;}\n");
      out.write("                };\n");
      out.write("                document.getElementsByName(\"logout\")[0].onclick = function (){\n");
      out.write("                    var input1= document.createElement(\"input\");\n");
      out.write("                       input1.type=\"text\";\n");
      out.write("                       input1.value=\"logout\";\n");
      out.write("                       input1.name=\"out\";\n");
      out.write("                       input1.style.visibility='hidden';\n");
      out.write("                       document.getElementsByName(\"logout\")[0].appendChild(input1);\n");
      out.write("                       document.getElementsByName(\"form-l\")[0].action=\"individual\";\n");
      out.write("                  document.getElementsByName(\"form-l\")[0].submit();  \n");
      out.write("                };\n");
      out.write("                document.getElementsByClassName(\"join\")[0].onclick = function () {\n");
      out.write("                    var n = prompt(\"Enter your new code:\");\n");
      out.write("                    if (n !== null && n.trim()!== \"\") {\n");
      out.write("                       var input= document.createElement(\"input\");\n");
      out.write("                       input.type=\"text\";\n");
      out.write("                       input.value=n;\n");
      out.write("                       input.name=\"join\";\n");
      out.write("                       input.style.visibility='hidden';\n");
      out.write("                       document.getElementsByClassName(\"join\")[0].appendChild(input);\n");
      out.write("                       document.getElementsByName(\"form-l\")[0].action=\"individual\";\n");
      out.write("                        document.getElementsByName(\"form-l\")[0].submit();\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                \n");
      out.write("            </script>\n");
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
