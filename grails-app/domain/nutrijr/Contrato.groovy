package nutrijr

class Contrato {

	String codigo
	Date data
	double valorMensal

	static belongsTo = [
		produto:Produto,
		cliente:Pessoa
	]

    static constraints = {
    }
}
