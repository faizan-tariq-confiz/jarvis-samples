// Unit test code for Team entity
import com.cloud.services.entity.Team;
import com.cloud.services.entity.Player;
import org.junit.Test;
import java.util.Collections;
import static org.junit.Assert.assertEquals;

class TeamTest {

    @Test
    public void testGetId() {
        Team team = new Team(Collections.emptyList());
        team.setId(1L);
        assertEquals(1L, team.getId());
    }

    @Test
    public void testGetPlayers() {
        Player player = new Player();
        player.setName("John Doe");
        Team team = new Team(Collections.singletonList(player));
        assertEquals(1, team.getPlayers().size());
    }
}