fun main() {
    println("Qual é o seu nome? ")
    val nome = readLine()!! // (!!) na ausência, gera uma exceção!
    println("Quantos anos você tem, $nome?")
    val idade:Int = readLine()!!.toIntOrNull()?:0 //Se o valor for nulo, ou diferente de Int, ele é convertido em Int ou Nulo e daí em 0
    print("Finalizando, $nome tem $idade anos de idade!")
}