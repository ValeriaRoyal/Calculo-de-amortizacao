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
        <title>Amortização Constante</title>
        <link href="style.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="fundoUp">
        <%@include file="WEB-INF/jspf/home.jspf"%>
        
        <h1 class="titulo">AMORTIZAÇÃO CONSTANTE</h1>
        <p class="texto">Aqui você pode calcular seu emprestimo usando
            o Sistema de Amortização Constante (SAC) que é uma forma de 
            amortização por prestações que incluem 
            os juros, amortizando assim partes iguais do valor total 
            do empréstimo.</p>
        <hr/>
        
        <form align='center'>
            Saldo devedor:<br/>
            <input type="text" name="SD"/><br/>
            Taxa de juros (%):<br/>
            <input type="text" name="TX"/><br/>
            Tempo:<br/>
            <input type="text" name="T"/><br/>
            <br/><input type="submit" name="BC" value="Calcular"/>
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
        <hr/>
        
        <p align='center'>Todos os direitos reservados.</p>
        </div>
    </body>
</html>
