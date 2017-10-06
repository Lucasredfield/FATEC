<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Consultar Jogos - Tecla Fácil</title>
    </head>    
    <body>
        <a href="../../index.jsp"> INÍCIO </a> |
        <a href="login.jsp"> LOGIN </a><br<br>
        <h1>Busca por Jogos</h1>
        <form name="consultarJogos" action="validaConsultarJogos.jsp" method="post">
            Game: <input type="text" name ="jogo" value="">
            <input type="submit" name ="Enviar" value="Buscar"><br>
        </form>
    </body>
</html>
