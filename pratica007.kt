fun main() {
    println("MENU PRINCIPAL")
    println("[1] Novo")
    println("[2] Editar")
    println("-------------------")
    println("""
    MENU PRINCIPAL    
    [1] Novo
    [2] Editar
    """.trimIndent())
    println("-------------------")
    val ano = 2020
    val nasc = 1988
    println("Você nasceu em $nasc e hoje estamos em $ano. Então você tem ${ano-nasc} anos")
}