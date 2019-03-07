/***
 * 这是一个学习Kotlin中的函数的文件
 **/
fun main(args: Array<String>) {
    println("最大的数值是" + max(12, 45))
}

/***
 * 一个返回最大值的函数
 * 表达式：表达式是有数值的 并能作为另一个表达式的一部分使用
 * 语句：语句总是包围着他的代码块中的顶层元素，并且没有自己的数值
 */
//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}
/***
 * 函数体是一个表达式可以用来接受表达式的数值
 */
//fun max(a: Int, b: Int): Int = if (a > b) a else b
/***
 * 返回值的数据类型是可以自动判断的
 */
fun max(a: Int, b: Int) = if (a > b) a else b