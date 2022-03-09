/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hoanganhPC
 */
@WebServlet(name = "ListStudent", urlPatterns = {"/list"})
public class ListStudent extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListStudent</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListStudent at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getSession().getAttribute("id")!=null){
          ControllDao c = new ControllDao();
          request.setAttribute("info", c.TeacherbyId((String) request.getSession().getAttribute("id")));
          request.setAttribute("list", c.GetAllStudents((String)request.getSession().getAttribute("id")));
          request.getRequestDispatcher("list.jsp").forward(request, response);
        }
        else{
            response.sendRedirect("login.jsp");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");
        String campus = request.getParameter("campus");
        ControllDao c = new ControllDao();
        if(request.getParameter("out")!=null){
            if(request.getSession().getAttribute("id")!=null)
                request.getSession().removeAttribute("id");
            response.sendRedirect("login.jsp");
        }
        else{
        if(request.getParameter("name")!=null){
            if(request.getSession().getAttribute("id")!=null){
                try{
                String id=(String)request.getSession().getAttribute("id");
           String student= c.GetAllStudents(id).get(Integer.parseInt(request.getParameter("name"))-1).getId();
            c.delete(student, id);
            response.sendRedirect("list");}
            catch(Exception e){
            response.sendRedirect("list");    
            }}
            else response.sendRedirect("list");
        }
        else{
         if(name!=null&&pass!=null) {
            if (pass.contains("-") ||name.contains("<") ||pass.contains("or") || !c.login(name, pass, campus)) {
                System.out.println(pass);
                request.setAttribute("er", "Thông tin đăng nhập không chính xác");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                HttpSession h = request.getSession();
                String id = c.getId(name);
                h.setAttribute("id", id);
               response.sendRedirect("list");
            }
        }
         else{
             request.setAttribute("er", "Thông tin đăng nhập không chính xác");
          request.getRequestDispatcher("login.jsp").forward(request, response); 
         }  
    }}
        }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
