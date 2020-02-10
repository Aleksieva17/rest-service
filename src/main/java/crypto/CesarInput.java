package crypto;

import lombok.Data;

@Data
public class CesarInput {

    private String text;
    private int offset;
}