import com.cloud.services.entity.Player;
import com.cloud.services.repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class PlayerRepositoryTest {

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    void testSaveAndFindPlayer() {
        Player player = new Player();
        player.setName("John Doe");
        playerRepository.save(player);

        Iterable<Player> players = playerRepository.findAll();
        assertThat(players).isNotEmpty();
    }
}
