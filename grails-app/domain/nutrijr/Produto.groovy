package nutrijr

class Produto {
	
	String nome
	String descricao
	byte[] imagem

    static constraints = {
    	nome nullable:false, blank:false, maxSize:128
    	descricao nullable:true, blank:true, maxSize:4096
    	imagem maxSize:260000
    }
}
