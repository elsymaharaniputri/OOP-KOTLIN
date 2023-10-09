package app

import data.AbsenKelas

fun main(){
    val absenKelas = AbsenKelas()

    absenKelas.isiAbsen("Siswa 1")
    absenKelas.isiAbsen("Siswa 2")

    absenKelas.tampilkanAbsen()
}