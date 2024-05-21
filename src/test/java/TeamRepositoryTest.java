import com.cloud.services.entity.Team;
import com.cloud.services.repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TeamRepositoryTest {

    @Autowired
    private TeamRepository teamRepository;

    @Test
    void testSaveAndFindTeam() {
        Team team = new Team();
        team.setName("Team A");
        teamRepository.save(team);

        Iterable<Team> teams = teamRepository.findAll();
        assertThat(teams).isNotEmpty();
    }
}
