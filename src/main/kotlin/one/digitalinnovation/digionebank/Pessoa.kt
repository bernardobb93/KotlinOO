package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String="Bernardo"
    var cpf: String="123.123.123-05"
    private set
    constructor()
    fun pessoaInfo()="$nome e $cpf"
}
fun main(){
    val Bernardo=Pessoa()
    println(Bernardo.pessoaInfo())

}
