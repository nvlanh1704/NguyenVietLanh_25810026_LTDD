// Nguyen Viet Lanh - 25810026
 
class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}
 
fun main() {
    val nv1 = NhanVien("NV01", "Lanh", 150000.0)
    val nv2 = NhanVien("NV02","Thinh", 120000.0)
 	val nv3 = NhanVien("Thu")
 
    println("nv1: ${nv1.ten} - luong: ${nv1.luongThang}")
    println("nv2: ${nv2.ten} - luong: ${nv2.luongThang}")
    println("nv3: ${nv3.ten} - luong: ${nv3.luongThang}")
}
 