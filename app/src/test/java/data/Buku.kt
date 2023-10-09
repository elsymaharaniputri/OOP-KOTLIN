package data
//DATA CLASS
data class Buku (val judul : String , val penerbit : String, val tebal : Int){
    //Fungsi untuk menampilkan informasi buku
    fun informasiBuku() {
        println("Judul: $judul")
        println("Penerbit: $penerbit")
        println("Tebal: $tebal halaman")
    }

    // Fungsi untuk menghitung jumlah kata per halaman
    fun hitungKataPerHalaman(jumlahKata: Int): Any {
        return if (tebal > 0) {
            val jml :Double
            jml= jumlahKata.toDouble() / tebal
            println("Jumlah kata perhalaman : $jml")
        } else {
            0.0
        }
    }

}