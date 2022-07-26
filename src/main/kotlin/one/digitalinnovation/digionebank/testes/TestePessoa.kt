package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val bernardo= Pessoa(nome = "Bernardo", cpf = "123.123.123-00")
    println(bernardo.nome)
    println(bernardo.cpf)
    val carol= Funcionario(nome = "Carolina", cpf = "123.456.789-99", BigDecimal.valueOf(2000.00))
    println(carol.nome)
    println(carol.cpf)
    println(carol.salario)

}
