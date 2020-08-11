package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

String userdbName;
String userdbPsw;
String dbUsertype;
String userFName;
String dbUserid;


PreparedStatement ps = null;
ResultSet rs = null;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index_style.css\">\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write(" <body>\n");
      out.write("   <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("       <a class=\"navbar-brand\" href=\"#\"><h2 class=\"font-weight-bold\" id=\"sun\">SUN <span id=\"rise\">RISE</sapan> <span id=\"hotel\">HOTEL</sapan></h2></a>\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"index.jsp\">Login</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"userReg.jsp\">Registration</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("   </nav>\n");
      out.write("   <div>\n");
      out.write("   </br>\n");
      out.write("   </br>\n");
      out.write("       <div class=\"row\">\n");
      out.write("           <div class=\" col-lg-2\"></div>\n");
      out.write("                <div class=\"col-sm-12 col-md-12 col-lg-4 transbox \">\n");
      out.write("                 </br>\n");
      out.write("                    </br>\n");
      out.write("                        </br>\n");
      out.write("                            <h2 class=\"text-white text-center\"> WELCOME</h2>\n");
      out.write("                            <h2 class=\"font-weight-bold text-center\" id=\"sun\">SUN <span id=\"rise\">RISE</sapan> <span id=\"hotel\">HOTEL</sapan></h2>\n");
      out.write("                            <h2 class=\"text-white text-center\"> MANAGEMENT SYSTEM</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-12 col-md-12 col-lg-4 transbox\">\n");
      out.write("                    </br>\n");
      out.write("                        <h3 class=\"font-weight-bold text-center\" style=\"color:white;\">Sign In</h3>\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                 </br>\n");
      out.write("                                    <form action=\"index.jsp\" method=\"POST\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <!--label for=\"username\">Username:</label-->\n");
      out.write("                                           <input type=\"text\" class=\"form-control\" id=\"unme\"  placeholder=\"Enter username\" name=\"username\">\n");
      out.write("                                       </div>\n");
      out.write("                                        </br>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                         <!--label for=\"pwd\">Password:</label-->\n");
      out.write("                                          <input type=\"password\" class=\"form-control\" id=\"ps\" placeholder=\"Enter password\" name=\"pswd\">\n");
      out.write("                                        </div>\n");
      out.write("                                        </br>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-4 \"></div>\n");
      out.write("                                            <div class=\"col-sm-4 \"><button type=\"submit\" class=\"btn btn-primary\" onClick=\"empty()\">SIGN IN</button></div>\n");
      out.write("                                            <div class=\"col-sm-4 \"></div>\n");
      out.write("                                       </div>\n");
      out.write("                                        </br>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <p class=\"text-center text-white\">Don't have a Account ? <a class=\"text-white\" href=\"userReg.jsp\">Sign Up</a> </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                            </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\" col-lg-2\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("     \n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("   \n");


String sql = "select * from user where username=? and password=? ";
String name = request.getParameter("username");
String password = request.getParameter("pswd");


try{
        ps = new DB.DbConnection().getConnection().prepareStatement(sql);    
        ps.setString(1, name);
        ps.setString(2, password);

        rs = ps.executeQuery();
       //int n = rs.getRow();
                if(rs.next()){ 

                userdbName = rs.getString("username");
                String userdbEmail = rs.getString("email");
                userFName = rs.getString("first_name");
                userdbPsw = rs.getString("password");
                dbUsertype = rs.getString("job_type");
                dbUserid = rs.getString("userid");
                if(name.equals(userdbName) && password.equals(userdbPsw)) {

                    
                    if(dbUsertype.toLowerCase().equals("reception")){
                       // session.setAttribute("username",userdbName);
                        session.setAttribute("email",userdbEmail);
                        session.setAttribute("first_name",userFName);
                        session.setAttribute("userid", dbUserid); 
                        response.sendRedirect("reception_profile.jsp");
                    
                    }else{
                        session.setAttribute("email",userdbEmail);
                       // session.setAttribute("username",userdbName);
                        session.setAttribute("first_name",userFName);
                        session.setAttribute("userid", dbUserid); 
                        response.sendRedirect("user_profile.jsp");
                    }

                } 
        }else{
            
               rs.close();
               ps.close(); 
                
              }
                

      }catch(SQLException sqe){

        out.println(sqe);

        } 
       

      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function empty() {\n");
      out.write("      \n");
      out.write("    var x;\n");
      out.write("    var y;\n");
      out.write("    x = document.getElementById(\"unme\").value;\n");
      out.write("    y = document.getElementById(\"ps\").value;\n");
      out.write("    if (x == \"\" || y==\"\") {\n");
      out.write("        alert(\"Username or Password Incorrect\");\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("     \n");
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
