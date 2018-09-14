package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
import java.util.Locale;

public final class amortizacao_002dconstante_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Projeto2 - Amortização Constante</title>\r\n");
      out.write("        <link href=\"CSS/styleOficial.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/jquery.mask.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('#01').mask(\"999.999,00\", {reverse: true});\r\n");
      out.write("                $('#02').mask(\"99.99\");\r\n");
      out.write("                $('#03').mask(\"999.999\", {reverse: true});\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#numerico').keyup(function () {\r\n");
      out.write("                $('#01').val(this.value.replace(/\\D/g, ''));\r\n");
      out.write("                $('#02').val(this.value.replace(/\\D/g, ''));\r\n");
      out.write("                $('#03').val(this.value.replace(/\\D/g, ''));\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body> \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
      out.write("<link href=\"CSS/styleOficial.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("<nav> ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    <div class=\"areaCabecalho\">\r\n");
      out.write("            <div class=\"area\">\r\n");
      out.write("                <h1 id=\"logo\" >PROJETO 2</h1>\r\n");
      out.write("                <div id=\"menu\">\r\n");
      out.write("                    <a href=\"home.jsp\">HOME</a>\r\n");
      out.write("                    <a href=\"amortizacao-americana.jsp\">AMORTIZAÇÃO AMERICANA</a>\r\n");
      out.write("                    <a href=\"amortizacao-constante.jsp\">AMORTIZAÇÃO CONSTANTE</a>\r\n");
      out.write("                    <a href=\"tabela-price.jsp\">TABELA PRICE</a>\r\n");
      out.write("                </div>               \r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("        <div class=\"fundo\">\r\n");
      out.write("            <h1 id=\"tituloTexto\">AMORTIZAÇÃO CONSTANTE</h1>\r\n");
      out.write("            <div id=\"blocoTexto\">\r\n");
      out.write("                <p class=\"texto\">Neste sistema o saldo devedor é reembolsado em valores \r\n");
      out.write("                    de amortização iguais. Desta forma, no sistema SAC o valor das \r\n");
      out.write("                    prestações é decrescente, já que os juros diminuem a cada prestação. \r\n");
      out.write("                    O valor da amortização é calculada dividindo-se o valor do principal \r\n");
      out.write("                    pelo número de períodos de pagamento, ou seja, de parcelas.</p>\r\n");
      out.write("                <p class=\"texto\">O SAC é um dos tipos de sistema de amortização utilizados em \r\n");
      out.write("                    financiamentos imobiliários. A principal característica do SAC é \r\n");
      out.write("                    que ele amortiza um percentual fixo do valor principal (emissão), \r\n");
      out.write("                    desde o início do financiamento. Esse percentual de amortização é \r\n");
      out.write("                    sempre o mesmo, o que faz com que a parcela de amortização da dívida \r\n");
      out.write("                    seja maior no início do financiamento, fazendo com que o saldo devedor \r\n");
      out.write("                    caia mais rapidamente do que em outros mecanismos de amortização.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <form class=\"areaFormulario\">\r\n");
      out.write("                <p class=\"textoFormulario\">Saldo devedor:</p>\r\n");
      out.write("                <input class=\"entradaFormulario\" type=\"number\" name=\"SD\"/><br/>\r\n");
      out.write("                <p class=\"textoFormulario\">Taxa de juros (%):</p>\r\n");
      out.write("                <input  class=\"entradaFormulario\" type=\"number\" name=\"TX\"/><br/>\r\n");
      out.write("                <p class=\"textoFormulario\">Tempo:</p>\r\n");
      out.write("                <input  class=\"entradaFormulario\" type=\"number\" name=\"T\"/><br/>\r\n");
      out.write("                <input class=\"calcular\" type=\"submit\" name=\"BC\" value=\"Calcular\"/>\r\n");
      out.write("            </form>\r\n");
      out.write("            <br/>\r\n");
      out.write("\r\n");
      out.write("            ");
if (request.getParameter("BC") != null && !request.getParameter("SD").isEmpty() && !request.getParameter("TX").isEmpty()
                        && !request.getParameter("T").isEmpty()) {

                    NumberFormat formato = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

                    double SaldoDevedor = Double.parseDouble(request.getParameter("SD"));
                    double TaxaJuros = (Double.parseDouble(request.getParameter("TX"))) / 100;
                    double Tempo = Double.parseDouble(request.getParameter("T"));
                    double Amortizacao = SaldoDevedor / Tempo;
                    double TotalJ = 0;
                    double TotalP = 0;

            
      out.write("\r\n");
      out.write("            <table class=\"tabela\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Tempo</th><th>Prestação</th><th>Juros</th>\r\n");
      out.write("                    <th>Amortização</th><th>Saldo Devedor</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
for (int i = 0; i <= Tempo; i++) {
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <td>");
      out.print(i);
      out.write("</td>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
if (i != 0) {
      out.write("\r\n");
      out.write("                        ");
TotalP += Amortizacao + (SaldoDevedor * TaxaJuros);
      out.write("\r\n");
      out.write("                        ");
      out.print("R$ " + formato.format(Amortizacao + (SaldoDevedor * TaxaJuros)));
      out.write("\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
if (i != 0) {
      out.write("\r\n");
      out.write("                        ");
TotalJ += SaldoDevedor * TaxaJuros;
      out.write("\r\n");
      out.write("                        ");
      out.print("R$ " + formato.format(SaldoDevedor * TaxaJuros));
      out.write("\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
if (i != 0) {
      out.write("\r\n");
      out.write("                        ");
      out.print("R$ " + formato.format(Amortizacao));
      out.write("\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
if (i == 0) {
      out.write("\r\n");
      out.write("                        ");
      out.print("R$ " + formato.format(SaldoDevedor));
      out.write("\r\n");
      out.write("                        ");
} else {
      out.write("\r\n");
      out.write("                        ");
      out.print("R$ " + formato.format(SaldoDevedor -= Amortizacao));
      out.write("\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>   \r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <th>Total</th>\r\n");
      out.write("                    <td colspan=\"2\">");
      out.print("Pago - R$ " + formato.format(TotalP));
      out.write("</td>\r\n");
      out.write("                    <td colspan=\"2\">");
      out.print("Juros pago - R$ " + formato.format(TotalJ));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            ");
} else if (request.getParameter("BC") != null) {
      out.write("\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("                window.alert(\"Preencha os campos!!\");\r\n");
      out.write("\r\n");
      out.write("            </script>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"CSS/styleOficial.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("<footer id=\"areaRodape\">\r\n");
      out.write("    <p id=\"textoRodape\">Todos os direitos reservados.</p>\r\n");
      out.write("    <a href=\"https://github.com/ValeriaRoyal/Calculo-de-amortizacao\">GitHub</a>\r\n");
      out.write("</footer>     \r\n");
      out.write("\r\n");
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
