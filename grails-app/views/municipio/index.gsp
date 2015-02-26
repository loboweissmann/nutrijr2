
<%@ page import="nutrijr.Municipio" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'municipio.label', default: 'Municipio')}" />
		<meta name="quemSou" value="Sou a pagina alvo"/>
		<asset:javascript src="jquery"/>
	</head>
	<body>
		<a href="#list-municipio" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-municipio" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>

			<g:formRemote url="[action:'busca']" update="resultado" name="formBusca">
				Nome: <input type="text" name="nome"/>
				<input type="submit" value="Buscar"/>
			</g:formRemote>
			<g:remoteLink action="testolina" update="resultado">Um teste com AJAX</g:remoteLink>

			<div id="resultado">

			</div>

			<%--
				
			--%>
		</div>
	</body>
</html>
