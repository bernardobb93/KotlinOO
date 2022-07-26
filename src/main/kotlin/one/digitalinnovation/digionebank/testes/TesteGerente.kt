package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val bernardo= Gerente(nome = "Bernardo", cpf = "123.456.789-99", 4000.00)
    ImprimeRelatorioFuncionario.imprime(bernardo)

}
