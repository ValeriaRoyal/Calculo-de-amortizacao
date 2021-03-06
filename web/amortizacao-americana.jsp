<%--
    Document   : amortizacao_americana
    Created on : 01/09/2018, 00:24:26
    Author     : José Wandes
--%>


<%@page import="com.sun.java.swing.plaf.windows.resources.windows"%>
<%@page import="java.text.DecimalFormatSymbols"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.text.NumberFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   

        <title>Amortização Americana</title>

    <div><%@include file="WEB-INF/jspf/cabecalho.jspf"%> </div>           

    <link href= "CSS/styleOficial.css" rel="stylesheet"/>

    <script type="text/javascript" src="Js/jquery-3.3.1.min.js"></script>

    <script type="text/javascript" src="Js/jquery.mask.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $("tr#tbl").css("color", "Red");
        });
    </script>

</head>
<body>
    <div class="titulo2">
        <h1>
            AMORTIZAÇÃO AMERICANA
        </h1>
    </div>

    <div class="texto2"><p><b><br>O Sistema de Amortização Americano é uma forma de pagamento de empréstimos que se caracteriza pelo 
                pagamento apenas dos juros da dívida, deixando o valor da dívida constante, que pode ser paga em apenas um único pagamento.<br><br>
                Esse sistema de amortização tem a vantagem em relação ao sistema de pagamento único, pois nele não há incidência de juros sobre juros.
                Os juros sempre incidem sobre o valor original da dívida. Com isso o devedor pode quitar sua dívida quando quiser.<br><br>
                Tem como desvantagem que o pagamento de juros pode, em tese, ser perpétuo mesmo quando já se pagou o equivalente à 
                dívida em si. Para isso, basta que o número de prestações exceda 100% quando da soma dos juros simples.</p></div>
                <br><br>
                <h1>
                    Faça o cálculo :
                </h1>
                <br><br>
                <form name="formulario "method="post">
                    <p>Saldo Devedor :  <input type="number" name="vl_divida" size="20" border="none"
                                               border-radius="4px" placeholder="Saldo Devedor">            
                        Taxa de Juros (%):  <input  type="number" name="vl_juros" size="3" placeholder="Juros">            
                        Tempo :  <input  type="number" name="qt_mes" size="5" placeholder="Tempo">
                    </p>
                    <br>

                    <input class="btn" type="submit" name="calcular" value="Calcular">
                    <br>
                </form>

                <%if (request.getParameter("calcular") != null && !request.getParameter("vl_divida").isEmpty() && !request.getParameter("vl_juros").isEmpty()
                            && !request.getParameter("qt_mes").isEmpty()) {

                        NumberFormat formatacao = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

                        double sd_devedor = Double.parseDouble(request.getParameter("vl_divida"));

                        double qtPrestacao = Double.parseDouble(request.getParameter("qt_mes"));

                        double prestacao = sd_devedor * (Double.parseDouble(request.getParameter("vl_juros")) / 100);

                        double acumula_amortizacao = 0, acumula_juros = 0, acumula_prestacao = 0;

                        double amortizacao = 0, juros = 0;
                %>


                <table class="tabela2">

                    <tr>
                        <th>N° Prestações</th>
                        <th>Amortização</th>
                        <th>Juros( <%=request.getParameter("vl_juros")%>% de <%=formatacao.format(sd_devedor)%>)</th>
                        <th>Divida</th>

                    </tr>

                    <%amortizacao = sd_devedor;
                            juros = prestacao;%>

                    <%for (int nPrestacao = 0; nPrestacao <= qtPrestacao; nPrestacao++) {%>
                    <tr>     

                        <%--Exibindo Meses--%>

                        <td><%=nPrestacao%></td>

                        <%--Exibindo Amortização --%>

                        <%if (nPrestacao == qtPrestacao) {%>                             
                        <td><%="R$ " + formatacao.format(amortizacao)%></td>                            
                        <%} else {%>            
                        <td>0</td>               
                        <%}%>

                        <%--Exibindo Juros--%>

                        <%if (nPrestacao > 0) {%>                             
                        <td><%="R$ " + formatacao.format(juros)%></td> 
                       
                        <%--Acmulando Juros--%>
                        
                        <%acumula_juros += juros;%>  
                        <%} else {%>                                 
                        <td>0</td>               
                        <%}%>

                        <%--Exibindo saldo devedor --%>

                        <%if (nPrestacao < qtPrestacao) {%>                             
                        <td><%="R$ " + formatacao.format(sd_devedor)%></td>                                  
                        <%} else {%>      
                        <td>0</td>     
                        <%}%>                           

                    </tr>
                    <%}%> 
                    <tr id="tbl">
                        <td >Total :</td>
                        <td><%="R$ " + formatacao.format(amortizacao)%></td> 
                        <td><%="R$ " + formatacao.format(acumula_juros)%></td>                                                      
                        <td><%="R$ " + formatacao.format(amortizacao + acumula_juros)%></td>
                    </tr>



                </table>
                <%} else if (request.getParameter("calcular") != null) {%>
                <script type="text/javascript">

                    window.alert("Preencha os campos!!");

                </script>
                <%}%>
                <br> 


                <div> <%@include file="WEB-INF/jspf/rodape.jspf"%></div> 
                </body>
                </html>

