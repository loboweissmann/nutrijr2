package nutrijr

class Usuario {
    
	String id
	String login
	String senha
    String hashSenha
	boolean ativo = true
	Date dateCreated

    static transients = ['senha']

    void setSenha(String valor) {
        this.hashSenha = senha.encodeAsMD5()
    }

    static constraints = {
    	login unique:true, nullable:false, blank:false, maxSize:32, minSize:4
    	senha nullable:false, blank:false, maxSize:32, minSize:8
    }

    static mapping = {
    	id generator:'uuid', column:'identificador'	
    	version false
    	table 'NUTRICASH_USUARIO'
    	login column:'username', index:'IDX_USERNAME'
    	dateCreated updatable:false
    }

}
