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
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TeamControllerTest {

    private MockMvc mockMvc;

    @Mock
    private Environment environment;

    @Mock
    private TeamService teamService;

    @InjectMocks
    private TeamController teamController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(teamController).build();
    }

    @Test
    public void testCreateTeam() {
        Team team = new Team();
        when(teamService.createTeam(team)).thenReturn(team);

        ResponseEntity responseEntity = teamController.create(team);

        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
    }

    @Test
    public void testGetTeam() {
        Long teamId = 1L;
        Team team = new Team();
        when(teamService.getTeam(teamId)).thenReturn(team);

        ResponseEntity responseEntity = teamController.get(teamId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void testGetPort() {
        String port = "8080";
        when(environment.getProperty("local.server.port")).thenReturn(port);

        String response = teamController.get();

        assertEquals(port, response);
    }
}
