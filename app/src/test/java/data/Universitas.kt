package data
//INNER DAN NESTED CLASS
class Universitas {
    inner class Matkul(val kode: String, val namaMatkul: String) {
        inner  class Dosen(val name: String) {
            fun mengajar() {
                println("$name mengajar mata kuliah $namaMatkul di Labor E-57")
            }
        }
    }
}

