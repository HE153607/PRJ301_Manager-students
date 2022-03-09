<%-- 
    Document   : information
    Created on : Jan 8, 2022, 9:12:33 PM
    Author     : hoanganhPC
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.util.TreeMap"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Model.Teacher"%>
<%@page import="Model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>information</title>
    </head>
    <body>
        <form action="list" method="post" name="form-l">
            <style>
                body{
                    position: relative;
                    overflow-x:  hidden;
                }
                header{
                    display: flex;
                    justify-content: space-between;
                    position: fixed;
                    top: 0;
                    width: 99vw;
                    height: 167px;
                    background-color: beige;
                }
                .head{
                    background-color: gainsboro;
                    width: 99vw;position: fixed;
                    top:22.3%;
                    height: 100px;

                    text-align: center;
                }
                .head h1{
                    margin-bottom: 20px;
                }
                .head a{ 
                    margin-left: 20px;
                }
                .out{
                    margin-left: 9vw;
                    width: 80vw;
                    margin-top: 270px;

                }
                .outin{
                    background-color: #f7f7f7;
                    width: 100%;
                    height: 130px;
                    display: flex;
                    justify-content: space-between;
                    border-radius: 7px;
                    margin-bottom: 10px;
                    border: 1px solid black;
                }
                .frame{
                    width: 20%;
                    height: 185px;
                }
                .frame img{
                    border-radius: 7px;
                    width: 90%;
                    height: 130px;
                }
                .in4 a{
                    text-decoration: none;
                    background-color: #bad1fa;
                    border-radius: 4px;
                    padding: 10px 7px;
                    color: black;vertical-align: middle;
                }
                .in4 button{
                    margin-left: 10px;
                    margin-right: 10px;
                    background-color: #bad1fa;
                    border-radius: 4px;
                    padding: 11px 7px;  
                    color: black;
                    border: none;
                    cursor: pointer;
                }
                .in4{
                    align-items: center;
                    width: 70%;
                    display: flex;
                    justify-content: space-between;
                    padding-right: 60px;
                }
                li{
                    border-bottom: 1px solid black;
                    height: 20px;
                    width: 100%;
                    list-style-type: none;
                    background-color: #ffffff;
                    cursor: pointer;
                }ul{
                    position: absolute;
                    top:115px;
                    right: 138px;

                    display: block;
                    background-color: #cccccc;

                }
                li:hover{

                    background-color: #ccffff;
                }
                .set{
                    display: none;
                }
                .cd input{
                    border-radius: 5px;
                    margin-top: 10px;
                    height: 25px;
                }
                .cd input:nth-of-type(2){
                    height: 31px; 
                }
                nav{
                    margin-top: 15px;
                }
                nav a{
                    background-color: #cccccc;
                    padding: 5px 15px 5px 15px;
                    text-decoration: none;
                    font-size: 20px;
                    font-weight: bold;
                    margin-right: 10px;
                }
            </style>
            <%
                if (request.getAttribute("info") == null) {
                    response.sendRedirect("list");
                }
                ArrayList<Student> a = (ArrayList) request.getAttribute("list");
                Teacher b = (Teacher) request.getAttribute("info");
                ArrayList<Integer> in = null;
                if (request.getAttribute("search") != null) {
                    in = (ArrayList) request.getAttribute("search");
                }
            %>
            <header>
               
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIOA8gn2Q36sSKPCW7yf_pz712jwbIHvJUEQ&usqp=CAU"/>
                <div style="display:flex;width: 400px;height: 100%;padding-right: 60px;">
                    <img src="image/<%if (b.getImg() == null || b.getImg().trim().equals("")) {%><%="profile.jfif"%><%} else {%><%=b.getImg()%><% }%>">
                    <div>
                        <p>Campus:<%=b.getCampus()%></p>
                        <p>Email:<%=b.getEmail()%></p>
                        <img id="set" style="cursor: pointer;width:30px;height:30px;" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcTRtwtu2UDtXRt6H87BmJeHqJvj4U09V2ZQ&usqp=CAU"/>
                    </div>
                </div>
                <ul name="set" class="set" style="margin: 0;padding: 0;width:120px;height:40px;border: 1px solid black;">
                    <li name="logout">log out</li>  
                    <li><a style="text-decoration: none;color: black;" href="change">change password</a></li>  
                </ul>
            </header>
     <% if(request.getAttribute("delete")!=null||request.getAttribute("add")!=null||request.getAttribute("update")!=null||request.getAttribute("comment")!=null){%>
                        <div class="pupup" style="width: 200px;height: 100px;background-color: #ccffcc;position: absolute;z-index: 1;
                             top: -260px;right:670px;text-align: center;">
                             <c:if test="${delete!=null}">
                                <p>${delete}</p>  
                             </c:if>
                             <c:if test="${comment!=null}">
                                <p>${comment}</p>  
                             </c:if>
                             <c:if test="${add!=null}">
                                <p>${add}</p>  
                             </c:if>
                             <c:if test="${update!=null}">
                                <p>${update}</p>  
                             </c:if>
                        </div>   
                       <% }%> 
            <div class="head">
                <h1>Manager Student</h1>
                <a class="1" href="list">List Of Students</a>
                <a class="1" href="schedule">Attendance</a>
                <a class="1" href="list/individual">Individual</a>
            </div>      
            <div class="out">
                <div style="display:flex;justify-content: space-between;width:100%;">

                    <c:if test="${list.size()>0}">
                        <div class="cd" style="display:flex;">
                            <p style="margin-right:10px;">total student:${size}</p>
                            <input type="text" name="text" value="<c:if test="${text!=null}">${text}</c:if>" placeholder="search student's name"/>
                            <input type="submit" value="search" name="search" />
                            <c:if test="${search!=null}">
                            <c:choose>
                                <c:when test="${search.size()<=0}"><p style="margin-left:10px;"> not found</p></c:when>
                                <c:otherwise><p style="margin-left:10px;">Found in: 
                                        <% for(int i=0;i<in.size();i++){%>
                                       page <%= in.get(i) %> <%if(i+1<in.size()){ %> 
                                       ,
                                            <% }} %>       
                                    </p></c:otherwise>
                            </c:choose></c:if>
                            </div>
                    </c:if>
                    <div style="width:240px;height:30px;display:flex;">
                        <c:if test="${list.size()>0}">
                            <a style="text-decoration: none;background-color:aquamarine ;border-radius: 3px;display:block;padding-top:5px;
                               text-align:center;width:120px;height:30px;margin-top:7px;margin-right:5px;
                               " target="_blank" href="mail" title="send to all students">Send mail</a>
                        </c:if>
                        <c:if test="${op==null}">
                        <a style="text-decoration: none;background-color:aquamarine ;border-radius: 3px;display:block;padding-top:5px;
                           text-align:center;width:120px;height:30px;margin-top:7px;" target="_blank" href="addinformation.jsp">Add</a></c:if>
                    </div>
                </div>
                <c:if test="${er!=null}"><p style="font-style;bold;text-align:center;">${er}</p></c:if>
                <c:if test="${op!=null}"><p style="font-style;bold;text-align:center;">${op}</p></c:if>
                <%for (int i = 0; i < a.size(); i++) {
                %>
                <div class="outin">
                    <div class="frame">
                        <img src="image/<%if (a.get(i).getImg() == null || a.get(i).getImg().trim().equals("")) {%><%="profile.jfif"%><%} else {%><%=a.get(i).getImg()%><% }%>"/>
                    </div>
                    <div class="in4">
                        <div>
                            <h4><%=a.get(i).getName()%></h4>
                            <h4><%=a.get(i).getEmail()%></h4>
                            <h4><%=a.get(i).getId()%></h4>
                        </div>
                        <div style="display:flex;">
                            <input type="text" name="content" style="border-radius:5px;" placeholder="comment to student parents"/>
                            <button value="<%= a.get(i).getId()%>" name="comment" style="margin-left:0;margin-right:10px;border-radius:5px;border:none;background-color: #bad1fa;">comment</button>
                            <a href="view?stt=<%= a.get(i).getId()%>" target="_blank">Check</a>
                            <button class="d-st" value="<%= a.get(i).getId()%>-${page}" name="name">Delete</button>
                            <a href="update?stt=<%= a.get(i).getId()%>-${page}" >Update</a>
                        </div>
                    </div>
                </div> 
                <%
                    }
                %>
            </div>  
            <c:if test="${list.size()>0}">
                <nav style="text-align:center;">
                    <c:forEach var="count" begin="1" end="${total}">
                        <a href="list?page=${count}" <c:if test="${page==count}">style="background-color:green;"</c:if> >${count}</a>  
                    </c:forEach>
                </nav>
            </c:if>
        </form>
        <script>
            var pup =document.getElementsByClassName("pupup");
            if(pup!==null){
               var time = setTimeout(function (){
                   pup[0].style.display="none";
               },2500);
           }
            let u = 0;
            document.getElementById("set").onclick = function () {
                if (u === 1) {
                    document.getElementsByName("set")[0].style.display = "block";
                    u = 0;
                } else {
                    document.getElementsByName("set")[0].style.display = "none";
                    u = 1;
                }
            };
            document.getElementsByName("logout")[0].onclick = function () {
                var input1 = document.createElement("input");
                input1.type = "text";
                input1.value = "logout";
                input1.name = "out";
                input1.style.visibility = 'hidden';
                document.getElementsByName("logout")[0].appendChild(input1);
                document.getElementsByName("form-l")[0].submit();
            };
            var form = document.getElementsByClassName("d-st");
            for (var i = 0; i < form.length; i++) {
                form[i].onclick = function (e) {
                    var n = confirm("are you sure want to delete this student?");
                    if (n === false) {
                        e.preventDefault();
                    }
                };
            }
        </script>
    </body>
</html>
