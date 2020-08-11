package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Change_005fpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("           <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("           <link rel=\"stylesheet\" href=\"../admin/css/bootstrap.min.css\">\n");
      out.write("           <link  rel=\"stylesheet\" href=\"../admin/css/fontawesome.css\">\n");
      out.write("           <link  rel=\"stylesheet\" href=\"../admin/css/all.css\"/>\n");
      out.write("           <link rel=\"stylesheet\" type=\"text/css\" href=\"../admin/css/change_password_style.css\">\n");
      out.write("           <script src=\"../admin/js/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("           <title>Change Password</title>\n");
      out.write("    </head>\n");
      out.write(" <body>\n");
      out.write("<section class=\"intro\">\n");
      out.write("  <div class=\"row about\">\n");
      out.write("          <h1>MAIN MENU</h1>\n");
      out.write("          <div class=\"col-md-10 col-sm-12\"> </div>     \n");
      out.write("  </div>\n");
      out.write("      \n");
      out.write("    <div class=row>\n");
      out.write("        \n");
      out.write("      <div class=\"col-md-3 col-sm-12 left bothpadding\">\n");
      out.write("      \n");
      out.write("      <ul class=\"col-sm-12\">\n");
      out.write("        <li><a href=\"home.jsp\"><i class=\"fa fa-dashboard\"></i>Room Status</a></li>\n");
      out.write("        <li><a  href=\"addroom.jsp\"><i class=\"fa fa-dashboard\"></i>Add Room</a></li>\n");
      out.write("        <li><a  href=\"deleteroom.jsp\"><i class=\"fa fa-dashboard\"></i>Delete Room</a></li>\n");
      out.write("        <li><a   href=\"regemployee.jsp\">Registered Employee Details</a></li>\n");
      out.write("        <li><a href=\"delete_regemployee.jsp\">Delete Registered Employee</a></li>\n");
      out.write("        <li><a  href=\"employee.jsp\">Employee Payment Details</a></li>\n");
      out.write("        <li><a href=\"addemployee.jsp\">Add Employee Payment</a></li>\n");
      out.write("        <li><a href=\"delete_employee.jsp\">Delete Employee Payment</a></li>\n");
      out.write("         <li><a  class=\"active\" href=\"Change_password.jsp\">Change Password</a></li>\n");
      out.write("        <li><a href=\"#contact\">Logout</a></li>\n");
      out.write("        \n");
      out.write("     </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("   <div class=\"col-md-9 col-sm-12 right bothpadding\">\n");
      out.write("       <div class=\"container\">\n");
      out.write("            <div class=\"col-12 col-md-12 col-lg-12 text-center\"> <h1 class=\"page-header\">CHANGE  <small class=\"small-header\">PASSWORD</small></h1></div>      \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 text-center\">\n");
      out.write("                        <div class=\"container\" style=\"background-color: white;\">\n");
      out.write("                          </br>         \n");
      out.write("                           <div style=\" border: 1px solid #428BCA;\">\n");
      out.write("                            <h4 class=\"text-white roomhead\">Change Password</h4>\n");
      out.write("                            </br>\n");
      out.write("                \n");
      out.write("                            <form action=\"Change_password.jsp\" method=\"POST\">\n");
      out.write("                    \n");
      out.write("                              <div class=\"form-group formtext\">  \n");
      out.write("                              <label class=\"font-weight-bold\" for=\"roomid\">Enter the Username:</label>\n");
      out.write("                              <input type=\"text\" class=\"form-control\"  name=\"username\">\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group formtext\">\n");
      out.write("                              <label class=\"font-weight-bold\" for=\"pwd\">Enter New Password:</label>\n");
      out.write("                              <input type=\"password\" class=\"form-control\"  name=\"pswd\">\n");
      out.write("                              </div>    \n");
      out.write("                              <div class=\"form-group formtext\">\n");
      out.write("                              <label class=\"font-weight-bold\" for=\"pwd\">Re-Enter New Password:</label>\n");
      out.write("                              <input type=\"password\" class=\"form-control\"  name=\"repswd\">\n");
      out.write("                              </div>                              \n");
      out.write("                     \n");
      out.write("                              </br>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                  <div class=\"col-sm-4 \"></div>\n");
      out.write("                                  <div class=\"col-sm-4 \"><button type=\"submit\" class=\"btn btn-primary\">Change Password</button></div>\n");
      out.write("                                  <div class=\"col-sm-4 \"></div>\n");
      out.write("                                </div>\n");
      out.write("                              </br>     \n");
      out.write("                    \n");
      out.write("                            </form>\n");
      out.write("                            </div>\n");
      out.write("                             </br>\n");
      out.write("                        </div>\n");
      out.write("                        </br>\n");
      out.write("                        </br>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("             </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("     \n");
      out.write("  </section>\n");
      out.write("  \n");
      out.write("     \n");
      out.write("     \n");
      out.write("\n");
      out.write("          \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("  ");
 
      
     String uname=request.getParameter ("username"); 
     String pswrd=request.getParameter ("pswd");
     String newp  = request.getParameter ("repswd");
  
     try{
            connection = DriverManager.getConnection(connectionUrl+database, userid, pword);
            statement=connection.createStatement();
            rs = connection.createStatement().executeQuery("select password from admin where username='"+uname+"' " );
         // rs.next();
          //String expw = rs.getString("password");
          if(newp.equals(pswrd)){
                 statement.execute("UPDATE admin SET password ='"+newp+"' WHERE userName ='"+uname+"'"); 
   
         }


connection.close();
} catch (Exception e) {
e.printStackTrace();
}


      out.write("\n");
      out.write("     \n");
      out.write("     \n");
      out.write(" <script src=\"../admin/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
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
