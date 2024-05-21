package com.cloud.services.controller;

import com.cloud.services.entity.Team;
import com.cloud.services.service.TeamService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TeamControllerTests {

    @Mock
    private TeamService teamService;

    @InjectMocks
    private TeamController teamController;

    public TeamControllerTests() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetTeam() {
        Team team = new Team();
        when(teamService.getTeam(1L)).thenReturn(team);
        ResponseEntity responseEntity = teamController.get(1L);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    void testCreateTeam() {
        Team team = new Team();
        when(teamService.createTeam(team)).thenReturn(team);
        ResponseEntity responseEntity = teamController.create(team);
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
    }
}
