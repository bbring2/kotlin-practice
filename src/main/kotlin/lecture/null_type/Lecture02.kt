package lecture.null_type

import java.lang.IllegalArgumentException

class Lecture02 {

}

fun main() {
}

//null이 들어올 수 있음을 명시
fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("Null")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A") //null이
}