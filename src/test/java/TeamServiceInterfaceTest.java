import com.cloud.services.entity.Team;
import com.cloud.services.service.TeamService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TeamServiceInterfaceTest {

    @Test
    void testTeamServiceInterface() {
        TeamService teamService = new TeamService() {
            @Override
            public Team getTeam(Long id) {
                return null;
            }

            @Override
            public Team createTeam(Team teamRequestDTO) {
                return null;
            }
        };

        assertThat(teamService.getTeam(1L)).isNull();
        assertThat(teamService.createTeam(new Team())).isNull();
    }
}
