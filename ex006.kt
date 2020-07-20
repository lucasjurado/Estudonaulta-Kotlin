package exercicios

fun main() {
    println("$vermelho------------------------------------")
    println("\t BANCO ESTUDONAUTA")
    println("------------------------------------$reset")
    print("Qual valor você deseja sacar? R$")
    var valor = readLine()!!.toIntOrNull()?:0
    var cinq = valor/50
    var dez = (valor - cinq*50)/10
    var dois = (valor - cinq*50 - dez*10)/2
    var um = valor - cinq*50 - dez*10 - dois*2
    println("\n$amarelo------------SAQUE REALIZADO------------")
    println("R$50,00 \t= $cinq cédula(s)")
    println("R$10,00 \t= $dez cédula(s)")
    println("R$2,00 \t\t= $dois cédula(s)")
    println("R$1,00 \t\t= $um moeda(s)")
}