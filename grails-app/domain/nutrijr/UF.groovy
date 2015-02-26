package nutrijr

class UF {

	String sigla
	String nome

	//static hasMany = [cidades:Municipio]

	String toString() {
		"${this.sigla} - ${this.nome}"
	}

	    static constraints = {
    	sigla unique:true, blank:false, maxSize:2, minSize:2, nullable:false
    	nome unique:true, blank:false, maxSize:32, minSize:4, nullable:false
    }
}
