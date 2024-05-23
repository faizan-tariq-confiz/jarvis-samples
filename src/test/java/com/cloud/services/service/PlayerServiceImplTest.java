package com.cloud.services.service;

import com.cloud.services.entity.Player;
import com.cloud.services.repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PlayerServiceImplTest {

    @Mock
    private PlayerRepository playerRepository;

    @InjectMocks
    private PlayerServiceImpl playerServiceImpl;

    @Test
    public void testFindAll() {
        MockitoAnnotations.openMocks(this);
        List<Player> players = new ArrayList<>();
        when(playerRepository.findAll()).thenReturn(players);

        Iterable<Player> result = playerServiceImpl.findAll();
        assertEquals(players, result);
    }
}