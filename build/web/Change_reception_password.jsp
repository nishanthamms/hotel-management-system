<%-- 
    Document   : home
    Created on : Jan 1, 2020, 11:08:44 PM
    Author     : Nishantha
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
     <%  
    
 if (session == null || session.getAttribute("email") == null) {
        request.getRequestDispatcher("index.jsp").forward(request,
            response);
 }
    %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="css/bootstrap.min.css">
         <link  rel="stylesheet" href="css/fontawesome.css">
         <link  rel="stylesheet" href="css/all.css"/>
         <link rel="stylesheet" type="text/css" href="css/change_reception_password_style.css">
         <script src="js/jquery.min.js"></script>        
        <title>change password</title>
    </head>
   <body>
<section class="intro">
    <div class="row about">          
          <h1>MAIN MENU</h1>
          <div class="col-md-10 col-sm-12"> </div>         
    </div>      
<div class="row">      
      <div class="col-md-3 col-sm-12 left bothpadding">   
        <ul class="col-sm-12">
             <li><a  href="reception_profile.jsp"><i class="fa fa-hotel ficon"></i>Room Status</a></li>
            <li><a  href="reception_payments.jsp"><i class="fas fa-money-check-alt ficon"></i>View Payments</a></li>
            <li><a class="active" href="Change_reception_password.jsp"><i class="fa fa-wrench ficon"></i>Change Password</a></li>
            <li><a href="logout.jsp"><i class="fas fa-sign-out-alt ficon"></i>Logout</a></li>
       </ul>
      </div>

      <div class="col-md-9 col-sm-12 right bothpadding">
            <div class="container">
                <div class="col-12 col-md-12 col-lg-12 text-center"> <h1 class="page-header">CHANGE  <small class="small-header">PASSWORD</small></h1></div>                     
                    <div class="row">
                        <div class="col-12 text-center">
                            <div class="container" style="background-color: white;">           
                                </br>         
                                    <div style=" border: 1px solid #428BCA;">
                                        <h4 class="text-white roomhead">Change Password</h4>
                                            </br>               
                                                <form action="Change_reception_password.jsp" method="POST">                   
                                                    <div class="form-group formtext">  
                                                        <label class="font-weight-bold" for="roomid">Enter the Username:</label>
                                                        <input type="text" class="form-control"  name="username">
                                                    </div>
                                                    <div class="form-group formtext">
                                                        <label class="font-weight-bold" for="pwd">Enter New Password:</label>
                                                         <input type="password" class="form-control"  name="pswd">
                                                    </div>    
                                                    <div class="form-group formtext">
                                                        <label class="font-weight-bold" for="pwd">Re-Enter New Password:</label>
                                                         <input type="password" class="form-control"  name="repswd">
                                                    </div>                                                 
                                                    </br>
                                                    <div class="row">
                                                        <div class="col-sm-4 "></div>
                                                        <div class="col-sm-4 "><button type="submit" class="btn btn-primary">Change Password</button></div>
                                                        <div class="col-sm-4 "></div>
                                                   </div>
                                                    </br>                        
                                                </form>
                                    </div>
                                    </br>
                            </div>
                            </br>
                            </br>
                        </div>
                    </div>
            </div>         
        </div>
 </div>
</section>
      <% 
      
     String uname=request.getParameter ("username"); 
     String pswrd=request.getParameter ("pswd");
     String newp  = request.getParameter ("repswd");
  
     try{
          Statement stmt = new DB.DbConnection().getConnection().createStatement();                              
          if(newp.equals(pswrd) && uname.equals(session.getAttribute("username"))){
          stmt.execute("UPDATE user SET password ='"+newp+"' WHERE userid ='"+session.getAttribute("userid")+"'"); 
   
         }else{
   %>
              <script class="alert alert-danger">
            alert("Username or Password does not match..!");
                </script>
    <%
          }

} catch (Exception e) {
e.printStackTrace();
}

%> 
       
       
 <script src="js/bootstrap.min.js"></script>
 </body>
</html>
