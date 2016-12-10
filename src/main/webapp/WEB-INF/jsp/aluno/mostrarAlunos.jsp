<%-- 
    Document   : mostrarAlunos
    Created on : 8 dez. 2016, 20:48:00
    Author     : Manoel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostra Alunos - DAO</title>
        <style type="text/css">
            <%@include file="/css/stylesheet.css" %>
        </style>
    </head>
    <body>
        <form:form method="POST" commandName="pesquisaAluno" action="buscarAluno.html">
	        <div align="center"><br>
	            <table class="tabelaRich750">
                 <tr>
                     <td colspan="3" style="text-align: center;" class="rowDarkGreen">
                         <label class="titulos">Pesquisa de Alunos</label>
                     </td>
                 </tr>
                 <tr><td>&nbsp;</td><td></td><td></td></tr>
                   <tr>
                       <td class="alignRight">
                           <form:label path="cpf" cssClass="labelsBold">CPF:</form:label>
                       </td>
                       <td class="alignLeft">
                           <form:input path="cpf" />
                           <input type="submit" value="Pesquisar"/>
                       </td>
                       <td style="text-align: left;"><form:errors path="cpf" cssClass="errorMessage" /></td>
                   </tr>
				<br>
                <tbody>
                    <tr class="rowDarkGreen">
                        <td style="text-align: center;" class="labelsBranco">CPF(click para atualizar)</td>
                        <td style="text-align: center;" class="labelsBranco">Nome</td>
                        <td style="text-align: center;" class="labelsBranco">Matrícula</td>
                        <td style="text-align: center;" class="labelsBranco">Ano Ingresso</td>
                        <td style="text-align: center;" class="labelsBranco">Excluir Aluno</td>
                    </tr>
            <c:if test="${!empty listaAlunos}">
                <c:forEach var="aluno" items="${listaAlunos}">
                    <tr>
                        <td style="vertical-align: top; text-align: center;">
                            <a href="atualizarAluno?cpf=${aluno.cpf}"  class="hiperlink">
                                <c:out value="${aluno.cpf}" />
                            </a>
                        </td>
                        <td class="alignLeft"><c:out value="${aluno.nome}" /></td>
                        <td class="alignCenter"><c:out value="${aluno.numeroMatricula}" /></td>
                        <td class="alignLeft"><c:out value="${aluno.anoIngresso}" /></td>
                        <td class="alignCenter">
                             <a href="excluirAluno?cpf=${aluno.cpf}" class="hiperlink">Exluir</a>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
            </tbody>
         </table>
        <label class="errorTitle">${message}</label>
        </div>
        </form:form>
         <br>
         <a href="index.html" class="hiperlink">Início</a><br>
         <a href="aluno.html" class="hiperlink">Página de Alunos</a><br>
         <a href="cadastrarAluno.html" class="hiperlink">Cadastrar Aluno</a>
    </body>
</html>
