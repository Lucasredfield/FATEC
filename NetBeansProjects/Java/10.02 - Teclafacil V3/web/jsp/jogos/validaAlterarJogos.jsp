<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.teclafacil.bean.Jogos"%>
<%@page import="br.com.teclafacil.controler.JogosControler"%>

<%
    String cod = request.getParameter("ID");
    int jid = Integer.parseInt(cod);
    String jnome = request.getParameter("NOME");
    String jdificuldade = request.getParameter("DIFICULDADE");

    Jogos jg = new Jogos(jid,jnome,jdificuldade);
    JogosControler jgCont = new JogosControler();
    jg = jgCont.alterarJogos(jg);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <a href="validaConsultarJogos.jsp"></a>
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Confirmação de Alteração - Tecla Facil</title>
    </head>
    <body>
        <a href="../../index.jsp">INÍCIO</a> |
        <a href="../acesso/login.jsp">LOGIN</a> |
        <a href="consultarJogos.jsp">BUSCA</a><br><br>
        <h1>Alteração Realizada!</h1>
    </body>
</html>