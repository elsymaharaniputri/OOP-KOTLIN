package data
//Sealed class : kelas yang digunakan untuk mengelompokkan tipe data terkait dalam sebuah hierarki tertutup.
//jadi di dalam sealed class kumpulkan 2 class yang akan digunakan
//Objek dapat dibuat dari subclass yang ditentukan dalam sealed class, tetapi hanya dalam lingkup atau file yang sama.
sealed class Result {
     data class Success(val data:String) : Result()
     data class Failed(val data:String , val msg : String) : Result()
     object Empty : Result()
}

fun networkState (result : Result) : String =
    when (result){
        is Result.Success -> " Load ${result.data} success"
        is Result.Failed -> "Load ${result.data} failed , exception ${result.msg}"
        is Result.Empty -> "Data Empty"
    }


fun  main (){
    val resultTes = Result.Success("Response")
    println(networkState(resultTes))

}

