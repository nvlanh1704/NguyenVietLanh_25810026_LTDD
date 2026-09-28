// Nguyen Viet Lanh 25810026

class KhachHang(
    var ho: String,
    var ten: String
) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val parts = value.trim().split(" ")

            ho = parts.first()
            ten = parts.drop(1).joinToString(" ")
        }
}

fun main() {
    val kh = KhachHang("Nguyen", "Lanh")

    println("Ho ten ban dau: ${kh.hoTen}")

    kh.ten = "Viet Lanh"

    println("Sau khi doi ten: ${kh.hoTen}")

    kh.hoTen = "Tran Van An"

    println("Ho sau khi gan hoTen: ${kh.ho}")
    println("Ten sau khi gan hoTen: ${kh.ten}")
    println("Ho ten moi: ${kh.hoTen}")
}