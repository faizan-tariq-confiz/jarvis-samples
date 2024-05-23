package com.cloud.services.repository;

import com.cloud.services.entity.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class TeamRepositoryTest {

    @Autowired
    private TeamRepository teamRepository;

    @Test
    public void testFindById() {
        Team team = new Team();
        teamRepository.save(team);

        Optional<Team> foundTeam = teamRepository.findById(team.getId());
        assertTrue(foundTeam.isPresent());
    }
}
