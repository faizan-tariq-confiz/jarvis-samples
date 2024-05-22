package com.cloud.services.repository;

import com.cloud.services.entity.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TeamRepositoryTest {

    @Autowired
    private TeamRepository teamRepository;

    @Test
    void testFindAll() {
        Iterable<Team> teams = teamRepository.findAll();
        assertThat(teams).isNotNull();
    }
}
