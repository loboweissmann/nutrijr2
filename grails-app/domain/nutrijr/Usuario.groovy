package nutrijr

class Usuario {

	String login
	String senha
	boolean ativo = true

    static constraints = {
    	login unique:true, nullable:false, blank:false, maxSize:32, minSize:4
    	senha nullable:false, blank:false, maxSize:32, minSize:8
    }
}
