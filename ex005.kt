package exercicios

fun main() {
    println("$vermelho-------------------------------")
    println("\t REAJUSTE SALARIAL")
    println("-------------------------------$reset")
    print("Salário: R$")
    var salario = (readLine()!!.toFloatOrNull()?:0) as Float
    print("Reajuste (%): ")
    var reajuste = (readLine()!!.toFloatOrNull()?:0) as Float
    var res = salario * (1 + reajuste/100)
    println("\n$amarelo------------REAJUSTANDO------------")
    println("O salário anterior era de \t R$$salario")
    println("O aumento será de \t\t\t ${reajuste}%")
    println("E passará a ganhar \t\t\t R$$res")


}