package exercicios

fun main() {
    println("$vermelho-------------------------------")
    println("\t  NOTAS ESTUDONAUTA")
    println("-------------------------------$reset")
    print("Primeira nota: ")
    val n1 = (readLine()!!.toFloatOrNull()?:0) as Float
    print("Segunda nota: ")
    val n2 = (readLine()!!.toFloatOrNull()?:0) as Float
    val res = (n1+n2)/2
    println("\n$amarelo------------RESULTADOS------------")
    println("As notas do aluno foram $n1 e $n2")
    println("A média final foi $res")
    println("------------------------------------$reset")
}

