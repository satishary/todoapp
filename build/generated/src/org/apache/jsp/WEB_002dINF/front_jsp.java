package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class front_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("    <meta name=\"generator\" content=\"Hugo 0.104.2\">\n");
      out.write("    <title>Carousel Template · Bootstrap v5.2</title>\n");
      out.write("\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.2/examples/carousel/\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<link href=\"../assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("      .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media (min-width: 768px) {\n");
      out.write("        .bd-placeholder-img-lg {\n");
      out.write("          font-size: 3.5rem;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .b-example-divider {\n");
      out.write("        height: 3rem;\n");
      out.write("        background-color: rgba(0, 0, 0, .1);\n");
      out.write("        border: solid rgba(0, 0, 0, .15);\n");
      out.write("        border-width: 1px 0;\n");
      out.write("        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .b-example-vr {\n");
      out.write("        flex-shrink: 0;\n");
      out.write("        width: 1.5rem;\n");
      out.write("        height: 100vh;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .bi {\n");
      out.write("        vertical-align: -.125em;\n");
      out.write("        fill: currentColor;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .nav-scroller {\n");
      out.write("        position: relative;\n");
      out.write("        z-index: 2;\n");
      out.write("        height: 2.75rem;\n");
      out.write("        overflow-y: hidden;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .nav-scroller .nav {\n");
      out.write("        display: flex;\n");
      out.write("        flex-wrap: nowrap;\n");
      out.write("        padding-bottom: 1rem;\n");
      out.write("        margin-top: -1px;\n");
      out.write("        overflow-x: auto;\n");
      out.write("        text-align: center;\n");
      out.write("        white-space: nowrap;\n");
      out.write("        -webkit-overflow-scrolling: touch;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"carousel.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("<header>\n");
      out.write("  <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Carousel</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("        <ul class=\"navbar-nav me-auto mb-2 mb-md-0\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link disabled\">Disabled</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"d-flex\" role=\"search\">\n");
      out.write("          <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("          <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<main>\n");
      out.write("\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("    <div class=\"carousel-indicators\">\n");
      out.write("      <button type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("      <button type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("      <button type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"carousel-item active\">\n");
      out.write("        <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><rect width=\"100%\" height=\"100%\" fill=\"#777\"/></svg>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"carousel-caption text-start\">\n");
      out.write("            <h1>Example headline.</h1>\n");
      out.write("            <p>Some representative placeholder content for the first slide of the carousel.</p>\n");
      out.write("            <p><a class=\"btn btn-lg btn-primary\" href=\"#\">Sign up today</a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("        <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><rect width=\"100%\" height=\"100%\" fill=\"#777\"/></svg>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"carousel-caption\">\n");
      out.write("            <h1>Another example headline.</h1>\n");
      out.write("            <p>Some representative placeholder content for the second slide of the carousel.</p>\n");
      out.write("            <p><a class=\"btn btn-lg btn-primary\" href=\"#\">Learn more</a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("        <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><rect width=\"100%\" height=\"100%\" fill=\"#777\"/></svg>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"carousel-caption text-end\">\n");
      out.write("            <h1>One more for good measure.</h1>\n");
      out.write("            <p>Some representative placeholder content for the third slide of this carousel.</p>\n");
      out.write("            <p><a class=\"btn btn-lg btn-primary\" href=\"#\">Browse gallery</a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide=\"prev\">\n");
      out.write("      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"visually-hidden\">Previous</span>\n");
      out.write("    </button>\n");
      out.write("    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide=\"next\">\n");
      out.write("      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"visually-hidden\">Next</span>\n");
      out.write("    </button>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Marketing messaging and featurettes\n");
      out.write("  ================================================== -->\n");
      out.write("  <!-- Wrap the rest of the page in another container to center all the content. -->\n");
      out.write("\n");
      out.write("  <div class=\"container marketing\">\n");
      out.write("\n");
      out.write("    <!-- Three columns of text below the carousel -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-4\">\n");
      out.write("        <svg class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: 140x140\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#777\"/><text x=\"50%\" y=\"50%\" fill=\"#777\" dy=\".3em\">140x140</text></svg>\n");
      out.write("\n");
      out.write("        <h2 class=\"fw-normal\">Heading</h2>\n");
      out.write("        <p>Some representative placeholder content for the three columns of text below the carousel. This is the first column.</p>\n");
      out.write("        <p><a class=\"btn btn-secondary\" href=\"#\">View details &raquo;</a></p>\n");
      out.write("      </div><!-- /.col-lg-4 -->\n");
      out.write("      <div class=\"col-lg-4\">\n");
      out.write("        <svg class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: 140x140\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#777\"/><text x=\"50%\" y=\"50%\" fill=\"#777\" dy=\".3em\">140x140</text></svg>\n");
      out.write("\n");
      out.write("        <h2 class=\"fw-normal\">Heading</h2>\n");
      out.write("        <p>Another exciting bit of representative placeholder content. This time, we've moved on to the second column.</p>\n");
      out.write("        <p><a class=\"btn btn-secondary\" href=\"#\">View details &raquo;</a></p>\n");
      out.write("      </div><!-- /.col-lg-4 -->\n");
      out.write("      <div class=\"col-lg-4\">\n");
      out.write("        <svg class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: 140x140\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#777\"/><text x=\"50%\" y=\"50%\" fill=\"#777\" dy=\".3em\">140x140</text></svg>\n");
      out.write("\n");
      out.write("        <h2 class=\"fw-normal\">Heading</h2>\n");
      out.write("        <p>And lastly this, the third column of representative placeholder content.</p>\n");
      out.write("        <p><a class=\"btn btn-secondary\" href=\"#\">View details &raquo;</a></p>\n");
      out.write("      </div><!-- /.col-lg-4 -->\n");
      out.write("    </div><!-- /.row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- START THE FEATURETTES -->\n");
      out.write("\n");
      out.write("    <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("    <div class=\"row featurette\">\n");
      out.write("      <div class=\"col-md-7\">\n");
      out.write("        <h2 class=\"featurette-heading fw-normal lh-1\">First featurette heading. <span class=\"text-muted\">It?ll blow your mind.</span></h2>\n");
      out.write("        <p class=\"lead\">Some great placeholder content for the first featurette here. Imagine some exciting prose here.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-5\">\n");
      out.write("        <svg class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto\" width=\"500\" height=\"500\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: 500x500\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#eee\"/><text x=\"50%\" y=\"50%\" fill=\"#aaa\" dy=\".3em\">500x500</text></svg>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("    <div class=\"row featurette\">\n");
      out.write("      <div class=\"col-md-7 order-md-2\">\n");
      out.write("        <h2 class=\"featurette-heading fw-normal lh-1\">Oh yeah, it?s that good. <span class=\"text-muted\">See for yourself.</span></h2>\n");
      out.write("        <p class=\"lead\">Another featurette? Of course. More placeholder content here to give you an idea of how this layout would work with some actual real-world content in place.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-5 order-md-1\">\n");
      out.write("        <svg class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto\" width=\"500\" height=\"500\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: 500x500\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#eee\"/><text x=\"50%\" y=\"50%\" fill=\"#aaa\" dy=\".3em\">500x500</text></svg>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("    <div class=\"row featurette\">\n");
      out.write("      <div class=\"col-md-7\">\n");
      out.write("        <h2 class=\"featurette-heading fw-normal lh-1\">And lastly, this one. <span class=\"text-muted\">Checkmate.</span></h2>\n");
      out.write("        <p class=\"lead\">And yes, this is the last block of representative placeholder content. Again, not really intended to be actually read, simply here to give you a better view of what this would look like with some actual content. Your content.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-5\">\n");
      out.write("        <svg class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto\" width=\"500\" height=\"500\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: 500x500\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#eee\"/><text x=\"50%\" y=\"50%\" fill=\"#aaa\" dy=\".3em\">500x500</text></svg>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("    <!-- /END THE FEATURETTES -->\n");
      out.write("\n");
      out.write("  </div><!-- /.container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- FOOTER -->\n");
      out.write("  <footer class=\"container\">\n");
      out.write("    <p class=\"float-end\"><a href=\"#\">Back to top</a></p>\n");
      out.write("    <p>&copy; 2017?2022 Company, Inc. &middot; <a href=\"#\">Privacy</a> &middot; <a href=\"#\">Terms</a></p>\n");
      out.write("  </footer>\n");
      out.write("</main>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"../assets/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("      \n");
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