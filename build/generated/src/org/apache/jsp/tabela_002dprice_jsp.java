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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Tabela Price</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("    <div class=\"fundo\">        \r\n");
      out.write("            <h3>Sistema Price de Amortização</h3>\r\n");
      out.write("                <form>\r\n");
      out.write("                    \r\n");
      out.write("                    Empréstimo inicial (em R$):<br><input type=\"text\" name=\"C\"><br>\r\n");
      out.write("                    Tempo (em meses):<br><input type=\"text\" name=\"n\"><br>\r\n");
      out.write("                    Taxa de juros (% em meses):<br><input type=\"text\" name=\"i\"><br>\r\n");
      out.write("                    <input type=\"submit\" value=\"Calcular\"></td>\r\n");
      out.write("                    \r\n");
      out.write("                </form>\r\n");
      out.write("            \r\n");
      out.write("               \r\n");
      out.write("            ");
  try {
                    double C = Double.parseDouble(request.getParameter("C"));
                    double i = Double.parseDouble(request.getParameter("i")) / 100;
                    int n = Integer.parseInt(request.getParameter("n"));
                    double PMT, juros; 
                    double saldo = C;

                    if (C > 0.0 && n > 0 && i > 0.0){  
      out.write("\r\n");
      out.write("                    <table>\r\n");
      out.write("                            <tr><th>Mês</th>\r\n");
      out.write("                                <th>Parcela</th>\r\n");
      out.write("                                <th>Amortização</th>\r\n");
      out.write("                                <th>Juros</th>\r\n");
      out.write("                                <th>Saldo Devedor</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                    ");
 PMT = C / ((1 - Math.pow(1 + i, -n)) / i);
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    ");
 for (int ct = 0; ct <= n; ct++){
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            <tr><th>");
      out.print( ct );
      out.write("</th>\r\n");
      out.write("                                <td>");
 if(ct!=0){
      out.write("\r\n");
      out.write("                                        ");
      out.print( String.format("%.2f", PMT) );
      out.write("\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>");
 if(ct!=0){
      out.write("\r\n");
      out.write("                                        ");
 juros = saldo * i;
      out.write("\r\n");
      out.write("                                        ");
      out.print( String.format("%.2f", PMT - juros) );
      out.write("\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>");
 if(ct!=0){
      out.write("\r\n");
      out.write("                                    \r\n");
      out.write("                                        ");
 juros = saldo * i;
      out.write("\r\n");
      out.write("                                        ");
      out.print( String.format("%.2f", juros) );
      out.write("\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>");
 if(ct==0){
      out.write("\r\n");
      out.write("                                        ");
      out.print( String.format("%.2f", saldo) );
      out.write("\r\n");
      out.write("                                    ");
}else{
      out.write("\r\n");
      out.write("                                        ");
 juros = saldo * i;
      out.write("\r\n");
      out.write("                                        ");
 saldo -= (PMT - juros);
      out.write("\r\n");
      out.write("                                        ");
      out.print( String.format("%.2f", saldo) );
      out.write("\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                    ");
  }  
      out.write("\r\n");
      out.write("                        </table>\r\n");
      out.write("                ");
  } else {  
      out.write("\r\n");
      out.write("                        <h3>Favor colocar valores maiores que zero.</h3>\r\n");
      out.write("                ");
  }
                } catch (Exception ex){  
      out.write("\r\n");
      out.write("                    <h3>Favor colocar valores válidos.</h3>\r\n");
      out.write("                ");
  }  
      out.write("\r\n");
      out.write("    </div>        \r\n");
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
