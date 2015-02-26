package nutrijr

class PessoaJuridica extends Pessoa {

	String cnpj

	static mapping = {
		tablePerHierarchy false
	}

    static constraints = {
    	cnpj nullable:false, blank:false, maxSize:32, unique:true
    }
}
