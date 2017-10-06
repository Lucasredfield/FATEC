<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.teclafacil.bean.Record"%>
<%@page import="br.com.teclafacil.controler.RecordControler"%>

<%
    String cod = request.getParameter("ID");
    int rid = Integer.parseInt(cod);
    String rdata = request.getParameter("NOME");
    String rpontos = request.getParameter("LOGIN");
    int rjid = Integer.parseInt(cod);
    int ruid = Integer.parseInt(cod);

    Record rd = new Record(rid,rdata,rpontos,rjid,ruid);
    RecordControler rdCont = new RecordControler();
    rd = rdCont.alterarRecord(rd);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <a href="validaConsultarUsuario.jsp"></a>
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Confirmação de Alteração - Tecla Facil</title>
    </head>
    <body>
        <a href="../../index.jsp">INÍCIO</a> |
        <a href="../acesso/login.jsp">LOGIN</a> |
        <a href="consultarUsuario.jsp">BUSCA</a><br><br>
        <h1>Alteração Realizada!</h1>
    </body>
</html>