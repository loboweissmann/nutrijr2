package nutrijr

class ControleController {

	def index() {
		render "Sou index"
	}

	def adulta(int idade) {
		if (idade < 18) {
			redirect(uri:"http://www.disney.com")
		}
	}

    def oi(String nome) { 
    	if (nome == "Chato") {
    		redirect(action:'tchau')
    		return
    	} 
    	render "Oi ${nome}"
    	
    }

    def tchau() {
    	render "Tchau"
    }

    def pagina(String nome) {
    	render(view:'outra', model:[nome:nome, hora:new Date()])
    }

    def cidade(long id) {
    	def municipio = Municipio.get(id)
    	[cidade:municipio, ufs:UF.list()]
    }

    def cadastroCidade(Municipio municipio, UF uf) {
    	
    	render "${municipio} - ${uf}"
    }

    def auth() {

    }

    def entrar(FormularioAutenticacao form) {
    	if (form.validate()) {
    			render "Tudo ok!"
    		} else {
    			render form.errors
    		}
    }

}
