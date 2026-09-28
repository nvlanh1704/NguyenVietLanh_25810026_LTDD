// Nguyen Viet Lanh - 25810026
 
class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)
 
fun main() {
    val sp1 = SanPham("Mi Hao Hao", 3000.0, 10)
    val sp2 = SanPham(tenSanPham = "Mi Omachi", gia = 10000.0,5)
 
    println("San pham 1: ${sp1.tenSanPham} - Gia: ${sp1.gia} - Ton kho: ${sp1.soLuongTonKho}")
    println("San pham 2: ${sp2.tenSanPham} - Gia: ${sp2.gia} - Ton kho: ${sp2.soLuongTonKho}")
}
 