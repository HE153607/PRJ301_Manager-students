<%-- 
    Document   : information
    Created on : Jan 8, 2022, 9:12:33 PM
    Author     : hoanganhPC
--%>
<%@page import="Model.Teacher"%>
<%@page import="Model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page  errorPage="error.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Individual</title>
    </head>
    <body>
         
        <form action="./" method="post" name="form-l">
            <% 
                
                if(request.getAttribute("info")==null)
                response.sendRedirect("list/individual");
                Teacher b=(Teacher)request.getAttribute("info");
            %>
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
                .in{
                     margin-top: 269px;
                    background-color: #cccccc;
                    width: 99vw;
                }
                .hleft{
                    float: left;
                    height: 483px;
                    width: 40%;
                }
                .hleft img{
                    width: 100%;
                    height: 100%;
                }
                .hright{
                    float: right;
                    width: 57%;
                    height: 483px;
                    background-color: #cccccc;
                    padding-left: 3%;
                }
                .frame{
                    width: 20%;
                    height: 185px;
                }
                .frame img{
                    border-radius: 7px;
                    width: 100%;
                    height: 165px;
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
            </style>
            <header>
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIOA8gn2Q36sSKPCW7yf_pz712jwbIHvJUEQ&usqp=CAU"/>
                <div style="display:flex;width: 400px;height: 100%;padding-right: 60px;">
                    <img src="/home/image/<%if (b.getImg() == null || b.getImg().trim().equals("")) {%><%="profile.jfif"%><%} else {%><%=b.getImg()%><% }%>">
                    <div>
                        <p>Campus:<%=b.getCampus()%></p>
                        <p>Email:<%=b.getEmail()%></p>
                        <img id="set" style="cursor: pointer;width:30px;height:30px;" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcTRtwtu2UDtXRt6H87BmJeHqJvj4U09V2ZQ&usqp=CAU"/>
                    </div>
                </div>
                        <ul name="set" class="set" style="margin: 0;padding: 0;width:120px;height:40px;border: 1px solid black;">
                            <li name="logout">log out</li>  
                            <li><a style="text-decoration: none;color: black;" href="/manager/change">change password</a></li>  
                        </ul>
            </header>
                        <% if(request.getAttribute("ercode")!=null){%>
                        <div class="pupup" style="width: 200px;height: 100px;background-color: #ccffcc;position: absolute;z-index: 1;
                             top: -260px;right:670px;text-align: center;">
                             <c:if test="${ercode!=null}">
                                <p>${ercode}</p>  
                             </c:if>
                        </div>   
                       <% }%> 
            <div class="head">
                <h1>Manager Student</h1>
                <a class="1" href="/home/list">List Of Students</a>
                <a class="1" href="/home/schedule">Attendance</a>
                <a class="1" href="individual">Individual</a>
            </div>     
                        
                <div class="in">
                    <div class="hleft">
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDmdcW4LanNtXrBBcfaz8_lJTU_sD_cITM6g&usqp=CAU"/>
                    </div>
                    <div class="hright">
                        <div style="display: flex;margin-bottom: 0;">
                            <h2 style="margin-bottom: 10px;">Your Name:<%=b.getName()%></h2>   
                        </div>
                        <h2 style="margin-top: 0;">ID:<%=session.getAttribute("id")%></h2>
                        code join:<Strong> <%=b.getCode()%></Strong>
                        <div style="background-color: cadetblue;border-radius: 3px;padding: 5px 2px;width:120px;height:20px;cursor:pointer;" class="join">change Code Join </div>
                    </div>
                </div>
            </form>
            <script> 
                var pup =document.getElementsByClassName("pupup");
            if(pup!==null){
               var time = setTimeout(function (){
                   pup[0].style.display="none";
               },2500);
           }
                let u=0;
                document.getElementById("set").onclick = function (){
                    if(u===1){
                 document.getElementsByName("set")[0].style.display="block";u=0;}
             else {document.getElementsByName("set")[0].style.display="none";u=1;}
                };
                document.getElementsByName("logout")[0].onclick = function (){
                    var input1= document.createElement("input");
                       input1.type="text";
                       input1.value="logout";
                       input1.name="out";
                       input1.style.visibility='hidden';
                       document.getElementsByName("logout")[0].appendChild(input1);
                       document.getElementsByName("form-l")[0].action="individual";
                  document.getElementsByName("form-l")[0].submit();  
                };
                document.getElementsByClassName("join")[0].onclick = function () {
                    var n = prompt("Enter your new code:");
                    if (n !== null && n.trim()!== "") {
                       var input= document.createElement("input");
                       input.type="text";
                       input.value=n;
                       input.name="join";
                       input.style.visibility='hidden';
                       document.getElementsByClassName("join")[0].appendChild(input);
                       document.getElementsByName("form-l")[0].action="individual";
                        document.getElementsByName("form-l")[0].submit();
                    }
                };
                
            </script>
    </body>
</html>
