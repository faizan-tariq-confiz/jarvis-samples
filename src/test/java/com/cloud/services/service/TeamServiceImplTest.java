package com.cloud.services.service;

import com.cloud.services.entity.Team;
import com.cloud.services.repository.TeamRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class TeamServiceImplTest {

    @Mock
    private TeamRepository teamRepository;

    @InjectMocks
    private TeamServiceImpl teamServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetTeam() {
        Long teamId = 1L;
        when(teamRepository.findById(teamId)).thenReturn(Optional.of(new Team()));
        Team team = teamServiceImpl.getTeam(teamId);
        assertNotNull(team);
    }

    @Test
    void testCreateTeam() {
        Team team = new Team();
        when(teamRepository.save(team)).thenReturn(team);
        Team createdTeam = teamServiceImpl.createTeam(team);
        assertNotNull(createdTeam);
    }
}
