package jolchu.tolik.ktorandroidchat.presentation.chat

import jolchu.tolik.ktorandroidchat.domainmodel.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)