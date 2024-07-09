import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter any string:")
    val string = reader.nextLine()
    val map = mutableMapOf<String, Int>()

    // Split the string into words and convert to lowercase
    val words = string.split("\\s+".toRegex()).map { it.lowercase() }

    // Count the occurrences of each word
    for (word in words) {
        map[word] = map.getOrDefault(word, 0) + 1
    }

    // Print the frequency of each word
    println("Frequency of each word:")
    for ((key, value) in map) {
        println("$key: $value")
    }
}
