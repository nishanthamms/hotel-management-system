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
         <link rel="stylesheet" type="text/css" href="../admin/css/add_employee_style.css">
         <script src="../admin/js/jquery.min.js"></script>
        
        <title>add payment</title>
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
             <div  id="demo" class="collapse">
                 <ul style="padding-left: 30px;">
                    <li><a   href="rooms.jsp"><i class="fas fa-info-circle ficon"></i>Room Status</a></li>
                    <li><a   href="addroom.jsp"><i class="fas fa-plus-circle ficon"></i>Add Room</a></li>
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
             <div  id="pay" class="collapse  show">
                 <ul style="padding-left: 30px;">
                    <li><a   href="payments.jsp"><i class="fas fa-info-circle ficon"></i>Payment Details</a></li>
                    <li><a  class="active" href="addpayment.jsp"><i class="fas fa-plus-circle ficon"></i>Add  Payment</a></li>
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
              <div class="col-12 col-md-12 col-lg-12 text-center"> <h1 class="page-header">ADD  <small class="small-header">PAYMENT</small></h1></div>    
                  <div class="row">
                     <div class="col-12 text-center">
                         <div class="container" style="background-color: white;">   
                           </br>        
                              <div style=" border: 1px solid #428BCA;">
                                <h4 class="text-white roomhead">Add Payment</h4>
                                   </br>
               
                                    <form action="addpayment.jsp" method="GET">
                    
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="emid">Enter the Id:</label>
                                             <input type="text" class="form-control"  name="empid">
                                        </div>
                          
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="ename">Enter the Name:</label>
                                             <input type="text" class="form-control"  name="name">
                                        </div>
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="jtype">Enter the Job Type:</label>
                                            <input type="text" class="form-control"  name="jobtype">
                                        </div> 
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="basicsal">Enter the Basic Salary:</label>
                                            <input type="text" class="form-control"  name="basic" >
                                        </div>
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="oth">Enter the OT Hours:</label>
                                            <input type="text" class="form-control"  name="ot" >
                                        </div>
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="hrate">Enter the Hourly Rate:</label>
                                            <input type="text" class="form-control"  name="hr" >
                                        </div>  
                     
                                        </br>
                                        <div class="row">
                                         <div class="col-sm-4 "></div>
                                         <div class="col-sm-4 "><button type="submit" class="btn btn-primary">Add New</button></div>
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
     String empId=request.getParameter ("empid"); 
     String empName=request.getParameter ("name"); 
     String job=request.getParameter ("jobtype");
     String strbasicSal =request.getParameter ("basic");
     String strOt = request.getParameter ("ot");
     String strHr = request.getParameter ("hr");
  
     try{
         double basic = Double.valueOf(strbasicSal);
         int ot = Integer.valueOf(strOt);
         double hr = Double.valueOf(strHr);
         double otpay = (ot * hr);
         double total = basic + otpay;
         
        Statement stmt = new DB.DbConnection().getConnection().createStatement();  
        String sql ="INSERT INTO payment  (userid,name,job_type,basic_salary,ot_hours,hourly_rate,ot_payment,total_salary) VALUES('"+empId+"','"+empName+"', '"+job+"', "+basic+", "+ot+", "+hr+", "+otpay+", "+total+" )";
        stmt.executeUpdate(sql);
    } catch (Exception e) {
    e.printStackTrace();
    }

%>
     
      <script src="../admin/js/bootstrap.min.js"></script>
</body>
</html>
