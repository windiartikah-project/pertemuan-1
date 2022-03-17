fun main(args: Array<String>) {
    //Character di Kotlin adalah sebagai objek yang memiliki fungsi anggota seperti isLowerCase(), isDigit(),toUpperCase(), toLowerCase(), toString() dan lainnya.
    var charA : Char = 'A'
    //println(charA == 65)
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = "+strA)
}