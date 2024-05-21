import com.cloud.services.entity.Player;
import com.cloud.services.service.PlayerService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@SpringBootTest
public class PlayerServiceTest {

    @Mock
    private PlayerService playerService;

    @InjectMocks
    private PlayerService playerServiceMock;

    @Test
    public void testFindAllPlayers() {
        List<Player> players = new ArrayList<>();
        players.add(new Player(1, "John Doe", 25));
        players.add(new Player(2, "Jane Smith", 28));
        when(playerService.findAll()).thenReturn(players);
        List<Player> foundPlayers = playerServiceMock.findAll();
        assertEquals(2, foundPlayers.size());
        assertEquals("John Doe", foundPlayers.get(0).getName());
        assertEquals(25, foundPlayers.get(0).getAge());
        assertEquals("Jane Smith", foundPlayers.get(1).getName());
        assertEquals(28, foundPlayers.get(1).getAge());
    }
}