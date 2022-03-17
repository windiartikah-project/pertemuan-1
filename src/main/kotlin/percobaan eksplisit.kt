//Konversi Eksplisit
fun main(args: Array<String>) {
    val valInt: Int = 2
    val valSum: Long = 4L + valInt //konversi implisit
    println("Konversi variabel valInt secara implisit : " + valSum)
    val valLong: Long = valInt.toLong() // konversi eksplisit
    println("Konversi variabel valInt secara eksplisit : " + valLong)
}