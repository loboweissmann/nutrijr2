package nutrijr

import grails.test.spock.IntegrationSpec

class SomaServiceIntegrationSpec extends IntegrationSpec {

    def setup() {
    }

    def cleanup() {
    }

    def somaService

    void "como testar uma injeção"() {
    	expect:
    		resultado == somaService.soma(a, b)
    	where:
	    	a   |   b    | resultado
	    	1   |   2    |   3
	    	12  |  21    |  33
	    	'A' |  'B'   |  'AB'
    }
}
