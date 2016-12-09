<%-- 
    Document   : Atualizar Aluno
    Created on : 8 dez. 2016, 22:42:52
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualização de Aluno</title>
        <style type="text/css">
            <%@include file="/css/stylesheet.css" %>
        </style>
    </head>
    <body>
        <form:form method="POST" commandName="aluno" action="alunoAtualizado.html">
            <div align="center"><br><br>
                <table class="tabelaRich750">
                    <tr>
                        <td colspan="3" style="text-align: center;" class="rowDarkGreen">
                            <label class="titulos">Formulário para atualização de aluno</label>
                        </td>
                    </tr>
                    <tr><td>&nbsp;</td><td></td><td></td></tr>
                    <tr>
                        <td class="alignRight">
                            <form:label path="cpf" cssClass="labelsBold">CPF:</form:label>
                        </td>
                        <td class="alignLeft">
                            <form:input path="cpf" readonly="true"/>
                        </td>
                        <td style="text-align: left;"><form:errors path="cpf" cssClass="errorMessage" /></td>
                    </tr>                    
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
                            <form:label path="numeroMatricula" cssClass="labelsBold">Matrícula:</form:label>
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
        <a href="aluno.html" class="hiperlink">Página de alunos.</a><br>
        <a href="mostrarAlunos.html" class="hiperlink">Mostrar todos os alunos.</a>
    </body>
</html>
