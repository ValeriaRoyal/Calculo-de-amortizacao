package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tabela_002dprice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jspf/home.jspf");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"CSS/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"home.jsp\">Home</a>||\r\n");
      out.write("<a href=\"amortizaca-americana\">Amortização Americana</a>||\r\n");
      out.write("<a href=\"amortizacao-constante.jsp\">Amortização Constante</a>||\r\n");
      out.write("<a href=\"tabela-price.jsp\">Tabela Price</a>||\r\n");
      out.write("\r\n");
      out.write("<hr>");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <h1 align='center'>Sistema Price de Amortização</h1>\r\n");
      out.write("            <p align=\"center\">Tabela Price, também chamado de sistema francês de amortização \r\n");
      out.write("                          é um método usado em amortização de empréstimo cuja principal\r\n");
      out.write("                          característica é apresentar prestações (ou parcelas) iguais. </p>\r\n");
      out.write("        <hr/>\r\n");
      out.write("    <form>\r\n");
      out.write("        Empréstimo inicial (em R$):<br><input type=\"text\" name=\"C\"><br>\r\n");
      out.write("        Tempo (em meses):<br><input type=\"text\" name=\"n\"><br>\r\n");
      out.write("        Taxa de juros (% em meses):<br><input type=\"text\" name=\"i\"><br>\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"submit\" nome =\"calculo\" value=\"Calcular\">\r\n");
      out.write("    </form> \r\n");
      out.write("      \r\n");
      out.write("    ");
  try {   
                // pegando os valores do formulario e convertendo.
                double C = Double.parseDouble(request.getParameter("C"));
                double i = Double.parseDouble(request.getParameter("i")) / 100; // Taxa de juros convertida em porcentagem
                int n = Integer.parseInt(request.getParameter("n"));
                double PMT, juros, saldo = C; //Prestação, juros, saldo = Capital
                
                // tratamento de erro
                if (C > 0.0 && n > 0 && i > 0.0){  
      out.write("\r\n");
      out.write("                <table>\r\n");
      out.write("                     <tr><th>Mês</th><th>Saldo Devedor</th><th>Amortização</th><th>Juros</th><th>Parcela</th></tr>\r\n");
      out.write("                        ");
  PMT = C / ((1 - Math.pow(1 + i, -n)) / i);
                        for (int ct = 1; ct <= n; ct++){
                            juros = saldo * i;
                            saldo -= (PMT - juros); 
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <tr><th>");
      out.print( ct );
      out.write("</th><td>");
      out.print( String.format("%.2f", saldo) );
      out.write("</td><td>");
      out.print( String.format("%.2f", PMT - juros) );
      out.write("</td><td>");
      out.print( String.format("%.2f", juros) );
      out.write("</td><td>");
      out.print( String.format("%.2f", PMT) );
      out.write("</td></tr>\r\n");
      out.write("                        ");
  }  
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("                    ");
  } else {  
      out.write("\r\n");
      out.write("                        <h3>Favor colocar valores maiores que zero.</h3>\r\n");
      out.write("                    ");
  }
    } catch (Exception ex){  
      out.write("\r\n");
      out.write("        <h3>Favor colocar valores válidos.</h3>\r\n");
  }  
      out.write("\r\n");
      out.write("           \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
