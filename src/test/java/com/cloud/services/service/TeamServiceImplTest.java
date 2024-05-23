package com.cloud.services.service;

import com.cloud.services.entity.Team;
import com.cloud.services.repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TeamServiceImplTest {

    @Mock
    private TeamRepository teamRepository;

    @InjectMocks
    private TeamServiceImpl teamServiceImpl;

    @Test
    public void testGetTeam() {
        MockitoAnnotations.openMocks(this);
        Long teamId = 1L;
        Team team = new Team();
        when(teamRepository.findById(teamId)).thenReturn(java.util.Optional.of(team));

        Team result = teamServiceImpl.getTeam(teamId);
        assertEquals(team, result);
    }

    @Test
    public void testCreateTeam() {
        MockitoAnnotations.openMocks(this);
        Team team = new Team();
        when(teamRepository.save(team)).thenReturn(team);

        Team result = teamServiceImpl.createTeam(team);
        assertEquals(team, result);
    }
}
