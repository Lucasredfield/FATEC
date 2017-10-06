<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.teclafacil.bean.Jogos"%>
<%@page import="br.com.teclafacil.controler.JogosControler"%>
<%@page import="br.com.teclafacil.bean.Usuario"%>
<%@page import="br.com.teclafacil.controler.JogosControler"%>

<%
    String jogo = request.getParameter("jogo");
    Jogos jg = new Jogos(0,jogo,"");
    JogosControler jgcont = new JogosControler();
    List<Jogos> jgs = jgcont.listarJogos(jg);
    Usuario usuLogado = (Usuario) session.getAttribute("JogosLogado");
%>

<html>
    <head>
    <title>Consulta Jogos - Tecla Fácil</title>
    <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
    </head>
    
    <body>
        <a href="../../index.jsp"> INÍCIO </a> |
        <a href="../acesso/login.jsp"> LOGIN </a> |
        <a href="consultarJogos.jsp"> BUSCAR </a><br<br>
        <h2>Lista de Jogos - Tecla Fácil</h2>
        
        Obs: É necessário estar logado como uma conta de tipo "adm" para poder Excluir e Alterar <br><br>
       
        <table border="1" cellpadding="10" class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Id</th>
                  <th data-field="Nome">Nome</th>
                  <th data-field="Login">Login</th>
                  <th data-field="Senha">Senha</th>
                  <th data-field="Nasc">Data de Nascimento</th>
                  <th data-field="Tipo">Tipo</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(jgs.isEmpty())) { %>    
                <tbody>
                    <% for (Jogos listaJogos : jgs) { %>
                        <tr>
                            <td><%=listaJogos.getJid()%></td>
                            <td><%=listaJogos.getJnome()%></td>
                            <td><%=listaJogos.getJdificuldade()%></td>

                            <% if (usuLogado.getUtipo().equals("adm")) { %>
                                <td><a href="excluirJogos.jsp?COD=<%=listaJogos.getJid()%>">[Excluir]</a></td>
                                <td><a href="alterarJogos.jsp?COD=<%=listaJogos.getJid()%>">[Alterar]</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
            
    </body>
</html>