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
 if (session == null || session.getAttribute("username") == null) {
        request.getRequestDispatcher("index.jsp").forward(request,
            response);
 }
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="../admin/css/bootstrap.min.css">
           <link  rel="stylesheet" href="../css/all.css"> 
         <link rel="stylesheet" type="text/css" href="../admin/css/addroom_style.css">
         <script src="../admin/js/jquery.min.js"></script>
        <title>add room</title>
    </head>
<body>
  <section class="intro">
     <div class="row about">
        <h1>MAIN MENU</h1>
        <div class="col-md-10 col-sm-12"> </div>         
     </div>    
        <div class="row">  
          <div class="col-md-3 col-sm-12 left bothpadding">     
         <ul class="col-sm-12 ">
           <li><a  class="d-flex "data-toggle="collapse" href="#" data-target="#demo"><i class="fa fa-hotel ficon"></i>Rooms<i class="fa fa-angle-down" style="padding-left: 140px"></i></a></li>
             <div  id="demo" class="collapse show">
                 <ul style="padding-left: 30px;">
                    <li><a   href="rooms.jsp"><i class="fas fa-info-circle ficon"></i>Room Status</a></li>
                    <li><a  class="active"  href="addroom.jsp"><i class="fas fa-plus-circle ficon"></i>Add Room</a></li>
                     <li><a  href="updateroom.jsp"><i class="fa fa-edit ficon"></i>Update Room</a></li>
                    <li><a   href="deleteroom.jsp"><i class="fas fa-trash-alt ficon"></i>Delete Room</a></li>
                 </ul>
             </div>
           <li><a class="d-flex " data-toggle="collapse" href="#" data-target="#emp"><i class="fa fa-users ficon"></i>Employees<i class="fa fa-angle-down" style="padding-left: 110px"></i></a></li>
             <div  id="emp" class="collapse" >
                 <ul style="padding-left: 30px;">
                    <li><a   href="employee.jsp"><i class="fas fa-info-circle ficon"></i>Employee Details</a></li>
                    <li><a   href="addemployee.jsp"><i class="fas fa-plus-circle ficon"></i>Add Employee</a></li>
                     <li><a href="updatemp.jsp"><i class="fa fa-edit ficon"></i>Update Employee</a></li>
                    <li><a  href="delete_employee.jsp"><i class="fas fa-trash-alt ficon"></i>Delete Employee</a></li>
                   </ul>
             </div>
           <li><a class="d-flex " data-toggle="collapse" href="#" data-target="#pay"><i class="fas fa-money-check-alt ficon"></i>Payments<i class="fa fa-angle-down" style="padding-left: 118px"></i></a></li>
             <div  id="pay" class="collapse  ">
                 <ul style="padding-left: 30px;">
                    <li><a   href="payments.jsp"><i class="fas fa-info-circle ficon"></i>Payment Details</a></li>
                    <li><a  href="addpayment.jsp"><i class="fas fa-plus-circle ficon"></i>Add  Payment</a></li>
                    <li><a  href="updatepayment.jsp"><i class="fa fa-edit ficon"></i>Update Payment</a></li>
                    <li><a  href="delete_payment.jsp"><i class="fas fa-trash-alt ficon"></i>Delete  Payment</a></li>
                 </ul>
             </div>
            <li><a href="Change_password.jsp"><i class="fa fa-wrench ficon"></i>Change Password</a></li>
          <li><a href="logout.jsp"><i class="fas fa-sign-out-alt ficon"></i>Logout</a></li>       
        </ul>
      </div>

            
            
        <div class="col-md-9 col-sm-12 right bothpadding">
            <div class="container">
                <div class="col-12 col-md-12 col-lg-12 text-center"> <h1 class="page-header">ADD  <small class="small-header">ROOM</small></h1></div>   
                    <div class="row">
                        <div class="col-12 text-center">
                            <div class="container" style="background-color: white;">         
                              </br>   
                                   <div style=" border: 1px solid #428BCA;">
                                    <h4 class="text-white roomhead">Add Room</h4>
                                     </br>
                                       <div>
                                            <form action="addroom.jsp" method="POST">
                                                <div class="form-group formtext">  
                                                    <label class="font-weight-bold" for="roomid"> Room Id:</label>
                                                    <input type="text" class="form-control"  name="roomid">
                                                </div>                   
                                                <div class="form-group formtext">
                                                    <label class="font-weight-bold" for="title">Type of Room :</label>
                                                       <select class="form-control setlen" name="roomtype">
                                                            <option value selected ></option>
                                                            <option value="SUPERIOR ROOM">SUPERIOR ROOM</option>
                                                            <option value="DELUXE ROOM">DELUXE ROOM</option>
                                                            <option value="GUEST HOUSE">GUEST HOUSE</option>
                                                            <option value="SINGLE ROOM">SINGLE ROOM</option>
                                                       </select>
                                               </div>                          
                         
                                                <div class="form-group formtext">
                                                    <label class="font-weight-bold" for="title" >Bedding Type :</label>
                                                          <select class="form-control setlen" name="beddingtype">
                                                              <option value selected ></option>
                                                              <option value="Single">Single</option>
                                                              <option value="Double">Double</option>
                                                              <option value="Triple">Triple</option>
                                                              <option value="Quad">Quad</option>
                                                              <option value="None">None</option>
                                                           </select>
                                                 </div>       
                                                 </br>
                                                <div class="row">
                                                  <div class="col-sm-4 "></div>
                                                  <div class="col-sm-4 "><input type="submit" class="btn btn-primary" value="Add New"></div>
                                                  <div class="col-sm-4 "></div>
                                                </div>                                           
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
      </div>   
  </section>
    
    
    <% 
     String roomId=request.getParameter ("roomid"); 
     String roomType=request.getParameter ("roomtype"); 
     String beddingType=request.getParameter ("beddingtype");
     
     try{
        Statement stmt = new DB.DbConnection().getConnection().createStatement(); 
        if(!roomId.equals(null) || !roomType.equals(null) || !beddingType.equals(null) ){
            String sql ="INSERT INTO room(room_id,room_type,bedding_type) VALUES('"+roomId+"','"+roomType+"','"+beddingType+"')";
            stmt.executeUpdate(sql);
    }
} catch (Exception e) {
e.printStackTrace();
}

%>
    
    
    
    
    
    
    
    
    
         <script src="../admin/js/bootstrap.min.js"></script>
    </body>
</html>
