package com.cloud.services.repository;

import com.cloud.services.entity.Player;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class PlayerRepositoryTest {

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    void testSaveAndFindById() {
        Player player = new Player();
        player.setName("John");
        Player savedPlayer = playerRepository.save(player);
        Player foundPlayer = playerRepository.findById(savedPlayer.getId()).orElse(null);
        assertThat(foundPlayer).isNotNull();
        assertThat(foundPlayer.getName()).isEqualTo("John");
    }
}
