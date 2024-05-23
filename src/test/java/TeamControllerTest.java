// Unit test code for TeamController
import com.cloud.services.controller.TeamController;
import com.cloud.services.entity.Team;
import com.cloud.services.service.TeamService;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TeamControllerTest {

    @Test
    public void testCreateTeam() {
        TeamService teamService = mock(TeamService.class);
        TeamController teamController = new TeamController();
        teamController.setTeamService(teamService);
        Team team = new Team();
        when(teamService.createTeam(team)).thenReturn(team);
        ResponseEntity responseEntity = teamController.create(team);
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
    }
}