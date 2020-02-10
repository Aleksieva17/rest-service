

import static org.assertj.core.api.Assertions.assertThat;

import crypto.Cesar;
import org.junit.jupiter.api.Test;

class CesarTest {

    @Test
    void encode() {
        assertThat(Cesar.encode("Hello, World", 5)).isEqualTo("Mjqqt, Btwqi");
    }


    @Test
    void decode() {
        assertThat(Cesar.decode("def", 3)).isEqualTo("abc");
    }
}