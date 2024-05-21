import com.cloud.services.entity.Player;
import com.cloud.services.service.PlayerService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PlayerServiceInterfaceTest {

    @Test
    void testPlayerServiceInterface() {
        PlayerService playerService = new PlayerService() {
            @Override
            public Iterable<Player> findAll() {
                return null;
            }
        };

        assertThat(playerService.findAll()).isNull();
    }
}
