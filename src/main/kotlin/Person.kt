class Person {
    val firstName: String = ""
    var familyName: String = ""

    fun fullName() = "$firstName $familyName"
    fun showName() {
        println(fullName())
    }
}