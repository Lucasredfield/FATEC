<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.teclafacil.bean.Jogos"%>
<%@page import="br.com.teclafacil.controler.JogosControler"%>

<%
    String nome = request.getParameter("NOME");
    String dificuldade = request.getParameter("DIFICULDADE");
    Jogos jg = new Jogos(0,nome,dificuldade);
    JogosControler jgcont = new JogosControler();
    jg = jgcont.inserirJogos(jg);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Confirmação de Cadastro [JOGOS]</title>
    </head>
    
    <body>
        <a href="../../index.jsp">INÍCIO</a> |
        <a href="../acesso/login.jsp">LOGIN</a><br><br>
        <h1>O seguinte Jogo foi Cadastrado:</h1>
        <table border="0">   
             <tr>
                <td><b>JOGO:</b></td>
                <td> <%=jg.getJnome()%></td>
            </tr>
            <tr>
                <td><b>Dificuldade:</b></td>
                <td> <%=jg.getJdificuldade()%> </td>
            </tr>
        </table>
        <br><br>
    </body>
</html>
