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
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <form>\n");
      out.write("        Periodo\n");
      out.write("        <input type=\"text\" name=\"periodo\">\n");
      out.write("        <br>Saldo  devedor\n");
      out.write("        <input type=\"text\" name=\"saldev\">\n");
      out.write("        <br>Parcela\n");
      out.write("        <input type=\"text\" name=\"parcela\">\n");
      out.write("        <br>Juros\n");
      out.write("        <input type=\"text\" name=\"juros\">\n");
      out.write("        <br>\n");
      out.write("        <input type=\"submit\" nome =\"calculo\" value=\"Calcular\">\n");
      out.write("    </form> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("          <th>Periodo <i>n</i></th>\n");
      out.write("          <th>Saldo Devedor <i>PV-A</i></th>\n");
      out.write("          <th>Parcela <i>pmt</i></th>\n");
      out.write("          <th>Juros <i>J</i></th>\n");
      out.write("          <th>Amortização <i>pmt - J</i></th>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("  ");
 
        int saldev = 0;
        int juros = 0;
        int parcela = 0;
        int periodo = 0;
        int prestacao =0;
        
        
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("        ");
if((request.getParameter("saldev")!=null)){ 
      out.write("      \n");
      out.write("            ");
for(int i = 0; i<= periodo;i++){ 
      out.write("      \n");
      out.write("                <td>");
      out.print( i );
      out.write("</td> \n");
      out.write("                <td>");
      out.print( saldev );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( (int)(saldev/(1-(1+(juros/100)^-periodo)/(juros/100))) );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( (saldev = saldev * juros));
      out.write("</td>\n");
      out.write("                <td>");
      out.print( (prestacao - (juros/100)));
      out.write("</td>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        </table>    \n");
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
