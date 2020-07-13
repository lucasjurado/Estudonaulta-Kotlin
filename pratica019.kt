import java.time.LocalDateTime

fun main() {
    var dh = LocalDateTime.now()
    println("Dia atual: ${dh.dayOfMonth}")
    println("Mês atual: ${dh.monthValue}")
    println("Ano atual: ${dh.year}")
    println("----------------------")
    println("Hora atual: ${dh.hour}")
    println("Minuto atual: ${dh.minute}")
    println("Segundo atual: ${dh.second}")
}