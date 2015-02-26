<g:each in="${municipioInstanceList}" status="i" var="municipioInstance">
					<g:if test="${municipioInstance.estado.sigla == 'BA'}">
						<p>BAHIA</p>
					</g:if>
				   <nutrijr:cidade cidade="${municipioInstance}">
				   		<p>Estou na Nutricash</p>
				   </nutrijr:cidade>
				
				   <br/>
				</g:each>