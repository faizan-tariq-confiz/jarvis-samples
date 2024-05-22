package com.cloud.services.service;

import com.cloud.services.entity.Team;
import com.cloud.services.repository.TeamRepository;
import com.cloud.services.repository.PlayerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TeamServiceImplTest {

    @InjectMocks
    private TeamServiceImpl teamService;

    @Mock
    private TeamRepository teamRepository;

    @Mock
    private PlayerRepository playerRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetTeam() {
        Long teamId = 1L;
        Team team = new Team();
        when(teamRepository.findById(teamId)).thenReturn(Optional.of(team));
        Team result = teamService.getTeam(teamId);
        assertEquals(team, result);
    }

    @Test
    void testCreateTeam() {
        Team team = new Team();
        when(teamRepository.save(team)).thenReturn(team);
        Team result = teamService.createTeam(team);
        assertEquals(team, result);
    }
}
