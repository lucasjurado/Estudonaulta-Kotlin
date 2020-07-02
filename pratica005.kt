fun main() {
    println("> Byte")
    println("Máximo: "+ Byte.MAX_VALUE)
    println("Mínimo: "+ Byte.MIN_VALUE)
    println("Tamanho: "+ Byte.SIZE_BYTES + " bytes")
    println("> Short")
    println("Máximo: "+ Short.MAX_VALUE)
    println("Mínimo: "+ Short.MIN_VALUE)
    println("Tamanho: "+ Short.SIZE_BYTES + " bytes")
    println("> Int")
    println("Máximo: "+ Int.MAX_VALUE)
    println("Mínimo: "+ Int.MIN_VALUE)
    println("Tamanho: "+ Int.SIZE_BYTES + " bytes")
    println("> Long")
    println("Máximo: "+ Long.MAX_VALUE)
    println("Mínimo: "+ Long.MIN_VALUE)
    println("Tamanho: "+ Long.SIZE_BYTES + " bytes")
    println("----------------------------------")
    var x:Int = 10 // Declaração explicita
    var y = 20 // Declaração por inferência
    println(x is Int)
    println(y is Int)
    println("----------------------------------")
    var h:Any
    h = 10
    h = 12.5
    h = "kotlin"
    println("----------------------------------")
}