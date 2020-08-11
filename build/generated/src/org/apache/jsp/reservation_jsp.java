package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reservation_style.css\">\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <title>Reservation</title>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("       </br>\n");
      out.write(" <form>\n");
      out.write(" <div class=\"row\">\n");
      out.write("     <div class=\"col-sm-1\"></div>\n");
      out.write("       <div class=\" col-sm-10 transbox\">\n");
      out.write("           <h2 class=\"text-white text-center\">RESERVATION</h2>\n");
      out.write("           <div class=\"row\">   \n");
      out.write("             <div class=\"col-sm-5  transbox2 \">\n");
      out.write("                 <h4 class=\"text-white\">PERSONAL INFORMATION</h4>\n");
      out.write("                 <br>\n");
      out.write("                     <form>\n");
      out.write("                         <div class=\"row\">\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                          <label for=\"title\" class=\"text-white\">Title</label>\n");
      out.write("                          </br>\n");
      out.write("                                 <select class=\"form-control setlen\" name=\"title\" >\n");
      out.write("                                      <option value selected ></option>\n");
      out.write("                                      <option value=\"mr\">Mr.</option>\n");
      out.write("                                      <option value=\"mrs\">Mrs.</option>\n");
      out.write("                                      <option value=\"miss\">Miss.</option>\n");
      out.write("                                 </select>\n");
      out.write("                          \n");
      out.write("                         </div>                          \n");
      out.write("                         </div>\n");
      out.write("                         \n");
      out.write("                   <div class=\"row\">\n");
      out.write("                       <div class=\"form-group\">\n");
      out.write("                          <label for=\"firstname\" class=\"text-white\">First Name</label>\n");
      out.write("                          <input type=\"firstname\" class=\"form-control setlen\" id=\"firstname\" placeholder=\"Enter First Name\" name=\"firstname\" size=\"47\">\n");
      out.write("                       </div>      \n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"row\">\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                          <label for=\"laststname\" class=\"text-white\">Last Name</label>\n");
      out.write("                          <input type=\"lastname\" class=\"form-control setlen\" id=\"lastname\" placeholder=\"Enter Last Name\" name=\"lastname\">\n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                          <label for=\"email\" class=\"text-white\">Email</label>\n");
      out.write("                          <input type=\"email\" class=\"form-control setlen\" id=\"email\" placeholder=\"Enter Email\" name=\"email\">\n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                               <div class=\"col-sm-3\"><label for=\"nation\" class=\"text-white\">Nationality</label></div>\n");
      out.write("                              <div class=\"col-sm-4 text-white\"><input type=\"radio\" name=\"nation\" value=\"SriLankan\" checked> Sri-Lankan</div>\n");
      out.write("                              <div class=\"col-sm-5 text-white\"><input type=\"radio\" name=\"nation\" value=\"NonSriLankan\">Non Sri-Lankan</div>\n");
      out.write("                            </div>\n");
      out.write("                         </div>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                         \n");
      out.write("                           <div class=\"row\">\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                          <label for=\"phone\" class=\"text-white\">Phone Number</label>\n");
      out.write("                          <input type=\"phone\" class=\"form-control setlen\" id=\"phone\" placeholder=\"Enter Phone Number\" name=\"phone\">\n");
      out.write("                         </div>\n");
      out.write("                         </div>\n");
      out.write("                         \n");
      out.write("                     </form>   \n");
      out.write("                      \n");
      out.write("             </div>\n");
      out.write("               <div class=\"col-sm-5 transbox2\">\n");
      out.write("                 <h4 class=\"text-white\">RESERVATION INFORMATION</h4>\n");
      out.write("                      </br>\n");
      out.write("                <form>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                          <label for=\"room\" class=\"text-white\">Type Of Room</label>\n");
      out.write("                          </br>\n");
      out.write("                                 <select class=\"form-control setlen\" name=\"room\">\n");
      out.write("                                      <option value selected ></option>\n");
      out.write("                                      <option value=\"SR\">SUPERIOR ROOM</option>\n");
      out.write("                                      <option value=\"dr\">DELUXE ROOM</option>\n");
      out.write("                                      <option value=\"gh\">GUEST HOUSE</option>\n");
      out.write("                                      <option value=\"ssr\">SINGLE ROOM</option>\n");
      out.write("                                 </select>\n");
      out.write("                          \n");
      out.write("                         </div>                          \n");
      out.write("                         </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                          <label for=\"bed\" class=\"text-white\">Bedding Type</label>\n");
      out.write("                          </br>\n");
      out.write("                                 <select class=\"form-control setlen\" name=\"bed\">\n");
      out.write("                                      <option value selected ></option>\n");
      out.write("                                      <option value=\"sng\">Single</option>\n");
      out.write("                                      <option value=\"dbl\">Double</option>\n");
      out.write("                                      <option value=\"triple\">Triple</option>\n");
      out.write("                                      <option value=\"quad\">Quad</option>\n");
      out.write("                                       <option value=\"none\">None</option>\n");
      out.write("                                 </select>\n");
      out.write("                          \n");
      out.write("                         </div>                          \n");
      out.write("                     </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                          <label for=\"noRoom\" class=\"text-white\">No.of Rooms</label>\n");
      out.write("                          </br>\n");
      out.write("                                 <select class=\"form-control setlen\" name=\"noroom\">\n");
      out.write("                                      <option value selected ></option>\n");
      out.write("                                      <option value=\"r1\">1</option>\n");
      out.write("                                      <option value=\"r2\">2</option>\n");
      out.write("                                      <option value=\"r3\">3</option>\n");
      out.write("                                      <option value=\"r4\">4</option>\n");
      out.write("                                       <option value=\"r5\">5</option>\n");
      out.write("                                 </select>\n");
      out.write("                          \n");
      out.write("                         </div>                          \n");
      out.write("                     </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                          <label for=\"meal\" class=\"text-white\">Meal Plan</label>\n");
      out.write("                          </br>\n");
      out.write("                                 <select class=\"form-control setlen\" name=\"meal\">\n");
      out.write("                                      <option value selected ></option>\n");
      out.write("                                      <option value=\"ro\">Room only</option>\n");
      out.write("                                      <option value=\"bf\">Breakfast</option>\n");
      out.write("                                      <option value=\"hb\">Half Board</option>\n");
      out.write("                                      <option value=\"fb\">Full Board</option>\n");
      out.write("                                 </select>\n");
      out.write("                          \n");
      out.write("                         </div>                          \n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                          <label for=\"chekin\" class=\"text-white\">Check In</label>\n");
      out.write("                          </br>\n");
      out.write("                              <input id=\"check_in_date\" name=\"check_in_date\" type=\"date\" name=\"check_in_date\" class=\"form-control datepicker setlen\" required>\n");
      out.write("                         </div>                          \n");
      out.write("                     </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                          <label for=\"chekout\" class=\"text-white\">Check Out</label>\n");
      out.write("                          </br>\n");
      out.write("                              <input id=\"check_out_date\" name=\"check_out_date\" type=\"date\" name=\"check_out_date\" class=\"form-control datepicker setlen\" required>\n");
      out.write("                         </div>                          \n");
      out.write("                     </div>\n");
      out.write("                </form>    \n");
      out.write("                         \n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("          </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                       <div class=\"col-sm-3 \"></div>\n");
      out.write("                       <div class=\"col-sm-2 \"><button type=\"home\" class=\"btn btn-success\"><a href=\"index.html\" class=\"setColor\">Home</a></button></div>\n");
      out.write("                       <div class=\"col-sm-2 \"><button type=\"submit\" class=\"btn btn-primary\">Submit</button></div>\n");
      out.write("                       <div class=\"col-sm-2 \"><button type=\"signout\" class=\"btn btn-danger\">Sign Out</button></div>>\n");
      out.write("                       <div class=\"col-sm-3 \"></div>\n");
      out.write("                     </div>\n");
      out.write("      </div>\n");
      out.write("     <div class=\"col-sm-1\"></div>\n");
      out.write("                     \n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("</form>   \n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("   </body>\n");
      out.write("   <script>\n");
      out.write("  $('.datepicker').pickadate({\n");
      out.write("    format: 'dd/mm/yyyy',\n");
      out.write("    selectMonths: true, // Creates a dropdown to control month\n");
      out.write("    selectYears: 5, // Creates a dropdown of 15 years to control year\n");
      out.write("    // editable: true\n");
      out.write("  });\n");
      out.write("  $(document).ready(function() {\n");
      out.write("    $('select').material_select();\n");
      out.write("  });\n");
      out.write("</script\n");
      out.write("   \n");
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
