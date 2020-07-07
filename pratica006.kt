import java.lang.NullPointerException

/**
 * Nulo em Kotlin
 */
fun main() {
    var nome:String? //(?) Safe Call
    nome = null
    println("Seu nome é: "+nome)

    var a:Int?
    var b:Int
    a = null
    b = a?:0 //(?:) Elvis Operator -> b recebe a, se a for == null então b recebe 0
    println("A vale: "+a)
    println("B vale: "+b)

    var x:Int? = 5
    var c:Int = 0
    x = null
    try {
        c = x!! //(!!) Null Checks Operator --> gera uma exceção
    } catch (e: NullPointerException){
        println("Deu problema, mas estou resolvendo...")
        c=99
    } finally {
        println("X vale: "+ x)
        println("C vale: "+ c)
    }
}