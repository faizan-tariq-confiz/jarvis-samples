package com.cloud.services.repository;

import com.cloud.services.entity.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TeamRepositoryTest {

    @Autowired
    private TeamRepository teamRepository;

    @Test
    void testSaveTeam() {
        Team team = new Team();
        Team savedTeam = teamRepository.save(team);
        assertNotNull(savedTeam.getId());
    }
}
