package com.cloud.services.repository;

import com.cloud.services.entity.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class TeamRepositoryTest {

    @Autowired
    private TeamRepository teamRepository;

    @Test
    public void testSaveTeam() {
        Team team = new Team();
        Team savedTeam = teamRepository.save(team);
        assertNotNull(savedTeam.getId());
    }
}
