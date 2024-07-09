import java.util.Scanner

fun main() {
    println("Enter the size of the list:")
    val reader = Scanner(System.`in`)
    var value = 0

    val n = reader.nextInt()
    val list = mutableListOf<Int>()

    for (i in 0 until n){
        println("Enter the values of the list:")
        list.add(reader.nextInt())
    }

    val frequencyMap = mutableMapOf<Int, Int>()

    for (num in list){
        frequencyMap[num] = frequencyMap.getOrDefault(num,0)+1
    }

    println("Frequency of each integer in the list")
    for ((key, value) in frequencyMap){
        println("$key: $value")
    }
}