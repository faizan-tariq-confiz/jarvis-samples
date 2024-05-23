package com.cloud.services.service;

import com.cloud.services.entity.Team;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class TeamServiceTest {

    @Mock
    private TeamService teamService;

    @Test
    public void testGetTeam() {
        Team team = new Team();
        when(teamService.getTeam(1L)).thenReturn(team);

        Team result = teamService.getTeam(1L);
        assertEquals(team, result);
    }

    @Test
    public void testCreateTeam() {
        Team team = new Team();
        when(teamService.createTeam(team)).thenReturn(team);

        Team result = teamService.createTeam(team);
        assertEquals(team, result);
    }
}
