package hibernate.example

class BootStrap {

    def init = { servletContext ->
        println "Initializing data..."

        new Product(name: 'Orange', price: 2.0d).save()
        new Product(name: 'Lemon', price: 1.98d).save()

        new Cliente(nome: 'Marcelo Martins', telefone: '13981527227', dataNascimento: new Date()).save()
    }
    def destroy = {
    }
}
