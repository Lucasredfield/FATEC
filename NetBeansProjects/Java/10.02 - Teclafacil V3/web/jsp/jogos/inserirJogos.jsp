
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Inserir Jogos - Tecla Fácil</title>
    </head>
    
    <body>
         <a href="../../index.jsp">INÍCIO</a> |
         <a href="../acesso/login.jsp">LOGIN</a><br><br>
        
        <form name="inserirUsuario" action="validaInserirJogos.jsp" method="post">

            <table border="0">
            Formulário de Cadastro JOGOS <br><br>
            <tr>
                <td><b>JOGO:</b></td>
                <td><input type="text" name="NOME" value=""></td>
            </tr>
            <tr>
                <td><b>DIFICULDADE:</b></td>
                <td> <select name ="DIFICULDADE">
                     <option value="facil">Fácil</option>
                     <option value="normal">Normal</option>
                     <option value="intermediario">Intermediário</option>
                     <option value="dificil">Dificil</option>
                     <option value="avancado">Avançado</option>
                     <option value="expert">Expert</option>
                     <option value="lendario">Lendário</option>                     
                    </select> </td>
            </tr>
            <tr>
                    <input type="HIDDEN" name="ID" value=""></td>    
                <td><input type="submit" name="Enviar" value="CADASTRAR"></td>
            </tr>
        </table>
            <br><br>
           OBS: Entre como ADM para redefinir/alterar.
        </form>
    </body>
</html>
