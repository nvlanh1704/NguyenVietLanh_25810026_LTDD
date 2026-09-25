//Nguyen Viet Lanh 25810026

fun dinhDangDiaChi(
    tenNguoiNhan: String,
    soDienThoai: String,
    soNha: String = "Chua ro",
    duong: String = "Chua ro",
    thanhPho: String = "Ha Noi"
) {
    println("$tenNguoiNhan - $soDienThoai - $soNha- $duong- $thanhPho")
}

fun main() {
    dinhDangDiaChi(
        tenNguoiNhan = "Nguyen Viet Lanh",
        soDienThoai = "0901234567",
        soNha = "12",
        duong = "Le Loi",
        thanhPho = "Ho Chi Minh"
    )
    dinhDangDiaChi(
        tenNguoiNhan = "Nguyen Tam",
        soDienThoai = "1234567",
        soNha = "1",
        duong = "Linh Chiểu",
        thanhPho = "Thu Duc"
    )
}
