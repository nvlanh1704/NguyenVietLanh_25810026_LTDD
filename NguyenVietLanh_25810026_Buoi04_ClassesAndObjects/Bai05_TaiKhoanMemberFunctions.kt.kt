// Nguyen Viet Lanh 25810026

class TaiKhoanNganHang(
    val soTaiKhoan: String,
    soDuBanDau: Double
) {
    var soDu: Double = soDuBanDau

    fun napTien(soTien: Double) {
        soDu += soTien
    }

    fun rutTien(soTien: Double): Boolean {
        if (soDu >= soTien) {
            soDu -= soTien
            return true
        }

        return false
    }
}

fun main() {
    val taiKhoan = TaiKhoanNganHang("Lanh", 1000000.0)

    println("Số dư ban đầu: ${taiKhoan.soDu}")

    taiKhoan.napTien(500000.0)
    println("Sau khi nạp 500000: ${taiKhoan.soDu}")

    val ketQua1 = taiKhoan.rutTien(300000.0)
    println("Rút 300000 thành công: $ketQua1")
    println("Số dư: ${taiKhoan.soDu}")

    val ketQua2 = taiKhoan.rutTien(2000000.0)
    println("Rút 2000000 thành công: $ketQua2")
    println("Số dư: ${taiKhoan.soDu}")
}