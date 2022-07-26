package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val carol= Analista(nome = "Carolina", cpf = "123.456.789-99", 2000.00)
    imprimeRelatorio(carol)

}
fun imprimeRelatorio(funcionario: Funcionario)=println(funcionario.toString())