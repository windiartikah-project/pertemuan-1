//String Template
fun main(args: Array<String>) {
    val a = 10
    val b = 12
    val c = a + b
    val s = "When we add $a and $b, we get $c"
    println(s)
    println("When we add $a and $b, we get ${a + b}")
    val price = """ 
    ${'$'}9.98
    """
    println(price)
}