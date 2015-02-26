<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>
		
	</head>
	<body>
		<g:if test="${flash.message}">
			<div id="mensagem" style="padding:2.0em; background:red; color: white; font-weight: bold; font-size:3.0em;">${flash.message}</div>
		</g:if>
		<g:form action="autenticar" controller="autenticacao">
		Login: <input type="text" name="login"/><br/>
		Senha: <input type="text" name="senha"/><br/>
		<input type="submit" value="Entrar"/>
	</g:form>
	</body>
</html>
