// Unit test code for PlayerService
import com.cloud.services.entity.Player;
import com.cloud.services.repository.PlayerRepository;
import com.cloud.services.service.PlayerService;
import com.cloud.services.service.PlayerServiceImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PlayerServiceTest {

    @Test
    public void testFindAll() {
        PlayerRepository playerRepository = mock(PlayerRepository.class);
        PlayerService playerService = new PlayerServiceImpl();
        ((PlayerServiceImpl) playerService).setPlayerRepository(playerRepository);
        when(playerRepository.findAll()).thenReturn(Collections.emptyList());
        Iterable<Player> players = playerService.findAll();
        assertEquals(0, ((List<Player>) players).size());
    }
}