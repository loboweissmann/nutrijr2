import nutrijr.*

class BootStrap {

    def init = { servletContext ->
    	[
    		[sigla:'BA', nome:'Bahia'], 
    		[sigla:'MG', nome:'Minas Gerais'],
    		[sigla:'SP', nome:'São Paulo'],
    		[sigla:'AM', nome:'Amazonas']
    	].each {
    		UF.findOrSaveBySiglaAndNome(it.sigla, it.nome)
    	}

    	[
    		[estado:'MG', nome:'Belo Horizonte'],
    		[estado:'BA', nome:'Salvador'],
    		[estado:'SP', nome:'São Paulo'],
    		[estado:'AM', nome:'Manaus'],
    		[estado:'MG', nome:'Montes Claros'],
    		[estado:'MG', nome:'Sete Lagoas']
    	].each {
    		def estado = UF.findBySigla(it.estado)
    		Municipio.findOrSaveByEstadoAndNome(estado, it.nome)
    	}

    	Usuario.findOrSaveByLoginAndSenha("administrador", "administrador")

    }
    def destroy = {
    }
}
