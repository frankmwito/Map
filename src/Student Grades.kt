import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("Enter the size of the map:")
    val n = reader.nextInt()
    val studentMap = mutableMapOf<String, Int>()

    for (i in 0 until n){
        println("Enter the names of the students with their grades:")
        studentMap.put(reader.next(), reader.nextInt())
    }
    val totalGrades = studentMap.values.sum()
    println("${totalGrades.toDouble()}")
}