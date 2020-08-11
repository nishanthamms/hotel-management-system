<%-- 
    Document   : home
    Created on : Jan 1, 2020, 11:08:44 PM
    Author     : Nishantha
--%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
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
        <title>update Payment</title>
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
             <div  id="demo" class="collapse  ">
                 <ul style="padding-left: 30px;">
                    <li><a   href="rooms.jsp"><i class="fas fa-info-circle ficon"></i>Room Status</a></li>
                    <li><a    href="addroom.jsp"><i class="fas fa-plus-circle ficon"></i>Add Room</a></li>
                     <li><a  href="updateroom.jsp"><i class="fa fa-edit ficon"></i>Update Room</a></li>
                    <li><a  href="deleteroom.jsp"><i class="fas fa-trash-alt ficon"></i>Delete Room</a></li>
                 </ul>
             </div>
           <li><a class="d-flex " data-toggle="collapse" href="#" data-target="#emp"><i class="fa fa-users ficon"></i>Employees<i class="fa fa-angle-down" style="padding-left: 110px"></i></a></li>
             <div  id="emp" class="collapse " >
                 <ul style="padding-left: 30px;">
                    <li><a    href="employee.jsp"><i class="fas fa-info-circle ficon"></i>Employee Details</a></li>
                    <li><a   href="addemployee.jsp"><i class="fas fa-plus-circle ficon"></i>Add Employee</a></li>
                     <li><a  href="updatemp.jsp"><i class="fa fa-edit ficon"></i>Update Employee</a></li>
                    <li><a  href="delete_employee.jsp"><i class="fas fa-trash-alt ficon"></i>Delete Employee</a></li>
                   </ul>
             </div>
           <li><a class="d-flex " data-toggle="collapse" href="#" data-target="#pay"><i class="fas fa-money-check-alt ficon"></i>Payments<i class="fa fa-angle-down" style="padding-left: 118px"></i></a></li>
             <div  id="pay" class="collapse show ">
                 <ul style="padding-left: 30px;">
                    <li><a    href="payments.jsp"><i class="fas fa-info-circle ficon"></i>Payment Details</a></li>
                    <li><a  href="addpayment.jsp"><i class="fas fa-plus-circle ficon"></i>Add  Payment</a></li>
                    <li><a  class="active" href="updatepayment.jsp"><i class="fa fa-edit ficon"></i>Update Payment</a></li>
                    <li><a  href="delete_payment.jsp"><i class="fas fa-trash-alt ficon"></i>Delete  Payment</a></li>
                 </ul>
             </div>
            <li><a href="Change_password.jsp"><i class="fa fa-wrench ficon"></i>Change Password</a></li>
          <li><a href="logout.jsp"><i class="fas fa-sign-out-alt ficon"></i>Logout</a></li>       
        </ul>
      </div>

        <div class="col-md-9 col-sm-12 right bothpadding">
            <div class="container">
                <div class="col-12 col-md-12 col-lg-12 text-center"> <h1 class="page-header">UPDATE  <small class="small-header">PAYMENT</small></h1></div>   
                    <div class="row">
                        <div class="col-12 text-center">
                            <div class="container" style="background-color: white;">         
                              </br>   
                                   <div style=" border: 1px solid #428BCA;">
                                    <h4 class="text-white roomhead">Update Payment</h4>
                                     </br>
                                                                         
       <%
                   String sql = "select userid from payment";
                try {
                Statement stmt = new DB.DbConnection().getConnection().createStatement(); 
                ResultSet rs = stmt.executeQuery(sql);
        %>
                                                                            
                                            <form action="updatepayment.jsp" method="POST">
                                                                 
                                                <div class="form-group formtext">
                                                    <label class="font-weight-bold" for="title">Enter Employee Id:</label>
                                                       
                                                    <select class="form-control setlen"  name="eid">
                                                         <option value selected></option>
                                                            <%
                                                            while(rs.next())
                                                            {

                                                            String uid = rs.getString("userid");
                                                            %>
                                                                <option value=<%=uid%>><%=uid%></option>

                                                            <% 

                                                                }
                                                         }
                                                   
                                                            catch(SQLException sqe){
                                                                    out.println(sqe);
                                                            }
                                                  
                                                              %>                                                 
                                                    </select>
                                            
                                               </div>                          
                         
                                                <div class="form-group formtext">
                                                    <label class="font-weight-bold" for="title" >Select a Field:</label>
                                                          <select class="form-control setlen" name="colhead">
                                                              <option value selected ></option>
                                                              <option value="userid">User Id</option>
                                                              <option value="name">Name</option>
                                                              <option value="job_type">Job Type</option>
                                                              
                                                              <option value ="basic_salary" >Basic Salary</option>
                                                              <option value="ot_hours">OT Hours</option>
                                                              <option value="hourly_rate">Hourly Rate</option>
                                                              <option value="ot_payment">OT Payment</option>                                
                                                              <option value ="total_salary" >Total Salary</option>
                                                            
                                                           </select>
                                                 </div>
                                                <div class="form-group formtext">  
                                                    <label class="font-weight-bold" for="value">Enter New Value:</label>
                                                    <input type="text" class="form-control"  name="newvalue">
                                                </div>  
                                                 </br>
                                                <div class="row">
                                                  <div class="col-sm-4 "></div>
                                                  <div class="col-sm-4 "><input type="submit" class="btn btn-primary" value="Update"></div>
                                                  <div class="col-sm-4 "></div>
                                                </div>                                           
                                            </form>
                                
                                   
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
     String userId=request.getParameter ("eid"); 
     String chead=request.getParameter ("colhead"); 
     String newValue  = request.getParameter ("newvalue");
     try{
         
                 Statement stmt = new DB.DbConnection().getConnection().createStatement(); 
                 String query= "UPDATE payment SET " + chead +"= '"+newValue+"' WHERE userid ='"+userId+"' "; 
                 stmt.executeUpdate(query);

        } catch (Exception e) {
             e.printStackTrace();
        }

%>
 
         <script src="../admin/js/bootstrap.min.js"></script>
    </body>
</html>
