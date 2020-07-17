package exercicios

fun main() {
    println("$vermelho-------------------------------")
    println("\t DOIS VALORES")
    println("-------------------------------$reset")
    print("Primeiro valor: ")
    val n1 = readLine()!!.toIntOrNull()?:0
    print("Segundo valor: ")
    val n2 = readLine()!!.toIntOrNull()?:0
    println("\n$azul----------RESULTADOS-----------")
    println("Soma: $amarelo\t\t\t $n1 + $n2 = $reset ${n1+n2}")
    println("Subtração: \t\t $n1 - $n2 = ${n1-n2}")
    println("Multiplicação: \t $n1 * $n2 = ${n1*n2}")
    println("Divisão: \t\t $n1 / $n2 = ${n1.toFloat()/n2}")
    println("Módulo: \t\t $n1 % $n2 = ${n1%n2}$reset")
}