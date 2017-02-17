package hibernate.example


import grails.rest.*
import grails.converters.*

class ClienteController extends RestfulController {
    static responseFormats = ['json', 'xml']

    ClienteController() {
        super(Cliente)
    }

    def pesquisa(String n, Integer max) {
        if(n) {
            def query = Cliente.where {
                nome ==~ "%${n}%"
            }
            respond query.list(max: Math.min(max ?: 10, 100))
        } else {
            respond([])
        }
    }
}
