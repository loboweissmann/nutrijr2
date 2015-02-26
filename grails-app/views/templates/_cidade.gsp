<div class="cidade">
	<div class="nome"><g:link action="show" controller="municipio" id="${cidade.id}">${cidade.nome}</g:link></div>
	<div class="estado">
		<g:link action="show" controller="UF" id="${cidade.estado.id}">${cidade.estado}</g:link>
	</div>
</div>