package one.digitalinnovation.collection

fun main() {
    val nomes = Array<String>(3) { "" }
    nomes[0] = "joao"
    nomes[1] = "maria"
    nomes[2] = "jose"

    for (valor in nomes) {
        println(valor)
    }
    println("-------------------------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    val nomes2 = arrayOf("joao", "maria", "jose")

    println("-------------------------------------")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}