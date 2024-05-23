// Unit test code for TeamService
import com.cloud.services.entity.Team;
import com.cloud.services.repository.TeamRepository;
import com.cloud.services.service.TeamService;
import com.cloud.services.service.TeamServiceImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TeamServiceTest {

    @Test
    public void testGetTeam() {
        TeamRepository teamRepository = mock(TeamRepository.class);
        TeamService teamService = new TeamServiceImpl();
        ((TeamServiceImpl) teamService).setTeamRepository(teamRepository);
        Team team = new Team();
        when(teamRepository.findById(1L)).thenReturn(Optional.of(team));
        Team retrievedTeam = teamService.getTeam(1L);
        assertEquals(team, retrievedTeam);
    }
}