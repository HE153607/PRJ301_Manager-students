package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.util.TreeMap;
import Model.Teacher;
import Model.Student;
import java.util.ArrayList;

public final class schedule_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>information</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"list\" method=\"post\" name=\"form-l\">\n");
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
      out.write("\n");
      out.write("                    text-align: center;\n");
      out.write("                }\n");
      out.write("                .head h1{\n");
      out.write("                    margin-bottom: 20px;\n");
      out.write("                }\n");
      out.write("                .head a{ \n");
      out.write("                    margin-left: 20px;\n");
      out.write("                }\n");
      out.write("                .out{\n");
      out.write("                    margin-left: 9vw;\n");
      out.write("                    width: 80vw;\n");
      out.write("                    margin-top: 270px;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                .outin{\n");
      out.write("                    background-color: #f7f7f7;\n");
      out.write("                    width: 100%;\n");
      out.write("                    height: 130px;\n");
      out.write("                    display: flex;\n");
      out.write("                    justify-content: space-between;\n");
      out.write("                    border-radius: 7px;\n");
      out.write("                    margin-bottom: 10px;\n");
      out.write("                    border: 1px solid black;\n");
      out.write("                }\n");
      out.write("                .frame{\n");
      out.write("                    width: 20%;\n");
      out.write("                    height: 185px;\n");
      out.write("                }\n");
      out.write("                .frame img{\n");
      out.write("                    border-radius: 7px;\n");
      out.write("                    width: 90%;\n");
      out.write("                    height: 130px;\n");
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
      out.write("\n");
      out.write("                    display: block;\n");
      out.write("                    background-color: #cccccc;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                li:hover{\n");
      out.write("\n");
      out.write("                    background-color: #ccffff;\n");
      out.write("                }\n");
      out.write("                .set{\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("                .cd input{\n");
      out.write("                    border-radius: 5px;\n");
      out.write("                    margin-top: 10px;\n");
      out.write("                    height: 25px;\n");
      out.write("                }\n");
      out.write("                .cd input:nth-of-type(2){\n");
      out.write("                    height: 31px; \n");
      out.write("                }\n");
      out.write("                nav{\n");
      out.write("                    margin-top: 15px;\n");
      out.write("                }\n");
      out.write("                nav a{\n");
      out.write("                    background-color: #cccccc;\n");
      out.write("                    padding: 5px 15px 5px 15px;\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    font-size: 20px;\n");
      out.write("                    font-weight: bold;\n");
      out.write("                    margin-right: 10px;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("            ");

               
            
      out.write("\n");
      out.write("            <header>\n");
      out.write("               \n");
      out.write("                <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIOA8gn2Q36sSKPCW7yf_pz712jwbIHvJUEQ&usqp=CAU\"/>\n");
      out.write("                <div style=\"display:flex;width: 400px;height: 100%;padding-right: 60px;\">\n");
      out.write("                    <img src=\"image/profile.jfif\">\n");
      out.write("                    <div> \n");
      out.write("                        <img id=\"set\" style=\"cursor: pointer;width:30px;height:30px;\" src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcTRtwtu2UDtXRt6H87BmJeHqJvj4U09V2ZQ&usqp=CAU\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul name=\"set\" class=\"set\" style=\"margin: 0;padding: 0;width:120px;height:40px;border: 1px solid black;\">\n");
      out.write("                    <li name=\"logout\">log out</li>  \n");
      out.write("                    <li><a style=\"text-decoration: none;color: black;\" href=\"change\">change password</a></li>  \n");
      out.write("                </ul>\n");
      out.write("            </header>\n");
      out.write("     ");
 if(request.getAttribute("delete")!=null||request.getAttribute("add")!=null||request.getAttribute("update")!=null||request.getAttribute("comment")!=null){
      out.write("\n");
      out.write("                        <div class=\"pupup\" style=\"width: 200px;height: 100px;background-color: #ccffcc;position: absolute;z-index: 1;\n");
      out.write("                             top: -260px;right:670px;text-align: center;\">\n");
      out.write("                             ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                             ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                             ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                             ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>   \n");
      out.write("                       ");
 }
      out.write(" \n");
      out.write("            <div class=\"head\">\n");
      out.write("                <h1>Manager Student</h1>\n");
      out.write("                <a class=\"1\" href=\"list\">List Of Students</a>\n");
      out.write("                <a class=\"1\" href=\"schedule\">Schedule's student</a>\n");
      out.write("                <a class=\"1\" href=\"mark\">mark</a>\n");
      out.write("                <a class=\"1\" href=\"list/individual\">Individual</a>\n");
      out.write("            </div>      \n");
      out.write("            <div class=\"out\">\n");
      out.write("                <div style=\"display:flex;justify-content: space-between;width:100%;\">\n");
      out.write("                    <h3>");
      //  fmt:formatDate
      org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
      _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatDate_0.setParent(null);
      _jspx_th_fmt_formatDate_0.setValue( new Date() );
      _jspx_th_fmt_formatDate_0.setPattern("EEEE dd/MM/yyyy");
      int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
      if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
        return;
      }
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      out.write("</h3>\n");
      out.write("                    <div style=\"width:240px;height:30px;display:flex;\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"outin\">\n");
      out.write("                    <div class=\"frame\">\n");
      out.write("                        <img src=\"image/profile.jfif\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"in4\">\n");
      out.write("                        <div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"display:flex;\">\n");
      out.write("                            present<input type=\"radio\" name=\"slot\" value=\"1\"/>\n");
      out.write("                            present<input type=\"radio\" name=\"slot\" value=\"1\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("            </div>  \n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("            var pup =document.getElementsByClassName(\"pupup\");\n");
      out.write("            if(pup!==null){\n");
      out.write("               var time = setTimeout(function (){\n");
      out.write("                   pup[0].style.display=\"none\";\n");
      out.write("               },2500);\n");
      out.write("           }\n");
      out.write("            let u = 0;\n");
      out.write("            document.getElementById(\"set\").onclick = function () {\n");
      out.write("                if (u === 1) {\n");
      out.write("                    document.getElementsByName(\"set\")[0].style.display = \"block\";\n");
      out.write("                    u = 0;\n");
      out.write("                } else {\n");
      out.write("                    document.getElementsByName(\"set\")[0].style.display = \"none\";\n");
      out.write("                    u = 1;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            document.getElementsByName(\"logout\")[0].onclick = function () {\n");
      out.write("                var input1 = document.createElement(\"input\");\n");
      out.write("                input1.type = \"text\";\n");
      out.write("                input1.value = \"logout\";\n");
      out.write("                input1.name = \"out\";\n");
      out.write("                input1.style.visibility = 'hidden';\n");
      out.write("                document.getElementsByName(\"logout\")[0].appendChild(input1);\n");
      out.write("                document.getElementsByName(\"form-l\")[0].submit();\n");
      out.write("            };\n");
      out.write("            var form = document.getElementsByClassName(\"d-st\");\n");
      out.write("            for (var i = 0; i < form.length; i++) {\n");
      out.write("                form[i].onclick = function (e) {\n");
      out.write("                    var n = confirm(\"are you sure want to delete this student?\");\n");
      out.write("                    if (n === false) {\n");
      out.write("                        e.preventDefault();\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("            }\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${delete!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${delete}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>  \n");
        out.write("                             ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>  \n");
        out.write("                             ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${add!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${add}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>  \n");
        out.write("                             ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${update!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${update}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>  \n");
        out.write("                             ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${er!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<p style=\"font-style;bold;text-align:center;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${er}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${op!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<p style=\"font-style;bold;text-align:center;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${op}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }
}
