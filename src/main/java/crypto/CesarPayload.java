package crypto;

import lombok.Data;

@Data
public class CesarPayload {

    private final long id;
    private final String content;
    private final String encryptedContent;

    public CesarPayload(long id, String content, String encryptedContent) {
        this.id = id;
        this.content = content;
        this.encryptedContent = encryptedContent;
    }
}