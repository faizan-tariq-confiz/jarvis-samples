package com.cloud.services.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void testGetId() {
        Player player = new Player();
        long id = 1L;
        player.setId(id);
        assertEquals(id, player.getId());
    }

    @Test
    public void testGetName() {
        Player player = new Player();
        String name = "John";
        player.setName(name);
        assertEquals(name, player.getName());
    }
}
