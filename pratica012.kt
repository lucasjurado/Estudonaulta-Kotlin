fun main() {
    val n1:Int = 5
    val n2:Int = 2

    println("$n1 + $n2 = ${n1+n2}")
    println("$n1 + $n2 = ${n1.plus(n2)}")
    println("$n1 - $n2 = ${n1-n2}")
    println("$n1 - $n2 = ${n1.minus(n2)}")
    println("$n1 * $n2 = ${n1*n2}")
    println("$n1 * $n2 = ${n1.times(n2)}")
    println("$n1 / $n2 = ${n1.toFloat()/n2}") // Como a divisão é feita com Int/Int --> resulta em Int, a menos que faça a conversão
    println("$n1 / $n2 = ${n1.div(n2.toFloat())}")
    println("$n1 % $n2 = ${n1%n2}")
    println("$n1 % $n2 = ${n1.rem(n2)}")

}