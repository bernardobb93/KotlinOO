package one.digitalinnovation.digionebank

data class Banco(
    val nomeB:String,
    val numero:Int
){
    fun info()="$nomeB - $numero"
}
