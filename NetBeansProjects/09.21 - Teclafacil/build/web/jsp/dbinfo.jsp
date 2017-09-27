<!DOCTYPE html>
<html>
    <head>
        <title>Scripts para o Banco de Dados</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/stylesheet.css"/>

    </head>
    <body>
        <h1>Criando Banco de Dados:</h1>
        
        CREATE DATABASE teclafacil;

        <h1>Criando a tabela usu�rios</h1>
        
        <br>CREATE TABLE teclafacil.usuarios(
        <br>id BIGINT NOT NULL AUTO_INCREMENT,
        <br>nome VARCHAR(255),
        <br>login VARCHAR(255),
        <br>senha VARCHAR(255),
        <br>status VARCHAR(255),
        <br>tipo VARCHAR(255),
        <br>primary key (id));
        
        <h1>Informa��o da Conex�o</h1>
        
        <br>URL: "jdbc:mysql://localhost:3306/teclafacil"
        <br>USER: "root"
        <br>SENHA: ""
        
        <br><br>
        <a href="../index.jsp"><b>Voltar</b></a>
    </body>
    
</html>