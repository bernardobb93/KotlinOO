package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val bianca=Cliente(
        nome="Bianca",
        cpf="123.564.454-55",
        clienteTipo = ClienteTipo.PF,
        senha = "senha123456"
    )
    println(bianca)
    TesteAutenticacao().autentica(bianca)
}