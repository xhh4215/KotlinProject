// 声明一个字符串的变量
val question = "The Ultimate Question  of life the Universe And Everyting"
// 变量的数据类型是可以自动识别
val answer = 42
/***
 * val 是一个不可变的引用，使用val声明的变量在初始化之后不能在赋值
 * var 是一个可变的引用，这种变量的数值是可以改变的，这种变量对应于普通变量
 */
fun main(args: Array<String>) {
    /***
     * val变量引用的自身是不可变的，但是他指向的对象可能是改变的
     */
    val language = arrayListOf("java")
    language.add("Kotlin")
}



