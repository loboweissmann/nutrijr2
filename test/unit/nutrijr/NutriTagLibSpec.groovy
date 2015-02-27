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
@TestFor(NutriJrTagLib)
@Mock([Municipio, UF])
class NutriTagLibSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "testando uma tag que gera um texto simples"() {
    	expect:
    		"Texto simples" == tagLib.textoSimples().toString()
    }


    void "aplicando templates!"() {
    	
    }

}
