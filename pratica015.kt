/**
 * Operadores de atribuição
 */
fun main() {
    var tv:Int = 4
    tv += 3

    println("Você tem $tv TVs em casa")

    var passagem:Float = 8.65f
    passagem += 0.25f

    println("A passagem do ônibus custa R$$passagem.")

    var x = 5
    x %= 2
    println(x)

    var y = 6
    y *= 2
    println(y)

    var h = 5
    h /= 2 // Neste caso o valor Int é dividido por outro Int, gerando Int, apesar do resultado ser um Float
    println(h)

    var z:Float = 5f
    z /= 2
    println(z)

}