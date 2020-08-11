package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class userReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "sunrise";
String userid = "root";
String pword = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet rs = null;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reg_style.css\">\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <title>registration</title>\n");
      out.write("    </head>\n");
      out.write(" <body>\n");
      out.write("     <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("       <a class=\"navbar-brand\" href=\"#\"><h2 class=\"font-weight-bold\" id=\"sun\">SUN <span id=\"rise\">RISE</sapan> <span id=\"hotel\">HOTEL</sapan></h2></a>\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link \" href=\"index.jsp\">Login</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"userReg.jsp\">Registration</a>\n");
      out.write("               </li>\n");
      out.write("            </ul>\n");
      out.write("    </nav>\n");
      out.write(" <div>\n");
      out.write("   </br>\n");
      out.write("    </br>\n");
      out.write("     <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3 \"></div>\n");
      out.write("            <div class=\"col-sm-6   transbox\">\n");
      out.write("                </br>\n");
      out.write("                    <h3 class=\"font-weight-bold text-center\" style=\"color:white;\">Registration Form</h3>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            </br>\n");
      out.write("                                <form>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"firstname\" class=\"text-white\">First Name:</label>\n");
      out.write("                                                <input type=\"firstname\" class=\"form-control\" id=\"firstname\" placeholder=\"Enter First Name\" name=\"firstname\">\n");
      out.write("                                            </div>\n");
      out.write("                                       </div>\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"laststname\" class=\"text-white\">Last Name:</label>\n");
      out.write("                                                <input type=\"lastname\" class=\"form-control\" id=\"lastname\" placeholder=\"Enter Last Name\" name=\"lastname\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"email\" class=\"text-white\">Registration Number:</label>\n");
      out.write("                                                    <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter Registration Number\" name=\"regno\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                           <div class=\"col-sm-6\">\n");
      out.write("                                              <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"gender\" class=\"text-white\">Gender:</label>\n");
      out.write("                                                        <div class=\"row\">\n");
      out.write("                                                           <div class=\"col-sm-4 text-white\"><input type=\"radio\" name=\"gender\" value=\"male\" checked> Male</div>\n");
      out.write("                                                           <div class=\"col-sm-4 text-white\"><input type=\"radio\" name=\"gender\" value=\"female\"> Female</div>\n");
      out.write("                                                           <div class=\"col-sm-4 text-white\"><input type=\"radio\" name=\"gender\" value=\"other\"> Other</div>\n");
      out.write("                                                        </div>\n");
      out.write("                                              </div>\n");
      out.write("                                           </div>\n");
      out.write("                                   </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"address\" class=\"text-white\">Address:</label>\n");
      out.write("                                                    <input type=\"address\" class=\"form-control\" id=\"address\" placeholder=\"Enter Address\" name=\"address\">\n");
      out.write("                                                </div>\n");
      out.write("                                           </div>\n");
      out.write("                                           <div class=\"col-sm-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"phone\" class=\"text-white\">Phone Number:</label>\n");
      out.write("                                                        <input type=\"phone\" class=\"form-control\" id=\"phone\" placeholder=\"Enter Phone Number\" name=\"phone\">\n");
      out.write("                                                    </div>\n");
      out.write("                                           </div>\n");
      out.write("                                    </div>\n");
      out.write("                                     <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"email\" class=\"text-white\">Email:</label>\n");
      out.write("                                                    <input type=\"email\" class=\"form-control\" id=\"address\" placeholder=\"Enter Email\" name=\"email\">\n");
      out.write("                                                </div>\n");
      out.write("                                           </div>\n");
      out.write("                                           <div class=\"col-sm-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"job\" class=\"text-white\">Job Type:</label>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"job\" placeholder=\"Enter Job Type\" name=\"job\">\n");
      out.write("                                                    </div>\n");
      out.write("                                           </div>\n");
      out.write("                                    </div> \n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"username\" class=\"text-white\">Username:</label>\n");
      out.write("                                                        <input type=\"username\" class=\"form-control\" id=\"username\" placeholder=\"Enter Username\" name=\"username\">\n");
      out.write("                                                    </div>\n");
      out.write("                                               </div>\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"password\" class=\"text-white\">Password:</label>\n");
      out.write("                                                        <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Enter Password\" name=\"password\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </br>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-5 \"></div>\n");
      out.write("                                            <div class=\"col-sm-2 \"><button type=\"submit\" class=\"btn btn-primary\">Submit</button></div>>\n");
      out.write("                                            <div class=\"col-sm-5 \"></div>\n");
      out.write("                                   </div>                                              \n");
      out.write("                                </form>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("        <div class=\"col-sm-3 \"></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("       ");
 
     String fname=request.getParameter ("firstname"); 
     String lname=request.getParameter ("lastname"); 
     String reg=request.getParameter ("regno");
      String gen=request.getParameter ("gender"); 
     String adds=request.getParameter ("address"); 
     String ph=request.getParameter ("phone");
      String eml=request.getParameter ("email"); 
     String jtype=request.getParameter ("job"); 
     String user=request.getParameter ("username"); 
     String pswrd=request.getParameter ("password");
  
     try{
connection = DriverManager.getConnection(connectionUrl+database, userid, pword);
statement=connection.createStatement();
String sql ="INSERT INTO user VALUES('"+fname+"','"+lname+"','"+gen+"'','"+adds+"'','"+ph+"'','"+eml+"'','"+jtype+"','"+user+"','"+pswrd+"')";
statement.executeUpdate(sql);


connection.close();
} catch (Exception e) {
e.printStackTrace();
}


      out.write("\n");
      out.write("     \n");
      out.write("     \n");
      out.write(" <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write(" </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
