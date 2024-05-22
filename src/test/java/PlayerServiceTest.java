package com.cloud.services.service;

import com.cloud.services.entity.Player;
import com.cloud.services.repository.PlayerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class PlayerServiceTest {

    @InjectMocks
    private PlayerServiceImpl playerService;

    @Mock
    private PlayerRepository playerRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        List<Player> players = new ArrayList<>();
        when(playerRepository.findAll()).thenReturn(players);
        Iterable<Player> result = playerService.findAll();
        assertEquals(players, result);
    }
}
