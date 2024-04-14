package jolchu.tolik.ktorandroidchat.dataremote

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import jolchu.tolik.ktorandroidchat.dataremote.dto.MessageDto
import jolchu.tolik.ktorandroidchat.domainmodel.Message

class MessageServiceImpl(
    private val client: HttpClient
) : MessageService {

    override suspend fun getAllMessages(): List<Message> {
        return try {
            client.get<List<MessageDto>>(MessageService.Endpoints.GetAllMessages.url)
                .map { it.toMessage() }
        } catch (e: Exception) {
            emptyList()
        }
    }
}