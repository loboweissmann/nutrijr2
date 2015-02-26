<!DOCTYPE html>
<html>
	<head>

	</head>
	<body>
	  ${cidade.nome} - ${cidade.estado}

	  <g:form action="cadastroCidade">
	  <%--
	  	  Nome: <g:textField name="nome"/><br/>
	  	  Estado: <g:select optionKey="id" name="estado.id" from="${ufs}"/>
	  	 --%>
	  	 Id: <input type="text" name="id"/><br/>
	  	 Nome: <g:textField name="nome"/><br/>
	  	  <input type="submit" value="Enviar"/>
	  </g:form>


	</body>
</html>