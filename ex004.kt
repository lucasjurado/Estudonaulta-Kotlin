package exercicios

import kotlin.math.*

fun main() {
    println("$vermelho-------------------------------")
    println("\t CÁLCULO DE POTÊNCIA")
    println("-------------------------------$reset")
    print("Base: ")
    val base = (readLine()!!.toFloatOrNull()?:0) as Float
    print("Expoente: ")
    val exp = readLine()!!.toIntOrNull()?:0
    val res = base.pow(exp)
    println("\n$amarelo------------RESULTADOS------------")
    println("Calculando $base elevado a $exp")
    println("O resultado é ${res}")
    println("------------------------------------$reset")
}