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
        Periodo
        <input type="text" name="periodo">
        <br>Saldo  devedor
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
          <th>Parcela <i>pmt</i></th>
          <th>Juros <i>J</i></th>
          <th>Amortização <i>pmt - J</i></th>
        </tr>

  <% 
        double saldo_devedor;
        double juros;
        double parcela;
        double periodo;
        double prestacao;
        
        double parc = ();
        double dev = saldo_devedor * juros;
        double = (prestacao - (juros/100));
        
  %>
  
  
        <%if((request.getParameter("saldo_devedor")!=null)){ %>      
            <%for(int i = 0; i<= periodo;i++){ %>      
                <td><%= i %></td> 
                <td><%= %></td>
                <td><%= %></td>
                <td><%= %></td>
                <td><%= %></td>
            <%}%>
        <%}%>
        
        </table>    
    </body>
</html>
