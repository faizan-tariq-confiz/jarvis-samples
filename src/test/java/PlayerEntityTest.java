import com.cloud.services.entity.Player;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PlayerEntityTest {

    @Test
    void testPlayerEntity() {
        Player player = new Player();
        player.setName("John Doe");

        assertThat(player.getName()).isEqualTo("John Doe");
    }
}
