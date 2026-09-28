// Nguyen Viet Lanh - 25810026

class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan $soTaiKhoan thanh cong, so du ban dau: $soDuBanDau")
        }
    }
}

fun main() {
    val tk1 = TaiKhoanNganHang("001", 500000.0)
    val tk2 = TaiKhoanNganHang("002", -100.0)
}