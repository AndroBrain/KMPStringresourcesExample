package resources.strings

import language

private const val PL_LANG = "pl"

object StringFactory {
    fun createStrings(language: String): StringResources = when (language) {
        PL_LANG -> PlStringResources()
        else -> EnStringResources()
    }
}
