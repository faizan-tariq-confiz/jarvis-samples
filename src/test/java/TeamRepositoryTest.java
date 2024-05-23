// Unit test code for TeamRepository
import com.cloud.services.entity.Team;
import com.cloud.services.repository.TeamRepository;
import org.junit.Test;
import org.springframework.data.repository.CrudRepository;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TeamRepositoryTest {

    @Test
    public void testFindAll() {
        TeamRepository teamRepository = mock(TeamRepository.class);
        Team team = new Team();
        when(teamRepository.findAll()).thenReturn(Collections.singletonList(team));
        Iterable<Team> teams = teamRepository.findAll();
        assertEquals(1, ((List<Team>) teams).size());
    }
}