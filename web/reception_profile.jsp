<%-- 
    Document   : home
    Created on : Jan 1, 2020, 11:08:44 PM
    Author     : Nishantha
--%>
<%@page import="java.lang.String"%>
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
        <link rel="stylesheet" type="text/css" href="css/reception_profile.css">
        <script src="js/jquery.min.js"></script>       
        <title>available rooms</title>
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
           <li><a class="active" href="reception_profile.jsp"><i class="fa fa-hotel ficon"></i>Room Status</a></li>
            <li><a href="reception_payments.jsp"><i class="fas fa-money-check-alt ficon"></i>View Payments</a></li>
            <li><a href="Change_reception_password.jsp"><i class="fa fa-wrench ficon"></i>Change Password</a></li>
           <li><a href="logout.jsp"><i class="fas fa-sign-out-alt ficon"></i>Logout</a></li>
        </ul>
      </div>

         <div class="col-md-9 col-sm-12 right bothpadding">
            <div class="container">
                <div class="col-12 col-md-12 col-lg-12 text-center"> <h1 class="page-header">AVAILABLE  <small class="small-header">ROOMS</small></h1></div>  
                   <p>Welcome, <%=session.getAttribute("first_name")%></p>
                    <div class="row">
                        <div class="col-12 text-center">
                            <div class="container" style="background-color: white;">           
                                </br>       
                                    <div style=" border: 1px solid #428BCA;">
                                        <h4 class="text-white roomhead">Room Details</h4>
                                            <div>
                                                <table class="table table-responsive-sm table-hover">
                                                 <thead class="thead-light">
                                                    <tr>
                                                      <th>Room Id</th>
                                                      <th>Room Type</th>
                                                      <th>Bedding</th>
                                                  </tr>
                                                 </thead>
                                                    <%


                                                 try{
                                                 Statement stmt = new DB.DbConnection().getConnection().createStatement();  
                                                 String sql ="select * from room ";
                                                 ResultSet  resultSet = stmt.executeQuery(sql);
                                                 while(resultSet.next()){

                                                 %>

                                                      <tr>
                                                        <td><%out.println(resultSet.getString("room_id"));%></td>
                                                        <td><%out.println(resultSet.getString("room_type"));%></td>
                                                        <td><%out.println(resultSet.getString("bedding_type"));%></td>
                                                      </tr>

                                                 <%

                                                 }
                                                
                                                 } catch (Exception e) {
                                                 e.printStackTrace();
                                                 }
                                                 %>

                                                </table>
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
    </div>   
 </section>
<script src="js/bootstrap.min.js"></script>
 </body>
</html>
