package nutrijr

class AcessoFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
            	if (! controllerName) {
            		return true
            	}
            	if (controllerName == "assets") {
            		return true
            	}
            	if (actionName == "autenticar") {
            		return true
            	}
            	if (! session.usuario) {
            		redirect(uri:'/')
            	} else {
            		return true
            	}
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
