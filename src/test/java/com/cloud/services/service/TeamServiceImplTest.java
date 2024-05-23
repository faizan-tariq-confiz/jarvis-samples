package com.cloud.services.service;

import com.cloud.services.entity.Team;
import com.cloud.services.repository.TeamRepository;
import org.junit.jupiter.api.BeforeEach;
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
    private TeamServiceImpl teamService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetTeam() {
        Long id = 1L;
        Team team = new Team();
        when(teamRepository.findById(id)).thenReturn(Optional.of(team));

        Team result = teamService.getTeam(id);
        assertEquals(team, result);
    }

    @Test
    public void testCreateTeam() {
        Team team = new Team();
        when(teamRepository.save(team)).thenReturn(team);

        Team result = teamService.createTeam(team);
        assertEquals(team, result);
    }
}
