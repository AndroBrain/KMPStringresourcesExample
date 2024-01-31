package resources.strings

interface StringResources {
    val welcome: String
    fun provideHelloUser(name: String): String
    fun providePasswordLengthError(length: Int): String
    val login: String
}
