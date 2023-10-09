package app
import data.Animal
fun main (){
    val kucing = Animal("Jijimeow" , 3.1)
    kucing.makan("Jijimeow" , "daging" ,2)
    kucing.makan ("JijiMeow" , "daging")

    println("")

    val kelinci = Animal("KelinciMbull" , 2)
    kelinci.makan("KelinciMbull" , "sayur dan buah" ,2)
    kelinci.makan ("KelinciMbull" , "sayur dan buah")

}