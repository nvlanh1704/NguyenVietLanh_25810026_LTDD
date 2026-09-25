//Nguyen Viet Lanh 25810026

fun datBan(
    tenKhach: String,
    soLuongKhach: Int,
    loaiBan: String = "Ban thuong"
) {
    println("$tenKhach - $soLuongKhach nguoi - $loaiBan")
}

fun main() {
    datBan("Tien", 4)

    datBan("Phu", 2, "Ban San Vuon")

    datBan(
        tenKhach = "My",
        soLuongKhach = 4,
        loaiBan = "Biet Thu"
    )
}
