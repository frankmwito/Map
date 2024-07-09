import java.util.Scanner

fun main()  {
     val reader = Scanner(System.`in`)
    println("Enter any string")
    val string = reader.nextLine()
    val map = mutableMapOf<String,Int>()

    for (str in string){
        map[str.toString()] = map.getOrDefault(str.toString(), 0)+1

    }
    println("The frequency of each string is:")
    for ((key,value )in map){
        println("$key: $value")
    }
 }