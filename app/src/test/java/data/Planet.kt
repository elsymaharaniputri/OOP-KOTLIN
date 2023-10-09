package data
//Enum class Planet untuk menampilkan ciri khusus planet
enum class Planet {
    MERKURIUS,
    VENUS,
    BUMI,
    MARS,
    Yupiter,
    Saturnus,
    Uranus,
    Neptunus
}

fun tampilkanInfoPlanet(planet: Planet) {
    when (planet) {
        Planet.MERKURIUS -> println("Paling dekat matahari")
        Planet.VENUS -> println("Planet paling panas di bumi")
        Planet.BUMI -> println("Satu-satunya planet yang diketahui memiliki kehidupan")
        Planet.MARS -> println("Planet Merah yang memiliki banyak persamaan dengan Bumi")
        Planet.Yupiter -> println("Planet paling besar tata surya")
        Planet.Saturnus -> println("Memiliki cincin yang terkenal, yang terdiri dari partikel es dan batuan.")
        Planet.Uranus -> println("Atmosfernya mengandung metana, memberikan warna biru-hijau")
        Planet.Neptunus -> println("Planet yang memiliki cuaca paling ekstrim dalam tata surya, termasuk badai besa")
    }

}
