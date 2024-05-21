import com.cloud.services.entity.Player;
import com.cloud.services.entity.Team;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class TeamEntityTest {

    @Test
    void testTeamEntity() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("John Doe"));
        Team team = new Team(players);

        assertThat(team.getPlayers()).isEqualTo(players);
    }
}
