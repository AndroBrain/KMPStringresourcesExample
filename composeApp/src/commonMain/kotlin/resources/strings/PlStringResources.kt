package resources.strings

class PlStringResources : StringResources {
    override fun provideWelcome() = "Witaj w przykładowej aplikacji"
    override fun provideHelloUser(name: String) = "Cześć $name"
    override fun providePasswordLengthError(length: Int) = when (length) {
        0 -> "Hasło nie może być puste."
        1 -> "Twoje hasło składa się z 1 znaku. Hasło musi miec co najmniej 8 znaków."
        else -> "Twoje hasło składa się z $length znaków. Hasło musi miec co najmniej 8 znaków."
    }

    override fun provideLogin() = "Zaloguj się"
}
