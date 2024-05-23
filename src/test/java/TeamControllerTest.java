package com.cloud.services.controller;

import com.cloud.services.entity.Team;
import com.cloud.services.service.TeamService;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TeamControllerTest {

    @Test
    public void testCreate() {
        TeamService teamService = mock(TeamService.class);
        TeamController teamController = new TeamController();
        teamController.setTeamService(teamService);

        Team team = new Team();
        when(teamService.createTeam(team)).thenReturn(team);

        ResponseEntity responseEntity = teamController.create(team);
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
    }

    @Test
    public void testGet() {
        TeamService teamService = mock(TeamService.class);
        TeamController teamController = new TeamController();
        teamController.setTeamService(teamService);

        Long teamId = 1L;
        when(teamService.getTeam(teamId)).thenReturn(new Team());

        ResponseEntity responseEntity = teamController.get(teamId);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

}
