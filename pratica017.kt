/**
 * Operadores lógicos
 */
fun main() {
    var v1 = 5
    var v2 = 8
    var v3 = 3
    var v4 = 2

    var res1 = (v1<v2) && (v2 == v3 + v1)
    var res2 = !(v3>v4) || (v3+v4 != v1)
    var res3 = !(v4>v1)

    println("O resultado da expressão 1 é [$res1]")
    println("O resultado da expressão 2 é [$res2]")
    println("O resultado da expressão 3 é [$res3]")
}