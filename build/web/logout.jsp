<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Logout</title>

</head>

<body>

<% session.invalidate(); %>

<%
try{
response.sendRedirect("index.jsp");
}catch(Exception ex){
    out.println(ex);  
}


%>

   
</body>

</html>