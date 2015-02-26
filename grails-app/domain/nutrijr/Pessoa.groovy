package nutrijr

class Pessoa {

	String nome
	String observacoes

	static belongsTo = [municipio:Municipio]

	static mapping = {
		tablePerHierarchy true
	}

    static constraints = {
    	nome nullable:true, blank:true, maxSize:128
    	observacoes nullable:true, blank:true, maxSize:4096
    	municipio nullable:true
    }
}
