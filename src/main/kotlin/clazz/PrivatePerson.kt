package clazz

/**

@author parkjinseong

@version 1.0

@since 2026. 1. 20.

 */
class PrivatePerson private constructor(private val firstName: String = "John", var familyName: String = "") {

    constructor(familyName: String = "Doe") : this("", familyName) {}
    fun showName() {
        println("$firstName $familyName")
    }
}