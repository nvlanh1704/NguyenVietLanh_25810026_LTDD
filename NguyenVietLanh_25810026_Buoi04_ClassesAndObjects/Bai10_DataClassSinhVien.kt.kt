// Nguyen Viet Lanh 25810026

data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val diemTrungBinh: Double
)

fun main() {
    val sv1 = SinhVien(
        "25810026",
        "Nguyen Viet Lanh",
        8.0
    )

    val sv2 = SinhVien(
        "25810026",
        "Nguyen Viet Lanh",
        8.0
    )

    println("Sinh viên 1:")
    println(sv1)

    println()

    println("So sánh sv1 và sv2: ${sv1 == sv2}")

    val sv3 = sv1.copy(
        diemTrungBinh = 9.0
    )

    println()

    println("Sinh viên tạo từ copy():")
    println(sv3)
}