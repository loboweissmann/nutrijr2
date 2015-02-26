package nutrijr

class ProdutoController {

    static scaffold = true

    def teste() {
    	def arquivo = params.getFile('imagem')
    	arquivo.transferTo("/caminho/pro/arquivo")
    }

    def imagem(long id) {
    	def produto = Produto.get(id)
    	if (produto?.imagem) {
    		response.outputStream << produto.imagem
    	}
    }

}
