// Unit test code for PlayerRepository
import com.cloud.services.entity.Player;
import com.cloud.services.repository.PlayerRepository;
import org.junit.Test;
import org.springframework.data.repository.CrudRepository;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PlayerRepositoryTest {

    @Test
    public void testFindAll() {
        PlayerRepository playerRepository = mock(PlayerRepository.class);
        Player player = new Player();
        when(playerRepository.findAll()).thenReturn(Collections.singletonList(player));
        Iterable<Player> players = playerRepository.findAll();
        assertEquals(1, ((List<Player>) players).size());
    }
}