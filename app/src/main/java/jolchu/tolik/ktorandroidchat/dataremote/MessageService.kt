package jolchu.tolik.ktorandroidchat.dataremote

import jolchu.tolik.ktorandroidchat.domainmodel.Message

interface MessageService {

    suspend fun getAllMessages(): List<Message>

    companion object {
        const val BASE_URL = "http://192.168.0.2:8082"
    }

    sealed class Endpoints(val url: String) {
        data object GetAllMessages: Endpoints("$BASE_URL/messages")
    }

}