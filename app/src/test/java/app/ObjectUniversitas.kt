package app
import data.Universitas
fun main (){
    val kampus = Universitas()
    val matkul = kampus.Matkul("F34", "PBO")
    val dosen = matkul.Dosen("Ms Elsy")
    dosen.mengajar()
}
