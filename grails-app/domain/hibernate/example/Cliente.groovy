package hibernate.example

class Cliente {
    String nome
    String telefone
    Date dataNascimento

    static constraints = {
        nome blank: false
        telefone blank: false
        dataNascimento nullable: false
    }
}
