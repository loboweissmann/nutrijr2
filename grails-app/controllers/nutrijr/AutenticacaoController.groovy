package nutrijr

class AutenticacaoController {

    def autenticar(FormularioAutenticacao form) {
    	def usuario = Usuario.findByLoginAndSenha(form.login, form.senha)
    	if (usuario) {
    		session.usuario = usuario
    		redirect(controller:'municipio')
    	} else {
    		flash.message = "Não te conheço"
    		redirect(uri:'/')
    	}
    }
}
