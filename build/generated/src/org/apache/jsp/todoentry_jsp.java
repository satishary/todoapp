package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.naming.spi.DirStateFactory.Result;
import databasepackage.DbConnect;
import java.sql.PreparedStatement;
import utilitiespackage.Utilities;

public final class todoentry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<title>Task Entry</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("     <nav class=\"navbar navbar-expand-lg bg-light\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Home</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Utilities\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"todoentry.jsp\">Insert Todo</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"alltodo.jsp\">View Todo</a></li>\n");
      out.write("            <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link disabled\">Disabled</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\" role=\"search\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("    ");

        boolean ispostback = Utilities.isPostBack(request);
        System.err.println(ispostback);

        String task = "", description = "", dateoftask = "", status = "",result="";
        System.out.println("ispostback");
       
        if (ispostback) {
            task = request.getParameter("task");
            description = request.getParameter("description");
            dateoftask = request.getParameter("dateoftask");
           // out.println(dateoftask);
            status = request.getParameter("status");
            PreparedStatement ps=DbConnect.connect().prepareStatement("insert into todo values(todosequence.nextval,?,?,  to_date(?,'yyyy-mm-dd'),?)");
            ps.setString(1, task);
            ps.setString(2, description);
            ps.setString(3,dateoftask);
            ps.setString(4, status);
             int n = ps.executeUpdate();
            if(n>0)
            result=Utilities.successMessage("Inserted Successfully");
            else
                result=Utilities.errorMessage("Inserting Failed");
           

        }


    
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\"></div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <h1>");
      out.print(result);
      out.write("</h1>\n");
      out.write("                <form method=\"post\">\n");
      out.write("                    \n");
      out.write("                    <input type=\"hidden\" name=\"check\">\n");
      out.write("                    <div class=\"form-floating\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" value=\"");
      out.print(task);
      out.write("\" id=\"lbltask\" name=\"task\" placeholder=\"task\">\n");
      out.write("                        <label for=\"lbltask\">task</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-floating\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" value=\"");
      out.print(description);
      out.write("\" id=\"lbdescription\" name=\"description\" placeholder=\"description\">\n");
      out.write("                        <label for=\"lbdescription\">description</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-floating\">\n");
      out.write("                        <input type=\"date\" class=\"form-control\" value=\"");
      out.print(dateoftask);
      out.write("\" id=\"lbdateoftask\" name=\"dateoftask\" placeholder=\"dateoftask\">\n");
      out.write("                        <label for=\"lbdateoftask\">dateoftask</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-floating\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" value=\"");
      out.print(status);
      out.write("\" id=\"lbstatus\" name=\"status\" placeholder=\"status\">\n");
      out.write("                        <label for=\"lbstatus\">status</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-floating\">\n");
      out.write("                        <input value=\"Submit\" type=\"submit\" class=\"form-control btn btn-primary\" id=\"lbsubmit\" placeholder=\"status\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3\"></div>\n");
      out.write("        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-2\"></div>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                ");
      out.print(Utilities.getTodoListInTable());
      out.write("\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\"></div>\n");
      out.write("                        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-md-12\">\n");
      out.write("          &COPY; Satish\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
