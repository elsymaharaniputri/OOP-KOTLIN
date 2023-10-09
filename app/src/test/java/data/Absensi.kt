//ABSTRAK CLASS
package data
    // Fungsi abstrak untuk mengisi absen
    abstract class Absen {
        abstract fun isiAbsen(nama: String):Unit
        abstract fun tampilkanAbsen()
        protected val daftarSiswa = mutableListOf<String>()
    }

    class AbsenKelas : Absen()  {
        // Daftar nama siswa yang akan diabsen

        // Implementasi fungsi isiAbsen
         override fun isiAbsen(nama: String) {
            daftarSiswa.add(nama)
            println("$nama sudah diabsen.")
        }
        // Fungsi untuk menampilkan absen
       override fun tampilkanAbsen() {
            println("Daftar Siswa yang Sudah Diabsen:")
            for (siswa in daftarSiswa) {
                println(siswa)
            }
        }
    }

