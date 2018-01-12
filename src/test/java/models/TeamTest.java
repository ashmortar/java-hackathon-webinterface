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

    @Test
    public void addMember_addsStingInputToMembersArray_true() {
        Team testTeam = setupNewTeam();
        testTeam.addMember("Aaron");
        testTeam.addMember("Natalia");
        testTeam.addMember("Zach");
        testTeam.addMember("Ross");
        assertEquals(4, testTeam.getMembers().size());
    }

    @Test
    public void updateName_changesNameCorrectly_true() {
        Team testTeam = setupNewTeam();
        testTeam.udpateName("Muggles");
        assertEquals("Muggles", testTeam.getName());
    }

    @Test
    public void updateDescription_changesDescriptionCorrectly_true() {
        Team testTeam = setupNewTeam();
        testTeam.updateDescription("a slightly different description now");
        assertEquals("a slightly different description now", testTeam.getDescription());
    }

    @Test
    public void deleteAllTeams_clearsAllInstancesOfTeam_true() {
        Team testTeam = setupNewTeam();
        Team.deleteAllTeams();
        assertEquals(0, Team.instances.size());
    }
//    @Test
//    public void getIg_returnsIdCorrectly_true() {
//        Team testTeam = setupNewTeam();
//        Team secondTeam = setupNewTeam();
//        assertEquals(2, secondTeam.getId());
//    }
}