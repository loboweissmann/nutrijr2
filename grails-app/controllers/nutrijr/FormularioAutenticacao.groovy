package nutrijr

@grails.validation.Validateable
class FormularioAutenticacao {
	String login
	String senha

	static constraints = {
		login nullable:false, blank:false, minSize:4
		senha nullable:false, blank:false, minSize:4
	}
}