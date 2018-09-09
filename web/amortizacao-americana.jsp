<%-- 
    Document   : amortizacao_americana
    Created on : 01/09/2018, 00:24:26
    Author     : José Wandes
--%>


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

        <%@include file="WEB-INF/jspf/home.jspf"%>           

        <link href= "CSS/styleOficial.css" rel="stylesheet"/>

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
                    <form>
                        <p>Saldo Devedor :  <input  type="text" name="vl_divida" size="20" border="none"
                                                    border-radius="4px">            
                            Taxa de Juros (%):  <input   type="text" name="vl_juros" size="3">            
                            Tempo :  <input   type="text" name="qt_mes" size="5">
                        </p>
                        <br>

                        <input class="btn" type="submit" name="calcular" value="Calcular">
                        <br>
                    </form>

                    <%if (request.getParameter("calcular") != null) {
                            NumberFormat formatacao = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

                            double divida = Double.parseDouble(request.getParameter("vl_divida"));
                            double juros = Double.parseDouble(request.getParameter("vl_juros"));
                            double tempo = Double.parseDouble(request.getParameter("qt_mes"));
                            double prestacao = (juros / 100) * divida;
                            double ac_amortizacao = 0, ac_juros = 0, ac_prestacao= 0;
                    %>

                    
                    <table class="tabela2">

                        <tr>
                            <th>Mês</th>
                            <th>Saldo Devedor</th>
                            <th>Amortização</th>
                            <th>Juros</th>
                            <th>Prestação</th>
                        </tr>
                        <%for (int i = 0; i <= tempo; i++) {%>
                        <tr>     
                            
                            <%--mês--%>
                            <td><%=i%></td>
                            
                            <%--saldo devedor --%>
                            <%if (i < tempo) {%>                             
                            <td><%="R$ "+formatacao.format(divida)%></td>                                  
                            <%} else {%>      
                            <td>-</td>               
                            <%}%>  
                            
                            <%--amortização --%>
                            <%if (i == tempo) {%>                             
                            <td><%="R$ "+formatacao.format(divida)%></td>                            
                            <%} else {%>            
                            <td>-</td>               
                            <%}%>                         
                            
                            <%--juros--%>
                            <%if (i > 0 ) {%>                             
                            <td><%="R$ "+formatacao.format(prestacao)%></td> 
                            <%ac_juros +=prestacao;%>
                            <%} else {%>                                 
                            <td>-</td>               
                            <%}%>                                          
                            
                            <%--Prestação--%>
                            <%if (i > 0 && i <10) {%>                             
                            <td><%="R$ "+formatacao.format(prestacao)%></td> 
                            <%ac_prestacao +=prestacao;%>
                            <%} else if(i <10) {%>                             
                            <td>-</td>   
                            <%--prestação = amortização + juros --%>
                            <%}else if(i == tempo){%> 
                            <td><%="R$ "+formatacao.format(divida+prestacao)%></td>  
                            <%ac_amortizacao=divida+prestacao;%>                        
                            <%}%>
                                                       
                        </tr>
                        <%}%> 
                        
                        <tr>
                            <td>Total :</td>
                             <td>-</td>
                            <td><%="R$ "+formatacao.format(divida)%></td>
                            <td><%="R$ "+formatacao.format(ac_juros)%></td>
                            <td><%="R$ "+formatacao.format(ac_prestacao+ac_amortizacao)%></td>
                        </tr>
                        
                        
                    </table>
                    <%}%>
                   
                    </body>
                    </html>

