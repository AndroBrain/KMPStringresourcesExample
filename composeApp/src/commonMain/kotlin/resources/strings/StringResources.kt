package resources.strings

interface StringResources {
    fun provideWelcome(): String
    fun provideHelloUser(name: String): String
    fun providePasswordLengthError(length: Int): String
    fun provideLogin(): String
}
