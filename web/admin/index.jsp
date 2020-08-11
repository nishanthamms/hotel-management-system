<%-- 
    Document   : index
    Created on : Jan 5, 2020, 9:03:43 AM
    Author     : Nishantha
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String userdbName;
String userdbPsw;

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../admin/css/bootstrap.min.css">
             <link  rel="stylesheet" href="../css/all.css">     
         <link rel="stylesheet" type="text/css" href="../admin/css/index_style.css">
         <script src="../admin/js/jquery.min.js"></script>       
        <title>Admin</title>
    </head>
 <body>
   <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
       <a class="navbar-brand" href="#"><h2 class="font-weight-bold" id="sun">SUN <span id="rise">RISE</sapan> <span id="hotel">HOTEL</sapan></h2></a>
           
   </nav>
   <div>
   </br>
   </br>
       <div class="row">
           <div class=" col-md-3 col-lg-3"></div>
                
                <div class="col-sm-12 col-md-6 col-lg-6 transbox">
                    </br>
                        <h3 class="font-weight-bold text-center text-white">ADMINISTRATOR LOGIN</h3>
                            <div class="container">
                                 </br>
                                    <form action="index.jsp" method="POST">
                                        <div class="form-group">
                                            <!--label for="username">Username:</label-->
                                            <input type="text" class="form-control"  id="unme" placeholder="Enter username" name="username">
                                       </div>
                                        </br>
                                        <div class="form-group">
                                         <!--label for="pwd">Password:</label-->
                                          <input type="password" class="form-control" id="ps" placeholder="Enter password" name="pswd">
                                        </div>
                                        </br>
                                        <div class="row">
                                            <div class="col-sm-4"></div>
                                            <div class="col-sm-4 "><button type="submit" class="btn btn-primary btn-block" onClick="empty()">Login</button></div>
                                            <div class="col-sm-4 "></div>
                                       </div>
                                        </br>
                                       
                                    </form>
                            </div>
                </div>
                <div class="col-md-3 col-lg-3"></div>
        </div>
    </div> 
      
    
<% 
   
    
PreparedStatement ps = null;
ResultSet rs = null;

String sql = "select * from admin where username=? and password=? ";
String name = request.getParameter("username");
String password = request.getParameter("pswd");
try{

        ps = new DB.DbConnection().getConnection().prepareStatement(sql);    
        ps.setString(1, name);
        ps.setString(2, password);

        rs = ps.executeQuery();

                if(rs.next()){ 

                userdbName = rs.getString("username");          
                userdbPsw = rs.getString("password");
             
                if(name.equals(userdbName) && password.equals(userdbPsw)) {       
                        session.setAttribute("username",userdbName);
                        response.sendRedirect("rooms.jsp");                                                    
                }else{
                       
                        rs.close();
                        ps.close(); 

                      }

                
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
    };
}
</script>
     
    
 <script src="../admin/js/bootstrap.min.js"></script>
 </body>
</html>
