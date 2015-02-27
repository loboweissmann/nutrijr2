package nutrijr

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(SomaService)
class SomaServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test soma"() {
    	expect:
    		resultado == service.soma(a, b)
    	where:
	    	a   |   b    | resultado
	    	1   |   2    |   3
	    	12  |  21    |  33
	    	'A' |  'B'   |  'AB'
    }
}
