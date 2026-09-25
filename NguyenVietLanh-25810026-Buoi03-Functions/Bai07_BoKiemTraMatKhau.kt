//Nguyen Viet Lanh 25810026

fun main() {
    val kiemTraDoDai:(String)->Boolean={
        it.length>=8
    }
    println("946566: ${kiemTraDoDai("946566")}")
    println("ndfandfjnd: ${kiemTraDoDai("ndfandfjnd")}")
    println("161616161: ${kiemTraDoDai("161616161")}")
}