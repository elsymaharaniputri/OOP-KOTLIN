package data
//Enum class jabatan : Untuk menyimpan jabatan karyawan yang akan dhitung gajinya
enum class Jabatan {
    MANAGER,
    PROGRAMMER,
    DESAIGNER,
    ANALYS,
    QA
}
//Data class Karyawan : Untuk menyimpan data-data karyawan
data class Karyawan (val nama : String , val id : Int , val job : Jabatan , val gaji :Double)
