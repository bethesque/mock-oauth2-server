package no.nav.security.mock.oauth2.logout

data class FrontChannelLogout(
    val sessionRequired: Boolean = false,
    val logoutUri: String = "",
    val sid: String = "default",
    val sessionID: String = "default",
)
