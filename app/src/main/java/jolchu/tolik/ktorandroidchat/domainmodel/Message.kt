package jolchu.tolik.ktorandroidchat.domainmodel

data class Message(
    val text: String,
    val formattedTime: String,
    val username: String
)