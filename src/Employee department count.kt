import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("Enter the size of the map:")
    val n = reader.nextInt()
    val employeeMap = mutableMapOf<String, String>()

    println("Enter the Employee name and department:")
    for (i in 0 until n) {
        val name = reader.next()
        val department = reader.next()
        employeeMap[name] = department
    }

    val departmentCountMap = countEmployeesPerDepartment(employeeMap)

    println("Number of employees in each department:")
    for ((department, count) in departmentCountMap) {
        println("$department: $count")
    }
}

fun countEmployeesPerDepartment(employeeMap: Map<String, String>): Map<String, Int> {
    val departmentCountMap = mutableMapOf<String, Int>()

    for ((_, department) in employeeMap) {
        departmentCountMap[department] = departmentCountMap.getOrDefault(department, 0) + 1
    }

    return departmentCountMap
}
