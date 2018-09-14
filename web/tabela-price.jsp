<%-- 
    Document   : tabela-price
    Created on : 01/09/2018, 00:24:53
    Author     : valre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabela Price</title>
        <link rel="stylesheet" type="text/css" href="CSS/styleOficial.css">


    </head>
    <body>

        <%@include file="WEB-INF/jspf/cabecalho.jspf"%>

        <div class="fundo">        
            <h1>Sistema Price de Amortização</h1>
            <br>
            <p class="texto">A Tabela PRICE é um sistema de amortização de dívidas, 
                também chamado de sistema francês de amortização. É conhecido por 
                ter as parcelas constantes – e não a amortização, como no caso do SAC. 
                É muito utilizado para calcular empréstimos de curto prazo 
                (compras parceladas em geral) e financiamentos de curto e médio 
                prazos (financiamentos de veículos, por exemplo).</p>

            <form>

                Empréstimo inicial (em R$):<br><input type="number" name="C"><br>
                Tempo (em meses):<br><input type="number" name="n"><br>
                Taxa de juros (% em meses):<br><input type="number" name="i"><br><br>
                <input type="submit" value="Calcular"></td>

            </form>


            <%  try {
                    double C = Double.parseDouble(request.getParameter("C"));
                    double i = Double.parseDouble(request.getParameter("i")) / 100;
                    int n = Integer.parseInt(request.getParameter("n"));
                    double PMT, juros;
                    double saldo = C;

                    if (C > 0.0 && n > 0 && i > 0.0) {  %>
            <table>
                <tr><th>Mês</th>
                    <th>Parcela</th>
                    <th>Amortização</th>
                    <th>Juros</th>
                    <th>Saldo Devedor</th>
                </tr>
                <% PMT = C / ((1 - Math.pow(1 + i, -n)) / i);%>

                <% for (int ct = 0; ct <= n; ct++) {%>

                <tr><th><%= ct%></th>
                    <td><% if (ct != 0) {%>
                        <%= String.format("%.2f", PMT)%>
                        <%}%>
                    </td>
                    <td><% if (ct != 0) {%>
                        <% juros = saldo * i;%>
                        <%= String.format("%.2f", PMT - juros)%>
                        <%}%>
                    </td>
                    <td><% if (ct != 0) {%>

                        <% juros = saldo * i;%>
                        <%= String.format("%.2f", juros)%>
                        <%}%>
                    </td>
                    <td><% if (ct == 0) {%>
                        <%= String.format("%.2f", saldo)%>
                        <%} else {%>
                        <% juros = saldo * i;%>
                        <% saldo -= (PMT - juros);%>
                        <%= String.format("%.2f", saldo)%>
                        <%}%>
                    </td>
                </tr>
                <%  }  %>
            </table>
            <%  } else {  %>
            <h3>Favor colocar valores maiores que zero.</h3>
            <%  }
                } catch (Exception ex) {  %>
            <h3>Favor colocar valores válidos.</h3>
            <%  }%>
        </div>   
        <%@include file="WEB-INF/jspf/rodape.jspf"%>
    </body>
</html>
