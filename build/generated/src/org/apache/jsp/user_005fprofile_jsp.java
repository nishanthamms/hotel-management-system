package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class user_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("         <link  rel=\"stylesheet\" href=\"css/fontawesome.css\">\n");
      out.write("         <link  rel=\"stylesheet\" href=\"css/all.css\"/>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/userprof_style.css\">\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>       \n");
      out.write("        <title>view payment</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("  <section class=\"intro\">\n");
      out.write("      <div class=\"row about\">         \n");
      out.write("          <h1>MAIN MENU</h1>\n");
      out.write("            <div class=\"col-md-10 col-sm-12\"> </div>   \n");
      out.write("      </div>     \n");
      out.write("<div class=\"row\">       \n");
      out.write("      <div class=\"col-md-3 col-sm-12 left bothpadding\">\n");
      out.write("        <ul class=\"col-sm-12\">       \n");
      out.write("            <li><a  class=\"active\" href=\"user_profile.jsp\">View Payments</a></li>\n");
      out.write("            <li><a href=\"Change_User_password.jsp\">Change Password</a></li>\n");
      out.write("            <li>\n");
      out.write("               \n");
      out.write("                <a href=\"index.jsp\">Logout</a>\n");
      out.write("            </li>      \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"col-md-9 col-sm-12 right bothpadding\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-12 col-md-12 col-lg-12 text-center\"> <h1 class=\"page-header\">VIEW  <small class=\"small-header\">PAYMENT</small></h1></div> \n");
      out.write("                \n");
      out.write("                    <p>Welcome, ");
      out.print(session.getAttribute("first_name"));
      out.write("</p>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12 text-center\">\n");
      out.write("                            <div class=\"container\" style=\"background-color: white;\">          \n");
      out.write("                                </br>     \n");
      out.write("                                \n");
      out.write("                                    <div style=\" border: 1px solid #428BCA;\">\n");
      out.write("                                        <h4 class=\"text-white roomhead\">Payment Details</h4>\n");
      out.write("                                            <div>\n");
      out.write("                                                <table class=\"table table-responsive-sm\">\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <th>Id</th>\n");
      out.write("                                                        <th>Name</th>\n");
      out.write("                                                        <th>Job Type</th>\n");
      out.write("                                                        <th>Basic Salary(Rs)</th>\n");
      out.write("                                                        <th>OT Hours</th>\n");
      out.write("                                                        <th>Hourly Rate</th>\n");
      out.write("                                                        <th>OT Payment(Rs)</th>\n");
      out.write("                                                        <th>Total Salary(Rs)</th>\n");
      out.write("                                                  </tr>\n");
      out.write("                                                   ");

   
   
                                                        try{
                                                        connection = DriverManager.getConnection(connectionUrl+database, userid, password);
                                                        statement=connection.createStatement();
                                                    
                                                        String sql ="SELECT * FROM payment WHERE userid ='"+session.getAttribute("userid")+"' ";
                                                        resultSet = statement.executeQuery(sql);
                                                        while(resultSet.next()){

                                                        
      out.write("\n");
      out.write("\n");
      out.write("                                                             <tr>\n");
      out.write("                                                               <td>");
out.println(resultSet.getString("userid"));
      out.write("</td>\n");
      out.write("                                                               <td>");
out.println(resultSet.getString("name"));
      out.write("</td>\n");
      out.write("                                                               <td>");
out.println(resultSet.getString("job_type"));
      out.write("</td>\n");
      out.write("                                                               <td>");
out.println(resultSet.getString("basic_salary"));
      out.write("</td>\n");
      out.write("                                                               <td>");
out.println(resultSet.getString("ot_hours"));
      out.write("</td>\n");
      out.write("                                                               <td>");
out.println(resultSet.getString("hourly_rate"));
      out.write("</td>\n");
      out.write("                                                               <td>");
out.println(resultSet.getString("ot_payment"));
      out.write("</td>\n");
      out.write("                                                               <td>");
out.println(resultSet.getString("total_salary"));
      out.write("</td>\n");
      out.write("                                                             </tr>\n");
      out.write("\n");
      out.write("                                                        ");


                                                        }
                                                        connection.close();
                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                        
      out.write("\n");
      out.write("                                               </table>\n");
      out.write("                                            </div>\n");
      out.write("                                        </br>\n");
      out.write("                                    </div>\n");
      out.write("                                </br>\n");
      out.write("                               </br>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>         \n");
      out.write("            </div>\n");
      out.write("        </div>           \n");
      out.write("  </div>\n");
      out.write("  </section>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
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
