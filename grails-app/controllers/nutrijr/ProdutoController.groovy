package nutrijr

class ProdutoController {

    static scaffold = true

    def imagem(long id) {
    	def produto = Produto.get(id)
    	if (produto?.imagem) {
    		response.outputStream << produto.imagem
    	}
    }

}
