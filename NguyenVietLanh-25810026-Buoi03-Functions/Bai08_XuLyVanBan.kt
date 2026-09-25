//Nguyen Viet Lanh 25810026

fun xuLyVanBan(chuoi: String, xuLy: (String) -> String): String {
    return xuLy(chuoi)
}

fun vietHoaChu(s: String): String {
    return s.uppercase()
}

fun main() {
    val ketQua1 = xuLyVanBan("xin chao", { it.reversed() })
    println(ketQua1)

    val ketQua2 = xuLyVanBan("xin chao", ::vietHoaChu)
    println(ketQua2)

    val ketQua3 = xuLyVanBan("xin chao") { it.trim() }
    println(ketQua3)
}