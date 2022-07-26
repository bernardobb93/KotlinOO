package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista


fun main() {
    val carol= Analista(nome = "Carolina", cpf = "123.456.789-99", 2000.00)
    ImprimeRelatorioFuncionario.imprime(carol)

}
