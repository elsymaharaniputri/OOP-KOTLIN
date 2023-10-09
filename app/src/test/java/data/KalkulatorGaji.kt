package data
//Abstract KalkulatorGaji : Untuk memberikan gambaran kebutuhan data untuk hitung gaji
abstract class KalkulatorGaji () {
    abstract fun hitungGaji(karyawan: Karyawan ,pajak: Double): Double
}

//Singleton Object ipKalkultaorGaji : Untuk hitung gaji karyawan dengan melihat tunjangan dari jabatannya dan pajak
object ipKalkulatorGaji : KalkulatorGaji() {
    // Fungsi tunjangan untuk memasukan data tunjangan karyawan sesuai dengan jabatannya masing-masing
    fun tunjangan (karyawan: Karyawan): Double {
        return when (karyawan.job) {
            Jabatan.MANAGER -> 2000000.0
            Jabatan.PROGRAMMER -> 1000000.0
            Jabatan.ANALYS -> 1000000.0
            Jabatan.QA -> 500000.0
            Jabatan.DESAIGNER ->500000.0
        }
    }

    //Fungsi hitungGaji : Untuk hitung gaji karyawan
    override fun hitungGaji(karyawan: Karyawan ,pajak: Double): Double {
            val nilaiTunjangan = tunjangan(karyawan)
            val gajiBersih = karyawan.gaji + nilaiTunjangan
            val gajiSetelahPajak = gajiBersih * (1 - pajak)
            return gajiSetelahPajak

    }
}

