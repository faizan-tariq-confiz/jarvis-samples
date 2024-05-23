package com.cloud.services.service;

import com.cloud.services.entity.Player;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class PlayerServiceTest {

    @Mock
    private PlayerService playerService;

    @InjectMocks
    private PlayerServiceImpl playerServiceImpl;

    @Test
    void testFindAll() {
        when(playerService.findAll()).thenReturn(new ArrayList<Player>());
        Iterable<Player> players = playerServiceImpl.findAll();
        assertNotNull(players);
    }
}
