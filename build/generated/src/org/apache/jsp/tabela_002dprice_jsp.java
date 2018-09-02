package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tabela_002dprice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("        \n");
      out.write("    <form>\n");
      out.write("        \n");
      out.write("        <br>Empréstimo inicial (em R$):\n");
      out.write("        <input type=\"text\" name=\"C\">\n");
      out.write("        <br>Tempo (em meses):\n");
      out.write("        <input type=\"text\" name=\"n\">\n");
      out.write("        <br>Taxa de juros (% em meses):\n");
      out.write("        <input type=\"text\" name=\"i\">\n");
      out.write("        <br>\n");
      out.write("        <input type=\"submit\" nome =\"calculo\" value=\"Calcular\">\n");
      out.write("    </form> \n");
      out.write("     \n");
      out.write("         <table>\n");
      out.write("            <tr>\n");
      out.write("              <th>Periodo <i>n</i></th>\n");
      out.write("              <th>Saldo Devedor <i>PV-A</i></th>\n");
      out.write("              <th>Juros <i>J</i></th>\n");
      out.write("              <th>Parcela <i>pmt</i></th>\n");
      out.write("              <th>Amortização <i>pmt - J</i></th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("      ");
  try {
                double C = Double.parseDouble(request.getParameter("C"));
                double i = Double.parseDouble(request.getParameter("i")) / 100;
                int n = Integer.parseInt(request.getParameter("n"));
                double PMT, juros, saldo = C;

                if (C > 0.0 && n > 0 && i > 0.0){  
      out.write("\n");
      out.write("                <table border=\"1\" class=\"fonte\"; font-size: 1.5em;\">\n");
      out.write("                    <tr><th>Mês</th><th>Parcela</th><th>Amortização</th><th>Juros</th><th>Saldo Devedor</th></tr>\n");
      out.write("            ");
  PMT = C / ((1 - Math.pow(1 + i, -n)) / i);
                for (int ct = 1; ct <= n; ct++){
                    juros = saldo * i;
                    saldo -= (PMT - juros); 
      out.write("\n");
      out.write("                    <tr><th>");
      out.print( ct );
      out.write("</th><td>");
      out.print( String.format("%.2f", PMT) );
      out.write("</td><td>");
      out.print( String.format("%.2f", PMT - juros) );
      out.write("</td><td>");
      out.print( String.format("%.2f", juros) );
      out.write("</td><td>");
      out.print( String.format("%.2f", saldo) );
      out.write("</td></tr>\n");
      out.write("            ");
  }  
      out.write("\n");
      out.write("                </table>\n");
      out.write("            ");
  } else {  
      out.write("\n");
      out.write("                    <h3 class=\"h3fonte\">Favor colocar valores maiores que zero.</h3>\n");
      out.write("            ");
  }
            } catch (Exception ex){  
      out.write("\n");
      out.write("                <h3 class=\"h3fonte\">Favor colocar valores válidos.</h3>\n");
  }  
      out.write("\n");
      out.write("        \n");
      out.write("         </table>    \n");
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
