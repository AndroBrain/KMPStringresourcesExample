import platform.Foundation.*

actual val language: String
    get() = NSLocale.currentLocale.languageCode
