import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val num = scanner.nextInt()
    val n = scanner.nextInt()
    var result = "YES"
    for (i in 1 until num) {
        if (scanner.nextInt() < n) {
            result = "NO"
            break
        }
    }
    println(result)
}