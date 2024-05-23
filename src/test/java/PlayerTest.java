// Unit test code for Player entity
import com.cloud.services.entity.Player;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

class PlayerTest {

    @Test
    public void testGetId() {
        Player player = new Player();
        player.setId(1L);
        assertEquals(1L, player.getId());
    }

    @Test
    public void testGetName() {
        Player player = new Player();
        player.setName("John Doe");
        assertEquals("John Doe", player.getName());
    }
}