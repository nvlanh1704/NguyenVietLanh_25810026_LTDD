//Nguyen Viet Lanh 25810026

fun binhPhuongDayDu(so: Int): Int {
    return so * so
}
fun binhPhuongRutGon(so: Int): Int = so * so

fun chuViDayDu(canh: Int): Int {
    return canh * 4
}
fun chuViRutGon(canh: Int): Int = canh * 4

fun laSoChanDayDu(so: Int): Boolean {
    return so % 2 == 0
}
fun laSoChanRutGon(so: Int): Boolean = so % 2 == 0

fun main() {
    println(binhPhuongDayDu(7))
    println(binhPhuongRutGon(4))

    println(chuViDayDu(2))
    println(chuViRutGon(9))

    println(laSoChanDayDu(7))
    println(laSoChanRutGon(6))
}
