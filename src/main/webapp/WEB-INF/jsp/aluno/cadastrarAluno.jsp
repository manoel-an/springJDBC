<%-- 
    Document   : cadastroCliente
    Created on : 19 mai 2011, 17:04:14
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Formulário para cadastro de produto</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css">
            <%@include file="/css/stylesheet.css" %>
        </style>
    </head>
    <body>
        <form:form method="POST" commandName="aluno" action="alunoCadastrado.html">
            <div align="center"><br><br>
                <table class="tabelaRich750">
                    <tr>
                        <td colspan="3" style="text-align: center;" class="rowDarkGreen">
                            <label class="titulos">Formulário de Cadastro de Aluno</label>
                        </td>
                    </tr>
                    <tr><td>&nbsp;</td><td></td><td></td></tr>
                    <tr>
                        <td class="alignRight">
                            <form:label path="nome" cssClass="labelsBold">Nome:</form:label>
                        </td>
                        <td class="alignLeft">
                            <form:input path="nome" />
                        </td>
                        <td style="text-align: left;"><form:errors path="nome" cssClass="errorMessage" /></td>
                    </tr>
                    <tr>
                        <td class="alignRight">
                            <form:label path="numeroMatricula" cssClass="labelsBold">Número Matrícula:</form:label>
                        </td>
                        <td class="alignLeft">
                            <form:input path="numeroMatricula" />
                        </td>
                        <td style="text-align: left;"><form:errors path="numeroMatricula" cssClass="errorMessage" /></td>
                    </tr>
                    <tr>
                        <td class="alignRight">
                            <form:label path="anoIngresso" cssClass="labelsBold">Ano Ingresso:</form:label>
                        </td>
                        <td class="alignLeft">
                            <form:input path="anoIngresso" />
                        </td>
                        <td style="text-align: left;"><form:errors path="anoIngresso" cssClass="errorMessage" /></td>
                    </tr>
                    <tr>
                        <td class="alignRight">
                            <form:label path="cpf" cssClass="labelsBold">CPF:</form:label>
                        </td>
                        <td class="alignLeft">
                            <form:input path="cpf"/>
                        </td>
                        <td style="text-align: left;"><form:errors path="cpf" cssClass="errorMessage" /></td>
                    </tr>
                    <tr><td>&nbsp;</td><td></td><td></td></tr>
                    <tr>
                        <td colspan="3" class="alignCenter">
                            <input type="submit" value="Salvar"/>
                        </td>
                    </tr>
                </table>
            </div>
        </form:form>
        <br>
        <a href="index.html" class="hiperlink">Início.</a><br>
        <a href="produto.html" class="hiperlink">Página de produtos.</a><br>
        <a href="mostraProdutos.html" class="hiperlink">Mostrar todos produtos.</a>
    </body>
</html>