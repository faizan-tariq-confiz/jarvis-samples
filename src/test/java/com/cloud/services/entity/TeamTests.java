package com.cloud.services.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamTests {

    @Test
    void testTeamGetters() {
        List<Player> players = new ArrayList<>();
        Team team = new Team(players);
        team.setId(1L);

        assertEquals(1L, team.getId());
        assertEquals(players, team.getPlayers());
    }
}
