<%--
    Document   : amortizacao-constante
    Created on : 01/09/2018, 00:23:53
    Author     : valre
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.DecimalFormatSymbols"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Locale"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto2 - Amortização Constante</title>
        <link href="CSS/styleOficial.css" type="text/css" rel="stylesheet"/>
    </head>
    <body> 
        <%@include file="WEB-INF/jspf/cabecalho.jspf"%>
        <div class="fundo">
            <h1 id="tituloTexto">AMORTIZAÇÃO CONSTANTE</h1>
            <div id="blocoTexto">
            <p class="texto">Neste sistema o saldo devedor é reembolsado em valores 
            de amortização iguais. Desta forma, no sistema SAC o valor das 
            prestações é decrescente, já que os juros diminuem a cada prestação. 
            O valor da amortização é calculada dividindo-se o valor do principal 
            pelo número de períodos de pagamento, ou seja, de parcelas.</p>
            <p class="texto">O SAC é um dos tipos de sistema de amortização utilizados em 
            financiamentos imobiliários. A principal característica do SAC é 
            que ele amortiza um percentual fixo do valor principal (emissão), 
            desde o início do financiamento. Esse percentual de amortização é 
            sempre o mesmo, o que faz com que a parcela de amortização da dívida 
            seja maior no início do financiamento, fazendo com que o saldo devedor 
            caia mais rapidamente do que em outros mecanismos de amortização.</p>
            </div>
            
            
            <form class="areaFormulario">
                <p class="textoFormulario">Saldo devedor:</p>
                <input class="entradaFormulario" type="text" name="SD"/><br/>
                <p class="textoFormulario">Taxa de juros (%):</p>
                <input class="entradaFormulario" type="text" name="TX"/><br/>
                <p class="textoFormulario">Tempo:</p>
               <input class="entradaFormulario" type="text" name="T"/><br/>
               <input class="calcular" type="submit" name="BC" value="Calcular"/>
            </form>
            <br/>
        
            <%if(request.getParameter("BC")!=null){
                //Declaração de variáveis
                NumberFormat formato = new DecimalFormat ("#,##0.00", new DecimalFormatSymbols (new Locale ("pt", "BR")));
                double SaldoDevedor = Double.parseDouble(request.getParameter("SD"));
                double TaxaJuros = (Double.parseDouble(request.getParameter("TX")))/100;
                double Tempo = Double.parseDouble(request.getParameter("T"));
                double Amortizacao=SaldoDevedor/Tempo;
                double TotalJ=0;
                double TotalP=0;
                
                %><table class="tabela">
                <tr>
                    <th>Tempo</th><th>Prestação</th><th>Juros</th>
                    <th>Amortização</th><th>Saldo Devedor</th>
                </tr>
                <%for(int i=0;i<=Tempo;i++){%>
                    <tr>
                        <%--Exibição do tempo.--%>
                        <td><%=i%></td>
                        <%--Exibição da prestação.--%>
                        <td>
                            <%if(i!=0){%>
                                <%TotalP+=Amortizacao+(SaldoDevedor*TaxaJuros);%>
                                <%="R$ "+formato.format(Amortizacao+(SaldoDevedor*TaxaJuros))%>
                            <%}%>
                        </td>
                        <%--Exibição do juros.--%>
                        <td>
                            <%if(i!=0){%>
                                <%TotalJ+=SaldoDevedor*TaxaJuros;%>
                                <%="R$ "+formato.format(SaldoDevedor*TaxaJuros)%>
                            <%}%>
                        </td>
                        <%--Exibição da amortização.--%>
                        <td>
                            <%if(i!=0){%>
                                <%="R$ "+formato.format(Amortizacao)%>
                            <%}%>
                        </td>
                        <%--Exibição do saldo devedor.--%>
                        <td>
                            <%if(i==0){%>
                                <%="R$ "+formato.format(SaldoDevedor)%>
                            <%}
                            else{%>
                                <%="R$ "+formato.format(SaldoDevedor-=Amortizacao)%>
                            <%}%>
                        </td>
                    </tr>   
                <%}%>
                <tr>
                    <%--Exibição dos resultados finais.--%>
                    <th>Total</th>
                    <td colspan="2"><%="Pago - R$ "+formato.format(TotalP)%></td>
                    <td colspan="2"><%="Juros pago - R$ "+formato.format(TotalJ)%></td>
                </tr>
            </table>
            <%}%>
        </div>
        <%@include file="WEB-INF/jspf/rodape.jspf"%>
    </body>
</html>
