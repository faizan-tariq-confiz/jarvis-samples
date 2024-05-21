package com.cloud.services.service;

import com.cloud.services.entity.Team;
import com.cloud.services.repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class TeamServiceTests {

    @Mock
    private TeamRepository teamRepository;

    @InjectMocks
    private TeamServiceImpl teamService;

    public TeamServiceTests() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetTeam() {
        Team team = new Team();
        when(teamRepository.findById(1L)).thenReturn(Optional.of(team));
        Team foundTeam = teamService.getTeam(1L);
        assertNotNull(foundTeam);
    }

    @Test
    void testCreateTeam() {
        Team team = new Team();
        when(teamRepository.save(team)).thenReturn(team);
        Team createdTeam = teamService.createTeam(team);
        assertNotNull(createdTeam);
    }
}
