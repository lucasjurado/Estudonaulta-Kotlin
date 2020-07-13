/**
 * Operadores de incremento e decremento
 * a++ (pós incremento)  ++a (pré incremento)
 */
fun main() {
    var n:Int = 7
    n++

    println("A variável tem o valor de $n")

    var m:Int = 7
    m = m + 1

    println("A variável tem o valor de $m")

    var p:Int = 7
    p = p.inc()

    println("A variável tem o valor de $p")

    //Pós x Pré incremento/decremento

    var x = 3
    var y = 4
    var z = 5

    var res = x++ + --y + ++z

    println("Os valores são: $x, $y e $z")
    println("O resultado de res é: $res")
}