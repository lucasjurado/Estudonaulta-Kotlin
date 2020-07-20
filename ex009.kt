package exercicios

import java.time.LocalDateTime
import kotlin.math.ceil

fun main() {
    println("$vermelho------------------------------------")
    println("\t ANALISANDO O MÊS ATUAL")
    println("------------------------------------$reset")
    var data = LocalDateTime.now()
    println("Estamos no mês $azul${data.monthValue} de ${data.year}$reset")
    println("Esse mês está no $azul${(ceil((data.monthValue/6).toFloat()).toInt())}º Semestre$reset")
    println("E está no $azul${(ceil((data.monthValue/4).toFloat()).toInt())}º Trimestre")
}