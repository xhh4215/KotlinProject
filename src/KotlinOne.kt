data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    // listOf 创建一个集合包含2个人的集合
    val person = listOf(Person("Alice"), Person("Bob", age = 29))
    // 通过maxBy获取最大的年龄
    val oldest = person.maxBy { it.age ?: 0 }
    println("The Oldest is $oldest")
}