package no.nav.security.mock.oauth2.logout

import java.net.URI

data class BackChannelLogout(
    private val sessionRequired: Boolean = false,
    private val logoutUri: URI? = null
) {
    fun isRequired() = sessionRequired
}
