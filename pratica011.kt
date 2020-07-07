fun main() {
    print("Digite em valor: ")
    val n1:Int = readLine()!!.toIntOrNull()?:0
    print("Digite outro valor: ")
    val n2:Float = readLine()!!.toFloatOrNull()?:0F
    val s:Float = n1 + n2
    println("A soma entre $n1 e $n2 é igual a $s.")
}