package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
String userdbName;
String userdbPsw;
String dbUsertype;
String userFName;
String dbUserid;


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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../admin/css/bootstrap.min.css\">\n");
      out.write("             <link  rel=\"stylesheet\" href=\"../css/all.css\">     \n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"../admin/css/index_style.css\">\n");
      out.write("         <script src=\"../admin/js/jquery.min.js\"></script>       \n");
      out.write("        <title>Admin</title>\n");
      out.write("    </head>\n");
      out.write(" <body>\n");
      out.write("   <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("       <a class=\"navbar-brand\" href=\"#\"><h2 class=\"font-weight-bold\" id=\"sun\">SUN <span id=\"rise\">RISE</sapan> <span id=\"hotel\">HOTEL</sapan></h2></a>\n");
      out.write("           \n");
      out.write("   </nav>\n");
      out.write("   <div>\n");
      out.write("   </br>\n");
      out.write("   </br>\n");
      out.write("       <div class=\"row\">\n");
      out.write("           <div class=\" col-md-3 col-lg-3\"></div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-12 col-md-6 col-lg-6 transbox\">\n");
      out.write("                    </br>\n");
      out.write("                        <h3 class=\"font-weight-bold text-center text-white\">ADMINISTRATOR LOGIN</h3>\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                 </br>\n");
      out.write("                                    <form action=\"index.jsp\" method=\"POST\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <!--label for=\"username\">Username:</label-->\n");
      out.write("                                            <input type=\"text\" class=\"form-control\"  placeholder=\"Enter username\" name=\"username\">\n");
      out.write("                                       </div>\n");
      out.write("                                        </br>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                         <!--label for=\"pwd\">Password:</label-->\n");
      out.write("                                          <input type=\"password\" class=\"form-control\"  placeholder=\"Enter password\" name=\"pswd\">\n");
      out.write("                                        </div>\n");
      out.write("                                        </br>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-4\"></div>\n");
      out.write("                                            <div class=\"col-sm-4 \"><button type=\"submit\" class=\"btn btn-primary btn-block\">Login</button></div>\n");
      out.write("                                            <div class=\"col-sm-4 \"></div>\n");
      out.write("                                       </div>\n");
      out.write("                                        </br>\n");
      out.write("                                       \n");
      out.write("                                    </form>\n");
      out.write("                            </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-lg-3\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("     \n");
      out.write("    \n");
      out.write("   ");
      out.write('\n');
      out.write('\n');


Connection con= null;

PreparedStatement ps = null;

ResultSet rs = null;



String driverName = "com.mysql.jdbc.Driver";

String url = "jdbc:mysql://localhost:3306/sunrise";

String user = "root";

String dbpsw = "";



String sql = "select * from admin where username=? and password=? ";



String name = request.getParameter("username");
String password = request.getParameter("pswd");

//String usertype = request.getParameter("usertype");




try{

        Class.forName(driverName);

        con = DriverManager.getConnection(url, user, dbpsw);

        ps = con.prepareStatement(sql);

        ps.setString(1, name);

        ps.setString(2, password);

        rs = ps.executeQuery();

                if(rs.next()){ 

                userdbName = rs.getString("username");          
                userdbPsw = rs.getString("password");
             
                if(name.equals(userdbName) && password.equals(userdbPsw)) {

       
                        session.setAttribute("username",userdbName);
                        response.sendRedirect("rooms.jsp");
                    
                    
                 
                }else{
                       
                        rs.close();
                        ps.close(); 

                      }

                
                }

      }catch(SQLException sqe){

        out.println(sqe);

        } 



      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("     \n");
      out.write("    \n");
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
