<%-- 
    Document   : index
    Created on : 08 dez 2016, 22:24:07
    Author     : Manoel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring 3.0 MVC. Exemplo - Aluno</title>
        <style type="text/css">
            <%@include file="/css/stylesheet.css" %>
        </style>
    </head>
    <body>
        <div align="center"><br><br>
            <table class="tabelaRich500">
                <tr>
                    <td colspan="2" class="rowDarkGreen">
                        <label class="titulos">${message}</label>
                    </td>
                </tr>
                <tr><td><br></td><td><br></td></tr>
                <tr>
                    <td class="alignCenter">
                        <label class="titulosPretos">Principal</label>
                    </td>
                    <td class="alignCenter">
                        <label class="titulosPretos">Outros</label>
                    </td>
                </tr>
                <tr><td><br></td><td><br></td></tr>
                <tr>
                    <td class="alignCenter">
                        <a href="mostrarAlunos.html" class="hiperlink">Mostrar alunos.</a>
                    </td>
                    <td class="alignCenter">
                        <a href="index.html" class="hiperlink">Início.</a>
                    </td>
                </tr>
                <tr><td><br></td><td><br></td></tr>
                <tr>
                    <td class="alignCenter">
                        <a href="cadastrarAluno.html" class="hiperlink">Cadastrar aluno.</a>
                    </td>
                    <td class="alignCenter">
                        <a href="cliente.html" class="hiperlink">Página do cliente.</a>
                    </td>
                </tr>
                <tr><td><br></td><td><br></td></tr>
            </table>
        </div>
    </body>
</html>
