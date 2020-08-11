package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "sunrise";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../admin/css/bootstrap.min.css\">\n");
      out.write("        <link  rel=\"stylesheet\" href=\"../admin/css/fontawesome.css\">\n");
      out.write("        <link  rel=\"stylesheet\" href=\"../admin/css/all.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../admin/css/home_style.css\">\n");
      out.write("        <script src=\"../admin/js/jquery.min.js\"></script>       \n");
      out.write("        <title>available rooms</title>\n");
      out.write("  </head>\n");
      out.write("<body>\n");
      out.write("<section class=\"intro\">\n");
      out.write("  <div class=\"row about\">         \n");
      out.write("     <h1>MAIN MENU</h1>\n");
      out.write("        <div class=\"col-md-10 col-sm-12\"> </div>          \n");
      out.write("  </div>      \n");
      out.write("  <div class=\"row\">      \n");
      out.write("      <div class=\"col-md-3 col-sm-12 left bothpadding\">     \n");
      out.write("        <ul class=\"col-sm-12\">\n");
      out.write("           <li><a class=\"active\" href=\"home.jsp\"><i class=\"fa fa-dashboard\"></i>Room Status</a></li>\n");
      out.write("             <ul>\n");
      out.write("                    <li><a  href=\"addroom.jsp\"><i class=\"fa fa-dashboard\"></i>Add Room</a></li>\n");
      out.write("                    <li><a  href=\"deleteroom.jsp\"><i class=\"fa fa-dashboard\"></i>Delete Room</a></li>\n");
      out.write("             </ul>\n");
      out.write("           <li><a   href=\"delete_regemployee.jsp\">Registered Employee Details</a></li>\n");
      out.write("           <li><a  href=\"delete_regemployee.jsp\">Delete Registered Employee</a></li>\n");
      out.write("           <li><a  href=\"employee.jsp\">Employee Payment Details</a></li>\n");
      out.write("           <li><a   href=\"addemployee.jsp\">Add Employee Payment</a></li>\n");
      out.write("           <li><a href=\"delete_employee.jsp\">Delete Employee Payment</a></li>\n");
      out.write("            <li><a href=\"Change_password.jsp\">Change Password</a></li>\n");
      out.write("           <li><a href=\"index.jsp\">Logout</a></li>       \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-9 col-sm-12 right bothpadding\">\n");
      out.write("          <div class=\"container\" style=\"padding-bottom: 200px;\">\n");
      out.write("              <div class=\"col-12 col-md-12 col-lg-12 text-center\"> <h1 class=\"page-header\">AVAILABLE  <small class=\"small-header\">ROOMS</small></h1></div>\n");
      out.write("               <p>Welcome, ");
      out.print(session.getAttribute("username"));
      out.write("</p>\n");
      out.write("                 <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 text-center\">\n");
      out.write("                        <div class=\"container\" style=\"background-color: white;\">           \n");
      out.write("                            </br>         \n");
      out.write("                                <div style=\" border: 1px solid #428BCA;\">\n");
      out.write("                                    <h4 class=\"text-white roomhead\">Room Details</h4>\n");
      out.write("                                        <div>\n");
      out.write("                                            <table class=\"table\">\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>Room Id</th>\n");
      out.write("                                                    <th>Room Type</th>\n");
      out.write("                                                    <th>Bedding</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                                 ");



                                                 try{
                                                 connection = DriverManager.getConnection(connectionUrl+database, userid, password);
                                                 statement=connection.createStatement();

                                                 String sql ="select * from room ";
                                                 resultSet = statement.executeQuery(sql);
                                                 while(resultSet.next()){

                                                 
      out.write("\n");
      out.write("\n");
      out.write("                                                      <tr>\n");
      out.write("                                                        <td>");
out.println(resultSet.getString("room_id"));
      out.write("</td>\n");
      out.write("                                                        <td>");
out.println(resultSet.getString("room_type"));
      out.write("</td>\n");
      out.write("                                                        <td>");
out.println(resultSet.getString("bedding_type"));
      out.write("</td>\n");
      out.write("                                                      </tr>\n");
      out.write("\n");
      out.write("                                                 ");


                                                 }
                                                 connection.close();
                                                 } catch (Exception e) {
                                                 e.printStackTrace();
                                                 }
                                                 
      out.write("\n");
      out.write("\n");
      out.write("                                                 </table>\n");
      out.write("                                       </div>\n");
      out.write("                                      </br>\n");
      out.write("                                </div>\n");
      out.write("                                </br>\n");
      out.write("                                </br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>          \n");
      out.write("            </div>\n");
      out.write("        </div>           \n");
      out.write("    </div>      \n");
      out.write("</section>\n");
      out.write(" <script src=\"../admin/js/bootstrap.min.js\"></script>\n");
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
