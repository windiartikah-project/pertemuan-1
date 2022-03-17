fun main(args: Array<String>) {
    val myName: String = "Nia Ardiati"
    for(chr in myName){
        print(chr)
    }
    //menggunakan operator +
    val s = "abc" + 1
    println(s + "def")

    //menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan raw String yang dipisahkan dengan triple quotes ("""
    var text = """ 
        for (c in "foo") 
            print(c) 
    """
    println(text)

    //juga dapat menggunakan string raw sebagai berikut
    var teks = """ 
            |Tell me and I forget. 
            |Teach me and I remember. 
            |Involve me and I learn. 
            |(Benjamin Franklin) 
            """.trimMargin()
    println(text)
    print('\n')
}