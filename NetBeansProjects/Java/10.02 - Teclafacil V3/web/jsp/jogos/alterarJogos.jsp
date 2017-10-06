<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.teclafacil.bean.Jogos"%>
<%@page import="br.com.teclafacil.controler.JogosControler"%>

<%
    String cod = request.getParameter("COD");
    int id = Integer.parseInt(cod);
    Jogos jg = new Jogos(id,"","","");
    JogosControler jgCont = new JogosControler();
    jg = jgCont.buscarJogos(jg);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Alterar Jogos - Tecla Fácil</title>
    </head>
    
    <body>
        <form name="alterarJogos" action="validaAlterarJogos.jsp" method="post">
            <h1>Formulário de Alteração</h1>
                
            <table border="0">
            <tr>
                <td><b>Nome:</b></td>
                <td><input type="text" name="NOME" value="<%=jg.getJnome()%>"></td>
            </tr>
            <tr>
                <td><b>Dificuldade:</b></td>
                <td> <input type="text" name="DIFICULDADE" value="<%=jg.getJdificuldade()%>"> </td>
            </tr>
            <tr>
                <td> <input type="HIDDEN" name="ID" value="<%=jg.getJid()%>"></td>    
                <td><input type="submit" name="Enviar" value="ALTERAR"></td>
            </tr>
        </table>
            <a href="../../index.jsp"><b>Voltar</b></a>
        </form>
    </body>
</html>