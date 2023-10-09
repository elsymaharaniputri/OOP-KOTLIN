package data
// Sigleton Object DatabaseKaryawan : Untuk menambahkan karyawan dan mencaribyID agar bisa dihitung gajinya.
object DatabaseKaryawan {
    private  val database = mutableListOf<Karyawan>()
    //mutablelist adalah bentuk collection list yang bisa diubah untuk menambahkan dan mencari data karyawan berdasarkan id nya
    fun addKaryawan (karyawan: Karyawan){
        database.add(karyawan)
    }
    fun getKaryawanById(id: Int): Karyawan? {
        return database.find { it.id == id }
    }

}