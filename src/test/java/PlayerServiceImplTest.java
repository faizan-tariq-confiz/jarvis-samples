package com.cloud.services.service;

import com.cloud.services.entity.Player;
import com.cloud.services.repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Collections;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceImplTest {

    @Mock
    private PlayerRepository playerRepository;

    @InjectMocks
    private PlayerServiceImpl playerService;

    @Test
    public void testFindAll() {
        Player player = new Player();
        Iterable<Player> players = Collections.singletonList(player);
        when(playerRepository.findAll()).thenReturn(players);

        Iterable<Player> result = playerService.findAll();
        assertIterableEquals(players, result);
    }
}
