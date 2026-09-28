// Nguyen Viet Lanh 25810026

open class DongVat(
    val ten: String
) {
    open fun keu(): String {
        return "Động vật đang kêu"
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gâu gâu"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {
    val danhSachDongVat = listOf(
        Cho("Vang"),
        Meo("Tieu Bach")
    )

    for (dongVat in danhSachDongVat) {
        println("Tên: ${dongVat.ten}")
        println("Tiếng kêu: ${dongVat.keu()}")
        println()
    }
}