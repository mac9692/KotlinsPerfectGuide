import java.util.Date

fun main() {
    val name = readLine()
    println("Hello ${name}\n Today is ${Date()}")

    val message = """
        박진성
        한줄 띄고
        두줄 띄고 ${Date()  }
    """.trimIndent()
    println(message)

    println(message.length)
    println(message.lastIndex)
}
