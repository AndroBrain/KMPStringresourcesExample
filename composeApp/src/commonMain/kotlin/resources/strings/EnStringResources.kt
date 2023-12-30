package resources.strings

class EnStringResources : StringResources {
    override fun provideWelcome() = "Welcome to Example App"
    override fun provideHelloUser(name: String) = "Hello $name"
    override fun providePasswordLengthError(length: Int) = when (length) {
        0 -> "Password cannot be empty."
        1 -> "Your password has 1 character, it needs to have at least 8 characters."
        else -> "Your password has $length characters, it needs to have at least 8 characters."
    }

    override fun provideLogin() = "Login"
}
