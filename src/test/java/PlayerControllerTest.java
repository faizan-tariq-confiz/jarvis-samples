package com.cloud.services.controller;

import com.cloud.services.entity.Player;
import com.cloud.services.service.PlayerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PlayerControllerTest {

    private MockMvc mockMvc;

    @Mock
    private PlayerService playerService;

    @InjectMocks
    private PlayerController playerController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(playerController).build();
    }

    @Test
    void testGetAllPlayers() throws Exception {
        Player player1 = new Player(1L, "John", "Doe", "Forward");
        Player player2 = new Player(2L, "Jane", "Doe", "Midfielder");
        List<Player> players = Arrays.asList(player1, player2);

        when(playerService.getAllPlayers()).thenReturn(players);

        mockMvc.perform(get("/players")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("[{id:1,firstName:'John',lastName:'Doe',position:'Forward'},{id:2,firstName:'Jane',lastName:'Doe',position:'Midfielder'}]"));
    }
}
