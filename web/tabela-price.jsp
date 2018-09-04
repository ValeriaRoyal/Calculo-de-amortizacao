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
        
        <link href="CSS/style.css" rel="stylesheet">
    </head>
    <body>
        <%@include file="WEB-INF/jspf/home.jspf"%>
        
        <h1 align='center'>Sistema Price de Amortização</h1>
            <p align="center">Tabela Price, também chamado de sistema francês de amortização 
                          é um método usado em amortização de empréstimo cuja principal
                          característica é apresentar prestações (ou parcelas) iguais. </p>
        <hr/>
    <form>
        Empréstimo inicial (em R$):<br><input type="text" name="C"><br>
        Tempo (em meses):<br><input type="text" name="n"><br>
        Taxa de juros (% em meses):<br><input type="text" name="i"><br>
        
        <input type="submit" nome ="calculo" value="Calcular">
    </form> 
      
    <%  try {   
                // pegando os valores do formulario e convertendo.
                double C = Double.parseDouble(request.getParameter("C"));
                double i = Double.parseDouble(request.getParameter("i")) / 100; // Taxa de juros convertida em porcentagem
                int n = Integer.parseInt(request.getParameter("n"));
                double PMT, juros, saldo = C; //Prestação, juros, saldo = Capital
                
                // tratamento de erro
                if (C > 0.0 && n > 0 && i > 0.0){  %>
                <table>
                     <tr><th>Mês</th><th>Saldo Devedor</th><th>Amortização</th><th>Juros</th><th>Parcela</th></tr>
                        <%  PMT = C / ((1 - Math.pow(1 + i, -n)) / i);
                        for (int ct = 1; ct <= n; ct++){
                            juros = saldo * i;
                            saldo -= (PMT - juros); %>
                    <%-- Aplicando filtro de valores --%>
                    <tr><th><%= ct %></th><td><%= String.format("%.2f", saldo) %></td><td><%= String.format("%.2f", PMT - juros) %></td><td><%= String.format("%.2f", juros) %></td><td><%= String.format("%.2f", PMT) %></td></tr>
                        <%  }  %>
                </table>
                    <%  } else {  %>
                        <h3>Favor colocar valores maiores que zero.</h3>
                    <%  }
    } catch (Exception ex){  %>
        <h3>Favor colocar valores válidos.</h3>
<%  }  %>
           
    </body>
</html>
