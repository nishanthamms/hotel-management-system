<%-- 
    Document   : login
    Created on : Dec 28, 2019, 11:17:55 PM
    Author     : Nishantha
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="css/bootstrap.min.css">
         <link rel="stylesheet" type="text/css" href="css/reg_style.css">
        <script src="js/jquery.min.js"></script>
        <title>registration</title>
    </head>
 <body>
     <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
       <a class="navbar-brand" href="#"><h2 class="font-weight-bold" id="sun">SUN <span id="rise">RISE</sapan> <span id="hotel">HOTEL</sapan></h2></a>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link " href="index.jsp">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="userReg.jsp">Registration</a>
               </li>
            </ul>
    </nav>
 <div>
   </br>
    </br>
     <div class="row">
        <div class="col-sm-3 "></div>
            <div class="col-md-6 col-sm-12  transbox">
                </br>
                    <h3 class="font-weight-bold text-center" style="color:white;">Registration Form</h3>
                        <div class="container">
                            </br>
                            <form action="userReg.jsp" method="POST">
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="fnme" class="text-white">First Name:</label>
                                                <input type="text" class="form-control"  placeholder="Enter First Name" name="firstname">
                                            </div>
                                       </div>
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="lnme" class="text-white">Last Name:</label>
                                                <input type="text" class="form-control"  placeholder="Enter Last Name" name="lastname">
                                            </div>
                                        </div>
                                   </div>
                                   <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="regsistration" class="text-white">Registration Number:</label>
                                                    <input type="text" class="form-control"  placeholder="Enter Registration Number" name="regno">
                                                </div>
                                            </div>
                                           <div class="col-sm-6">
                                              <div class="form-group">
                                                    <label for="gder" class="text-white">Gender:</label>
                                                        <div class="row">
                                                           <div class="col-sm-4 text-white"><input type="radio" name="gender" value="male" checked> Male</div>
                                                           <div class="col-sm-4 text-white"><input type="radio" name="gender" value="female"> Female</div>
                                                           <div class="col-sm-4 text-white"><input type="radio" name="gender" value="other"> Other</div>
                                                        </div>
                                              </div>
                                           </div>
                                   </div>
                                    <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="adrs" class="text-white">Address:</label>
                                                    <input type="text" class="form-control" id="address" placeholder="Enter Address" name="address">
                                                </div>
                                           </div>
                                           <div class="col-sm-6">
                                                    <div class="form-group">
                                                        <label for="phne" class="text-white">Phone Number:</label>
                                                        <input type="text" class="form-control"  placeholder="Enter Phone Number" name="phone">
                                                    </div>
                                           </div>
                                    </div>
                                     <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="eml" class="text-white">Email:</label>
                                                    <input type="email" class="form-control" id="address" placeholder="Enter Email" name="email">
                                                </div>
                                           </div>
                                           <div class="col-sm-6">
                                                    <div class="form-group">
                                                        <label for="jobtp" class="text-white">Job Type:</label>
                                                        <input type="text" class="form-control" id="job" placeholder="Enter Job Type" name="job">
                                                    </div>
                                           </div>
                                    </div> 
                                    <div class="row">
                                                <div class="col-sm-6">
                                                    <div class="form-group">
                                                        <label for="usame" class="text-white">Username:</label>
                                                        <input type="text" class="form-control" id="username" placeholder="Enter Username" name="username">
                                                    </div>
                                               </div>
                                                <div class="col-sm-6">
                                                    <div class="form-group">
                                                        <label for="pasrd" class="text-white">Password:</label>
                                                        <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password">
                                                    </div>
                                                </div>
                                    </div>
                                    </br>
                                    <div class="row">
                                            <div class="col-sm-5 "></div>
                                            <div class="col-sm-2 "><button type="submit" class="btn btn-primary">Submit</button></div>>
                                            <div class="col-sm-5 "></div>
                                   </div>                                              
                                </form>
                        </div>
                </div>
        <div class="col-sm-3 "></div>
    </div>
</div>
       <% 
     String fname=request.getParameter ("firstname"); 
     String lname=request.getParameter ("lastname"); 
     String reg=request.getParameter ("regno");
     String gen=request.getParameter ("gender"); 
     //String id = request.getParameter("userid");
     String adds=request.getParameter ("address"); 
     String ph=request.getParameter ("phone");
     String eml=request.getParameter ("email"); 
     String jtype=request.getParameter ("job"); 
     String user=request.getParameter ("username"); 
     String pswrd=request.getParameter ("password");
  
     try{
    Statement stmt = new DB.DbConnection().getConnection().createStatement();
     if(!reg.equals(null) || !fname.equals(null) || !lname.equals(null) ||!gen.equals(null) ||!adds.equals(null) ||!ph.equals(null) ||!eml.equals(null) ||!jtype.equals(null) ||!user.equals(null) ||!pswrd.equals(null)){
    String sql ="INSERT INTO user VALUES('"+reg+"','"+fname+"', '"+lname+"', '"+gen+"', '"+adds+"','"+eml+"', '"+ph+"',  '"+jtype+"', '"+user+"', '"+pswrd+"')";
    stmt.executeUpdate(sql);
    response.sendRedirect("index.jsp");
      }
    } catch (Exception e) {
    e.printStackTrace();
    }

%>
     
     
 <script src="js/bootstrap.min.js"></script>
 </body>
</html>
