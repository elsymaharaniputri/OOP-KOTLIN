import data.DatabaseKaryawan
import data.Jabatan
import data.Karyawan
import data.ipKalkulatorGaji
//Aplikasi Kalkulator Hitung Gaji Karyawan :
//Menampilkan data gaji bersih karyawan berdasarkan input nama,gaji,jabatan
//Menggunakan :
//data class Karyawan dan enum class Jabatan pada file data.Karyawan.kt
//singleton object DatabaseKaryawan pada file data.DatabaseKaryawan.kt
//abstract class KalkulatorGaji  dan ipKalkulatorGaji  pada file data.KalkulatorGaji.kt


fun main() {
    println("Hi! Anda sedang menggunakan Kalkulator Gaji")

    //inisialisasi object dengan isikan data nama-id-jabatan-gaji
    val karyawan1 = Karyawan("Akbar",1, Jabatan.MANAGER  ,6000000.0 )
    val karyawan2 = Karyawan("Saffa",2, Jabatan.ANALYS, 4000000.0)
    val karyawan3 = Karyawan("Elsy",3, Jabatan.PROGRAMMER ,5000000.0)

    //memasukan data object karyawan 1-3 ke DatabaseKaryawan
    DatabaseKaryawan.addKaryawan(karyawan1)
    DatabaseKaryawan.addKaryawan(karyawan2)
    DatabaseKaryawan.addKaryawan(karyawan3)

    //variable karyawan yang menyimpan id dari karyawan yang ingin dihitung gajinya
    val karyawan = DatabaseKaryawan.getKaryawanById(id = 2)

    //jika id karyawan ditemukan maka dihitung gajinya dengan mengirimkan nama karyawan dan variable pajak
    if (karyawan != null) {
        val kalkulator = ipKalkulatorGaji
        val pajak: Double = 0.10
        val gajiTotal = kalkulator.hitungGaji(karyawan1,pajak)

        println("== Detail Laporan Gaji == ")
        println("Nama               : ${karyawan.nama}")
        println("Jabatan            : ${karyawan.job}")
        println("Gaji Pokok         : ${karyawan.gaji}")
        println("Tunjangan          : ${ipKalkulatorGaji.tunjangan(karyawan)}")
        println("Gaji Setelah Pajak : $gajiTotal")
    } else {
        println("Data karyawan ini tidak ditemukan.")
    }
}
