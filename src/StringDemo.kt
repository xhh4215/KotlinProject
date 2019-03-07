//字符串模版的简单实用
fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else " Kotlin"
    println("Hello$name")
    // ${} 内部可以是表达式
    println("Hello, ${args[0]}!")

}