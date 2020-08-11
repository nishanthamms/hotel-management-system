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
             <div  id="emp" class="collapse show" >
                 <ul style="padding-left: 30px;">
                    <li><a   href="employee.jsp"><i class="fas fa-info-circle ficon"></i>Employee Details</a></li>
                    <li><a class="active"  href="addemployee.jsp"><i class="fas fa-plus-circle ficon"></i>Add Employee</a></li>
                     <li><a href="updatemp.jsp"><i class="fa fa-edit ficon"></i>Update Employee</a></li>
                    <li><a  href="delete_employee.jsp"><i class="fas fa-trash-alt ficon"></i>Delete Employee</a></li>
                   </ul>
             </div>
           <li><a class="d-flex " data-toggle="collapse" href="#" data-target="#pay"><i class="fas fa-money-check-alt ficon"></i>Payments<i class="fa fa-angle-down" style="padding-left: 118px"></i></a></li>
             <div  id="pay" class="collapse ">
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
              <div class="col-12 col-md-12 col-lg-12 text-center"> <h1 class="page-header">ADD   <small class="small-header">EMPLOYEE</small></h1></div>    
                  <div class="row">
                     <div class="col-12 text-center">
                         <div class="container" style="background-color: white;">   
                           </br>        
                              <div style=" border: 1px solid #428BCA;">
                                <h4 class="text-white roomhead">Add Employee</h4>
                                   </br>
               
                                    <form action="addemployee.jsp" method="GET">
                    
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="emid">Enter the Id:</label>
                                             <input type="text" class="form-control"  name="empid">
                                        </div>
                          
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="ename">Enter First Name:</label>
                                             <input type="text" class="form-control"  name="fname">
                                        </div>
                                         <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="ename">Enter Last Name:</label>
                                             <input type="text" class="form-control"  name="lname">
                                        </div>
                                        <div class="form-group formtext">
                                                        <div class="row">
                                                           <div class="col-sm-3 font-weight-bold"><label for="gder">Gender:</label></div>
                                                           <div class="col-sm-3"><input type="radio" name="gender" value="male" checked> Male</div>
                                                           <div class="col-sm-3"><input type="radio" name="gender" value="female"> Female</div>
                                                           <div class="col-sm-3"><input type="radio" name="gender" value="other"> Other</div>
                                                        </div>
                                        </div>
                                         <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="ename">Enter Address:</label>
                                             <input type="text" class="form-control"  name="address">
                                        </div>
                                         <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="ename">Enter Email:</label>
                                             <input type="email" class="form-control"  name="email">
                                        </div>
                                         <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="ename">Enter Phone Number:</label>
                                             <input type="text" class="form-control"  name="ph">
                                        </div>
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="jtype">Enter the Job Type:</label>
                                            <input type="text" class="form-control"  name="jobtype">
                                        </div> 
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="basicsal">Enter Username:</label>
                                            <input type="text" class="form-control"  name="username">
                                        </div>
                                        <div class="form-group formtext">  
                                            <label class="font-weight-bold" for="oth">Enter Password:</label>
                                            <input type="text" class="form-control"  name="pswrd">
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
    <script>
        $(document).ready(function(){
    $("button").click(function(){
     <% 
     String empId=request.getParameter ("empid"); 
     String fName=request.getParameter ("fname");
     String lName=request.getParameter ("lname");
     String gender=request.getParameter ("gender");
     String addres=request.getParameter ("address");
     String email=request.getParameter ("email");
     String phone=request.getParameter ("ph");
     String job=request.getParameter ("jobtype");
     String user =request.getParameter ("username");
     String psword = request.getParameter ("pswrd");
   
        try{
       Statement stmt = new DB.DbConnection().getConnection().createStatement(); 
       if(!empId.equals(null) || !fName.equals(null) || !lName.equals(null) ||!gender.equals(null) ||!addres.equals(null) ||!email.equals(null) ||!phone.equals(null) ||!job.equals(null) ||!user.equals(null) ||!psword.equals(null)){
       String sql ="INSERT INTO user(userid,first_name,last_name,gender,address,email,phone,job_type,username,password)  VALUES('"+empId+"','"+fName+"', '"+lName+"', '"+gender+"', '"+addres+"', '"+email+"','"+phone+"','"+job+"','"+user+"','"+psword+"')";
       stmt.executeUpdate(sql);
    }
} catch (Exception e) {
e.printStackTrace();
}

%>
            });
});
  </script>   
      <script src="../admin/js/bootstrap.min.js"></script>
</body>
</html>
