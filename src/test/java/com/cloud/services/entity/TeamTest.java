package com.cloud.services.entity;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamTest {

    @Test
    void testGetId() {
        Team team = new Team();
        Long id = 1L;
        team.setId(id);
        assertEquals(id, team.getId());
    }

    @Test
    void testGetPlayers() {
        List<Player> players = Collections.singletonList(new Player());
        Team team = new Team(players);
        assertEquals(players, team.getPlayers());
    }
}
