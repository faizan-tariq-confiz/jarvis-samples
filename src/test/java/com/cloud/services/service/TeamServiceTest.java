package com.cloud.services.service;

import com.cloud.services.entity.Team;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class TeamServiceTest {

    @Mock
    private TeamService teamService;

    @InjectMocks
    private TeamServiceImpl teamServiceImpl;

    @Test
    void testGetTeam() {
        Long teamId = 1L;
        when(teamService.getTeam(teamId)).thenReturn(new Team());
        Team team = teamServiceImpl.getTeam(teamId);
        assertNotNull(team);
    }

    @Test
    void testCreateTeam() {
        Team team = new Team();
        when(teamService.createTeam(team)).thenReturn(team);
        Team createdTeam = teamServiceImpl.createTeam(team);
        assertNotNull(createdTeam);
    }
}
