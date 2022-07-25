package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String="Bernardo"
    var cpf: String="123.123.123-05"
    private set
}
fun main(){
    val Bernardo=Pessoa()
    println(Bernardo.nome)
    println(Bernardo.cpf)

}
