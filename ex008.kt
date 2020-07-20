package exercicios

import java.time.LocalDateTime

fun main() {
    println("$vermelho------------------------------------")
    println("\t SUA IDADE")
    println("------------------------------------$reset")
    println("Vou conseguir descobrir a sua idade...")
    print("Em que ano você nasceu? ")
    var ano = readLine()!!.toIntOrNull()?:0
    var atual = LocalDateTime.now()
    println("\n$amarelo------------RESULTADO------------")
    println("Atualmente estamos em ${atual.year}")
    println("Você, que nasceu em $ano,")
    println("completa $azul${atual.year - ano} anos$amarelo nesse ano.")
}