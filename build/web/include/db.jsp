<%-- 
    Document   : db
    Created on : Jan 24, 2020, 6:32:24 PM
    Author     : Nishantha
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%




String driverName = "com.mysql.jdbc.Driver";

String url = "jdbc:mysql://localhost:3306/sunrise";

String user = "root";

String dbpsw = "";










 class DbConnection {
     private static final String DBURL = "jdbc:mysql://localhost:3306/sunrise";
     private static final String DBUSER = "root";
     private static final String DBPASS =""; 
    
    public Connection dbconnection() throws ClassNotFoundException, SQLException{
     Class.forName("com.mysql.cj.jdbc.Driver"); 
     Connection con=(Connection) DriverManager.getConnection(DBURL,DBUSER,DBPASS); 
     return con;
    }
    
}













%>
