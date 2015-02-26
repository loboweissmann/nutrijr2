package nutrijr

class Municipio {

	String nome

	static belongsTo = [
		estado:UF
	]

	String toString() {
		this.nome + " - " + this.estado
	}

    static constraints = {
    	nome nullable:false, blank:false, maxSize:128
    	estado nullable:false, unique:['nome']
    }
}
