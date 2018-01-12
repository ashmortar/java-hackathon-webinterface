package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest {
    public Team setupNewTeam() {
        return new Team("MadLads", "some description goes here");
    }



    @Test
    public void newTeamObject_instantiatesCorreclty_true() {
        Team testTeam = setupNewTeam();
        assertTrue(testTeam instanceof Team);
    }

    @Test
    public void getName_returnsNameCorrectly_true() {
        Team testTeam = setupNewTeam();
        assertEquals("MadLads", testTeam.getName());
    }

    @Test
    public void getDescription_returnsDescriptionCorrectly_true() {
        Team testTeam = setupNewTeam();
        assertEquals("some description goes here", testTeam.getDescription());
    }
}