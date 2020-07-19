import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
    var count = 0

    for (i in a..b) {
        if(i % n == 0)
            count += 1
    }
    println(count)
}