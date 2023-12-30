import java.util.*

actual val language: String
    get() = Locale.getDefault().language
