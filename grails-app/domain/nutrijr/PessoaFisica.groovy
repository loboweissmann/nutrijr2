package nutrijr

class PessoaFisica extends Pessoa {

	String cpf
	String rg
	String sobrenome

	static mapping = {
		tablePerHierarchy false
	}

    static constraints = {
    	cpf nullable:false, blank:false, maxSize:32, unique:true
    	rg nullable:false, blank:false, maxSize:32, unique:true
    	sobrenome nullable:false, blank:false, maxSize:255
    }
}
