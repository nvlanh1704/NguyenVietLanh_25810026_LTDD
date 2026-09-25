// Nguyen Viet Lanh 25810026

fun main() {
    val tuoi = 20

    val loaiVe = if (tuoi < 13) {
        "Ve tre em"
    } else if (tuoi >= 60) {
        "Ve cao tuoi"
    } else {
        "Ve nguoi lon"
    }

    println(loaiVe)
}
