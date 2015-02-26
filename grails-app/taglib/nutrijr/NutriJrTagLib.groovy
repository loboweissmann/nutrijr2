package nutrijr

class NutriJrTagLib {
    static defaultEncodeAs = [taglib:'raw']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    static namespace = "nutrijr"

 	def cidade = {atributos, corpo ->
 		def cidade = atributos.cidade
 		out << g.render(template:'/templates/cidade', model:[cidade:cidade])
 		if (cidade?.estado?.sigla == 'BA') {
 			out << corpo()
 		}
 	}

}
