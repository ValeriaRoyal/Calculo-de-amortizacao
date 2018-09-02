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
        
        <link href="style.css" rel="stylesheet">
    </head>
    <body>  
        
    <form>
        
        <br>Saldo devedor
        <input type="text" name="saldo_devedor">
        <br>Parcela
        <input type="text" name="parcela">
        <br>Juros
        <input type="text" name="juros">
        <br>
        <input type="submit" nome ="calculo" value="Calcular">
    </form> 
     
         <table>
            <tr>
              <th>Periodo <i>n</i></th>
              <th>Saldo Devedor <i>PV-A</i></th>
              <th>Juros <i>J</i></th>
              <th>Parcela <i>pmt</i></th>
              <th>Amortização <i>pmt - J</i></th>
            </tr>

        <%
            String saldo_devedor = request.getParameter("saldo_devedor"); 
            String parcela = request.getParameter("parcela"); 
            String juros = request.getParameter("juros");  

        %>             
        
                
        <%if( saldo_devedor !=null && parcela !=null && juros !=null ){
                
                double sal = Double.parseDouble(saldo_devedor);
                double par = Double.parseDouble(parcela);
                double ju = Double.parseDouble(juros);  
        %>   
        
                            
       <% for (int i = 0; i <= par; i++) { %>
               
        <tr>
            <th><%= i%></th><%--Periodo--%>
            <th><%= sal%></th><%--saldo devedor--%>
            <th><%= sal*ju/100 %></th><%--Juros--%>
            <th><%= (double)(sal*ju)/(1-Math.pow((1+ju),-i))%></th><%--Parcela--%>
            <th><%= i%></h><%--Amortizacao--%>
        </tr>   
        
            <%}%> 
        <%}%> 
        
         </table>    
    </body>
</html>
