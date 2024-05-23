package com.cloud.services.controller;

import com.cloud.services.service.PlayerService;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerControllerTest {

    @Test
    public void testGet() {
        PlayerService playerService = mock(PlayerService.class);
        PlayerController playerController = new PlayerController();
        playerController.setPlayerService(playerService);

        when(playerService.findAll()).thenReturn(Collections.emptyList());

        ResponseEntity responseEntity = playerController.get();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

}
