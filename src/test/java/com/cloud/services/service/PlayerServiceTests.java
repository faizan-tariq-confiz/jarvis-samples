package com.cloud.services.service;

import com.cloud.services.entity.Player;
import com.cloud.services.repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class PlayerServiceTests {

    @Mock
    private PlayerRepository playerRepository;

    @InjectMocks
    private PlayerServiceImpl playerService;

    public PlayerServiceTests() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAllPlayers() {
        when(playerRepository.findAll()).thenReturn(new ArrayList<>());
        Iterable<Player> players = playerService.findAll();
        assertNotNull(players);
    }
}
