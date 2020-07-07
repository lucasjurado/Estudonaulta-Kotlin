fun main() {
    println("Qual é o seu nome? ")
    val nome = readLine()!! // (!!) na ausência, gera uma exceção!
    println("Quantos anos você tem, $nome?")
    val idade:Int = readLine()!!.toInt() // Devemos transformar o input de String em Int
    print("Finalizando, $nome tem $idade anos de idade!")

}