<%@ page import="nutrijr.Municipio" %>



<div class="fieldcontain ${hasErrors(bean: municipioInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="municipio.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" maxlength="128" required="" value="${municipioInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: municipioInstance, field: 'estado', 'error')} required">
	<label for="estado">
		<g:message code="municipio.estado.label" default="Estado" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="estado" name="estado.id" from="${nutrijr.UF.list()}" optionKey="id" required="" value="${municipioInstance?.estado?.id}" class="many-to-one"/>

</div>

