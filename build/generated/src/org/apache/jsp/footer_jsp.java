package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("      <div class=\"col-md-12\">          \n");
      out.write("<div class=\"container\">\n");
      out.write("  <footer class=\"py-5\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-6 col-md-2 mb-3\">\n");
      out.write("        <h5>Section</h5>\n");
      out.write("        <ul class=\"nav flex-column\">\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Home</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Features</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Pricing</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">FAQs</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">About</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-6 col-md-2 mb-3\">\n");
      out.write("        <h5>Section</h5>\n");
      out.write("        <ul class=\"nav flex-column\">\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Home</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Features</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Pricing</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">FAQs</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">About</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-6 col-md-2 mb-3\">\n");
      out.write("        <h5>Section</h5>\n");
      out.write("        <ul class=\"nav flex-column\">\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Home</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Features</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Pricing</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">FAQs</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">About</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-5 offset-md-1 mb-3\">\n");
      out.write("        <form>\n");
      out.write("          <h5>Subscribe to our newsletter</h5>\n");
      out.write("          <p>Monthly digest of what's new and exciting from us.</p>\n");
      out.write("          <div class=\"d-flex flex-column flex-sm-row w-100 gap-2\">\n");
      out.write("            <label for=\"newsletter1\" class=\"visually-hidden\">Email address</label>\n");
      out.write("            <input id=\"newsletter1\" type=\"text\" class=\"form-control\" placeholder=\"Email address\">\n");
      out.write("            <button class=\"btn btn-primary\" type=\"button\">Subscribe</button>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"d-flex flex-column flex-sm-row justify-content-between py-4 my-4 border-top\">\n");
      out.write("      <p>&copy; 2022 Company, Inc. All rights reserved. SATISH ARYAN &#x2744;\n");
      out.write("</p>\n");
      out.write("      <ul class=\"list-unstyled d-flex\">\n");
      out.write("        <li class=\"ms-3\"><a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\"><use xlink:href=\"#twitter\"/></svg></a></li>\n");
      out.write("        <li class=\"ms-3\"><a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\"><use xlink:href=\"#instagram\"/></svg></a></li>\n");
      out.write("        <li class=\"ms-3\"><a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\"><use xlink:href=\"#facebook\"/></svg></a></li>\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\" crossorigin=\"anonymous\"></script>\n");
      out.write("  \n");
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
