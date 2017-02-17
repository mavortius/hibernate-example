package hibernate.example

class BootStrap {

    def init = { servletContext ->
        new Product(name: 'Orange', price: 2.0d).save()
        new Product(name: 'Lemon', price: 1.98d).save()

        println "Initializing data..."
    }
    def destroy = {
    }
}
