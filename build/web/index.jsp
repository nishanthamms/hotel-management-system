<%-- 
    Document   : index
    Created on : Jan 5, 2020, 9:03:43 AM
    Author     : Nishantha
<%@page import="org.apache.jasper.runtime.JspRuntimeLibrary.include(Serv
--%>


<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%
String userdbName;
String userdbPsw;
String dbUsertype;
String userFName;
String dbUserid;


PreparedStatement ps = null;
ResultSet rs = null;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/index_style.css">
        <script src="js/jquery.min.js"></script>
        <title>Home</title>
    </head>
 <body>
   <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
       <a class="navbar-brand" href="#"><h2 class="font-weight-bold" id="sun">SUN <span id="rise">RISE</sapan> <span id="hotel">HOTEL</sapan></h2></a>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="userReg.jsp">Registration</a>
                </li>
            </ul>
   </nav>
   <div>
   </br>
   </br>
       <div class="row">
           <div class=" col-lg-2"></div>
                <div class="col-sm-12 col-md-12 col-lg-4 transbox ">
                 </br>
                    </br>
                        </br>
                            <h2 class="text-white text-center"> WELCOME</h2>
                            <h2 class="font-weight-bold text-center" id="sun">SUN <span id="rise">RISE</sapan> <span id="hotel">HOTEL</sapan></h2>
                            <h2 class="text-white text-center"> MANAGEMENT SYSTEM</h2>
                </div>
                <div class="col-sm-12 col-md-12 col-lg-4 transbox">
                    </br>
                        <h3 class="font-weight-bold text-center" style="color:white;">Sign In</h3>
                            <div class="container">
                                 </br>
                                    <form action="index.jsp" method="POST">
                                        <div class="form-group">
                                            <!--label for="username">Username:</label-->
                                           <input type="text" class="form-control" id="unme"  placeholder="Enter username" name="username">
                                       </div>
                                        </br>
                                        <div class="form-group">
                                         <!--label for="pwd">Password:</label-->
                                          <input type="password" class="form-control" id="ps" placeholder="Enter password" name="pswd">
                                        </div>
                                        </br>
                                        <div class="row">
                                            <div class="col-sm-4 "></div>
                                            <div class="col-sm-4 "><button type="submit" class="btn btn-primary" onClick="empty()">SIGN IN</button></div>
                                            <div class="col-sm-4 "></div>
                                       </div>
                                        </br>
                                        <div class="row">
                                            <p class="text-center text-white">Don't have a Account ? <a class="text-white" href="userReg.jsp">Sign Up</a> </p>
                                        </div>
                                    </form>
                            </div>
                </div>
                <div class=" col-lg-2"></div>
        </div>
    </div> 
     
  

  
   
<%

String sql = "select * from user where username=? and password=? ";
String name = request.getParameter("username");
String password = request.getParameter("pswd");


try{
        ps = new DB.DbConnection().getConnection().prepareStatement(sql);    
        ps.setString(1, name);
        ps.setString(2, password);

        rs = ps.executeQuery();
       //int n = rs.getRow();
                if(rs.next()){ 

                userdbName = rs.getString("username");
                String userdbEmail = rs.getString("email");
                userFName = rs.getString("first_name");
                userdbPsw = rs.getString("password");
                dbUsertype = rs.getString("job_type");
                dbUserid = rs.getString("userid");
                if(name.equals(userdbName) && password.equals(userdbPsw)) {

                    
                    if(dbUsertype.toLowerCase().equals("reception")){
                       // session.setAttribute("username",userdbName);
                        session.setAttribute("email",userdbEmail);
                        session.setAttribute("first_name",userFName);
                        session.setAttribute("userid", dbUserid); 
                        response.sendRedirect("reception_profile.jsp");
                    
                    }else{
                        session.setAttribute("email",userdbEmail);
                       // session.setAttribute("username",userdbName);
                        session.setAttribute("first_name",userFName);
                        session.setAttribute("userid", dbUserid); 
                        response.sendRedirect("user_profile.jsp");
                    }

                } 
        }else{
            
               rs.close();
               ps.close(); 
                
              }
                

      }catch(SQLException sqe){

        out.println(sqe);

        } 
       
%>
         

<script>
    function empty() {
      
    var x;
    var y;
    x = document.getElementById("unme").value;
    y = document.getElementById("ps").value;
    if (x == "" || y=="") {
        alert("Username or Password Incorrect");
        return false;
    }
}
</script>

     
     
     
 <script src="js/bootstrap.min.js"></script>
 </body>
</html>
