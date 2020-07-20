package exercicios

import kotlin.math.*

fun main() {
    println("$vermelho------------------------------------")
    println("\t JOGO ADIVINHAÇÃO")
    println("------------------------------------$reset")
    println("Vou \"pensar\" em um número entre 0 e 10")
    print("Seu palpite: ")
    var num = readLine()!!.toIntOrNull()?:0
    var ran = (0..10).random()
    println("\n$amarelo------------RESULTADO------------")
    println("Você disse que seria o número $num")
    println("Eu pensei no número $ran")
    println("A diferença foi de ${abs(num-ran)}")
    println("---------------------------------$reset")
}