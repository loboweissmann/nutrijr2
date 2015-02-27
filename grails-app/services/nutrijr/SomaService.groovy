package nutrijr

import grails.transaction.Transactional

@Transactional
class SomaService {

    def soma(x, y) {
    	x + y
    }
}
