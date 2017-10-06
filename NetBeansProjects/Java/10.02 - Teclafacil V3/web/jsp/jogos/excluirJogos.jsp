<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.teclafacil.bean.Jogos"%>
<%@page import="br.com.teclafacil.controler.JogosControler"%>

<%
    String cod = request.getParameter("COD");
    int id = Integer.parseInt(cod);
    Jogos jg = new Jogos(id,"","");
    JogosControler jgCont = new JogosControler();
    jg = jgCont.excluirJogos(jg);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Exclusão de Jogos</title>
    </head>
    <body>
        <a href="../../index.jsp">INÍCIO</a> |
        <a href="../acesso/login.jsp">LOGIN</a><br><br>
        <h1>Jogo Excluido! </h1>
    </body>
</html>
