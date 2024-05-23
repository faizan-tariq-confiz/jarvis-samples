package com.cloud.services.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collections;
import java.util.List;

public class TeamTest {

    @Test
    public void testGetId() {
        Team team = new Team();
        Long id = 1L;
        team.setId(id);
        assertEquals(id, team.getId());
    }

    @Test
    public void testGetPlayers() {
        Player player = new Player();
        List<Player> players = Collections.singletonList(player);
        Team team = new Team(players);
        assertEquals(players, team.getPlayers());
    }
}
