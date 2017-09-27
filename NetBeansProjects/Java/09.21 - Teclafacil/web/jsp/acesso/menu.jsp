<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="br.com.teclafacil.bean.Usuario"%>
<%@page import="br.com.teclafacil.controler.UsuarioControler"%>

<%
    String login = request.getParameter("login");
    String senha = request.getParameter("senha");
    
    Usuario usu = new Usuario(0,"",login,senha,"","");
    UsuarioControler usucont = new UsuarioControler();
    
    usu = usucont.validaUsuario(usu);
    session.setAttribute("UsuarioLogado",usu);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Menu - Tecla Fácil </title>
    </head>
    <body>
        <a href="../../index.jsp"> INÍCIO </a> |
        <a href="login.jsp"> LOGIN </a>
        <br><br>
        MENU <br> 
        <br>Gerenciamento de Usuarios:
        <a href="../usuario/consultarUsuario.jsp"> CONSULTAR (Alterar e Excluir) </a> |
        <a href="../usuario/inserirUsuario.jsp"> CADASTRAR </a>
   
        <br><br>
         <% if (!usu.getUtipo().equals("adm") && !usu.getUtipo().equals("comum")) { %>
         <a href="../usuario/inserirUsuario.jsp">LOGADO COMO CONVIDADO (CONTA INEXISTENTE)<br><br>
         CRIAR NOVA CONTA </a>
        <% } %>
        
        <table border="3">
            <h2>Usuário Atual</h2>
            <tr>
                <td><b>ID:</b></td>
                <td> <%=usu.getUid()%> </td>
            </tr>    
             <tr>
                <td><b>Nome:</b></td>
                <td> <%=usu.getUnome()%></td>
            </tr>
            <tr>
                <td><b>Usuário:</b></td>
                <td> <%=usu.getUlogin()%> </td>
            </tr>
            <tr>
                <td><b>Senha:</b></td>
                <td> <%=usu.getUsenha()%></td>
            </tr>
            <tr>
                <td><b>Data de Nascimento:</b></td>
                <td> <%=usu.getUnasc()%></td>
            </tr>
            <tr>
                <td><b>Tipo:</b></td>
                <td> <%=usu.getUtipo()%></td>
            </tr>
        </table>
        
    </body>
</html>