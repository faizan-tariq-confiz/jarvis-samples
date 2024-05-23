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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class TeamControllerTest {

    private MockMvc mockMvc;

    @Mock
    private TeamService teamService;

    @Mock
    private Environment environment;

    @InjectMocks
    private TeamController teamController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(teamController).build();
    }

    @Test
    public void testCreateTeam() throws Exception {
        Team team = new Team();
        when(teamService.createTeam(team)).thenReturn(team);

        mockMvc.perform(post("/teams")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));

        ResponseEntity responseEntity = teamController.create(team);
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
    }

    @Test
    public void testGetTeam() throws Exception {
        Long teamId = 1L;
        Team team = new Team();
        when(teamService.getTeam(teamId)).thenReturn(team);

        mockMvc.perform(get("/teams/" + teamId)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));

        ResponseEntity responseEntity = teamController.get(teamId);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void testGetPort() throws Exception {
        when(environment.getProperty("local.server.port")).thenReturn("8080");

        mockMvc.perform(get("/teams"))
                .andExpect(status().isOk())
                .andExpect(content().string("8080"));

        String port = teamController.get();
        assertEquals("8080", port);
    }
}
