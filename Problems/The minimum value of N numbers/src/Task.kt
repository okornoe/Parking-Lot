import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val num = scanner.nextInt()
    val numbers = scanner.nextLine().split(" ").subList(0,num)
        println(numbers.min())
}