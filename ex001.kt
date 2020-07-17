package exercicios

fun main() {
    println("$vermelho-----------------------------")
    println("\tCADASTRO ESTUDONAUTA")
    println("-----------------------------$reset")
    print("Nome do Funcionário: ")
    val nome = readLine()
    print("Ano de nacimento: ")
    val nsc = readLine()!!.toIntOrNull()?:0
    print("Salário: R$")
    val salario = readLine()!!.toIntOrNull()?:0

    println("")
    println("$amarelo----------FICHA FUNCIONAL___________")
    println("Nome: \t\t\t $nome")
    println("Nascimento: \t $nsc")
    println("Salário: \t\t R$${salario},00")
    println("------------------------------------$reset")
}