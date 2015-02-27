package nutrijr

import grails.test.mixin.TestMixin
import grails.test.mixin.TestFor
import grails.test.mixin.Mock
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
@TestFor(ControleController)
@Mock([Municipio, UF])
class ControleControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "uma action que apenas renderiza algo com render"() {
    	when:
    		controller.index()
    	then:
    		response.text == "Sou index"
    }

    void "uma action que manda para fora de acordo com a idade do usuário"() {
    	when:
    		controller.adulta(17)
    	then:
    		response.redirectedUrl == "http://www.disney.com"
    }

    void "uma action que redireciona para index com a idade do usuário"() {
    	when:
    		controller.adulta(21)
    	then:
    		response.redirectedUrl == "/controle/index"
    }

    void "uma action que te livra dos chatos"() {
    	when:
    		controller.oi("Chato")
    	then:
    		response.redirectedUrl == "/controle/tchau"
    }

    void "uma action que não te acha um chato"() {
    	when:
    		controller.oi("Henrique")
    	then:
    		response.text == "Oi Henrique"
    }

    void "validando um command object"() {
    	when:
    		controller.entrar(new FormularioAutenticacao(login:"administrador", senha:"quentecomolava"))
    	then:
    		response.text == "Tudo ok!"
    }

    void "testando um model e uma view"() {
    	when:
    		controller.pagina("Henrique")
    	then:
    		model.nome == "Henrique"
    		model.hora != null
    		model.hora instanceof Date
    		view == "/controle/outra"
    }

    void "testando uma saída em JSON"() {
    	when:
    		controller.retornoJSON()
    	then:
    		response.json.nome == "Henrique"
    		response.json.cidade == "Belo Horizonte"
    }

    void "testando uma saída em XML"() {
    	when:
    		controller.retornoXML()
    	then:
    		response.xml.@nome == "Henrique"
    		response.xml.@cidade == "Belo Horizonte"
    }


}
