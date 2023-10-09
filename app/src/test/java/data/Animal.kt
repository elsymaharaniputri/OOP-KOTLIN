//Class yang saya buat dengan referensi video materi ini mengimplementasikan :
//- class properties
//- primary constructor
//- secondary constructor
//- properties constructor
//- initializer block
//- function in class dengan parameter
//- function overloading dengan paramter dan nilai balik

package data
class Animal (
    pnama:String ,
    pberat: Double ,
    pumur: Int ,
    pmakananFav:String,
    var pIsSehat : Boolean ,
    var pIsKarnivora: Boolean){

    //properties class
    var karnivoraTes : String = "tidak diketahui"

    //initializer block
    init {
        println(" == Ini Aplikasi Dengan Kode Sederhana Untuk Pengenalan Hewan ==")
        println("Hai, aku $pnama !")
        if (pberat > 3) {
            pIsSehat = true
            println("Aku binatang sehat")
        }
        else {
            pIsSehat = false
            println("Aku sedang sakit !")
        }
    }

    //secondary constructor
    constructor(pnama: String , pberat: Double ):this(pnama,pberat,0,"tidak diketahui",pIsSehat=false,false){
        println("$pnama memiliki berat $pberat , Apakah aku binatang sehat ? $pIsSehat")
    }
    constructor(pnama: String,pumur: Int):this(pnama, pberat = 0.0){
        println("Hallo! aku $pnama , umurku $pumur ")
    }

    //function
    fun makan(pnama: String , pmakananFav: String){
        println("$pnama sedang makan $pmakananFav... Jangan diganggu!")
    }

    //function overloading dan keyword this
    fun makan (pnama: String,pmakananFav: String, pumur: Int): String{
        if(pmakananFav=="daging"){
            this.pIsKarnivora = true
            karnivoraTes = println("Hingga umur $pumur tahun $pnama  masih suka makan $pmakananFav ... ! , Apakah aku karnivora ? $pIsKarnivora").toString()
        }
        else if (pmakananFav == "buah dan sayur"){
            this.pIsKarnivora = false
            karnivoraTes = println("Aku herbivora").toString()
        }
        return karnivoraTes

    }

}