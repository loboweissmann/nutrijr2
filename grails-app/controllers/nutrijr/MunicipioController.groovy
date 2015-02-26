package nutrijr



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class MunicipioController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def testolina() {
    	render "Oi!"
    }

    def busca(String nome) {
    	def cidades = Municipio.findAllByNomeLike("%$nome%")
    	render(template:'resultado', model:[municipioInstanceList:cidades])
    }

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Municipio.list(params), model:[municipioInstanceCount: Municipio.count()]
    }

    def teste() {
    	def cs = Municipio.list()
    	render(contentType:"application/json") {
    		cidades {
    			for (c in cs) {
    				cidade(nome:c.nome) {
    					estado(c.estado.nome)
    				}
    			}
    		}
    	}
    }

    def show(Municipio municipioInstance) {
        respond municipioInstance
    }

    def create() {
        respond new Municipio(params)
    }

    @Transactional
    def save(Municipio municipioInstance) {
        if (municipioInstance == null) {
            notFound()
            return
        }

        if (municipioInstance.hasErrors()) {
            respond municipioInstance.errors, view:'create'
            return
        }

        municipioInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'municipio.label', default: 'Municipio'), municipioInstance.id])
                redirect municipioInstance
            }
            '*' { respond municipioInstance, [status: CREATED] }
        }
    }

    def edit(Municipio municipioInstance) {
        respond municipioInstance
    }

    @Transactional
    def update(Municipio municipioInstance) {
        if (municipioInstance == null) {
            notFound()
            return
        }

        if (municipioInstance.hasErrors()) {
            respond municipioInstance.errors, view:'edit'
            return
        }

        municipioInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Municipio.label', default: 'Municipio'), municipioInstance.id])
                redirect municipioInstance
            }
            '*'{ respond municipioInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Municipio municipioInstance) {

        if (municipioInstance == null) {
            notFound()
            return
        }

        municipioInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Municipio.label', default: 'Municipio'), municipioInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'municipio.label', default: 'Municipio'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
