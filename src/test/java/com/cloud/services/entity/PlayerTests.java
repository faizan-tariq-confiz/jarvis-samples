package com.cloud.services.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTests {

    @Test
    void testPlayerGetters() {
        Player player = new Player();
        player.setId(1L);
        player.setName("John");

        assertEquals(1L, player.getId());
        assertEquals("John", player.getName());
    }
}
