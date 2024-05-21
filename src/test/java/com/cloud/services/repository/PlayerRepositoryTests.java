package com.cloud.services.repository;

import com.cloud.services.entity.Player;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class PlayerRepositoryTests {

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    void testSavePlayer() {
        Player player = new Player();
        player.setName("John");
        Player savedPlayer = playerRepository.save(player);
        assertNotNull(savedPlayer);
    }
}
