package hibernate.example

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        "/products"(resources:"product") {
            collection {
                '/search'(controller:'product', action:'search')
            }
        }

        "/clientes"(resources: "cliente") {
            collection {
                '/pesquisa'(controller:'cliente', action: 'pesquisa')
            }
        }

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
