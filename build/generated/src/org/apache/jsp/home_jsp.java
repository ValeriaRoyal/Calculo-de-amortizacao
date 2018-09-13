package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/cabecalho.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/rodape.jspf");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("<link href=\"CSS/styleOficial.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("<nav> ");
      out.write("\n");
      out.write("        \n");
      out.write("    <div class=\"areaCabecalho\">\n");
      out.write("            <div class=\"area\">\n");
      out.write("                <h1 id=\"logo\" >PROJETO 2</h1>\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <a href=\"home.jsp\">HOME</a>\n");
      out.write("                    <a href=\"amortizacao-americana.jsp\">AMORTIZAÇÃO AMERICANA</a>\n");
      out.write("                    <a href=\"amortizacao-constante.jsp\">AMORTIZAÇÃO CONSTANTE</a>\n");
      out.write("                    <a href=\"tabela-price.jsp\">TABELA PRICE</a>\n");
      out.write("                </div>               \n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Pagina Inicial!!</h1>\n");
      out.write("        \n");
      out.write("        <div> ");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"CSS/styleOficial.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("<footer id=\"areaRodape\">\n");
      out.write("    <p id=\"textoRodape\">Todos os direitos reservados.</p>\n");
      out.write("    <a href=\"https://github.com/ValeriaRoyal/Calculo-de-amortizacao\">GitHub</a>\n");
      out.write("</footer>     \n");
      out.write("</div> \n");
      out.write("    </body>\n");
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
