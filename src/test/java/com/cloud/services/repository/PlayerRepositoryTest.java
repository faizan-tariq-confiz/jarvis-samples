package com.cloud.services.repository;

import com.cloud.services.entity.Player;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class PlayerRepositoryTest {

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    public void testFindById() {
        Player player = new Player();
        player.setName("John");
        player = playerRepository.save(player);

        Optional<Player> foundPlayer = playerRepository.findById(player.getId());
        assertTrue(foundPlayer.isPresent());
    }
}
