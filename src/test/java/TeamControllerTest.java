package com.cloud.services.controller;

import com.cloud.services.entity.Team;
import com.cloud.services.service.TeamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TeamControllerTest {

    @InjectMocks
    private TeamController teamController;

    @Mock
    private TeamService teamService;

    @Mock
    private Environment environment;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreate() {
        Team team = new Team();
        when(teamService.createTeam(team)).thenReturn(team);
        ResponseEntity responseEntity = teamController.create(team);
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
    }

    @Test
    void testGetTeam() {
        Long teamId = 1L;
        Team team = new Team();
        when(teamService.getTeam(teamId)).thenReturn(team);
        ResponseEntity responseEntity = teamController.get(teamId);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    void testGetPort() {
        when(environment.getProperty("local.server.port")).thenReturn("8080");
        String port = teamController.get();
        assertEquals("8080", port);
    }
}
