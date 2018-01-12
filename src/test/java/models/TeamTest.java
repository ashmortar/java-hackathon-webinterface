package models;

import org.junit.After;
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
        testTeam.updateName("Muggles");
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
        assertEquals(0, Team.getAllTeams().size());
    }

    @After
    public void tearDown() {
        Team.deleteAllTeams();
    }

    @Test
    public void getId_returnsIdCorrectly_true() {
        Team testTeam = setupNewTeam();
        Team secondTeam = setupNewTeam();
        assertEquals(2, secondTeam.getId());
    }

    @Test
    public void findTeamById_returnsCorrectTeam_true() {
        Team firstTestTeam = setupNewTeam();
        Team secondTestTeam = setupNewTeam();
        Team thirdTestTest = setupNewTeam();
        secondTestTeam.updateName("newName");
        thirdTestTest.updateName("JavaTime");
        firstTestTeam.updateName("GuessWho");
        assertEquals("GuessWho", Team.findTeamById(1).getName());
        assertEquals("newName", Team.findTeamById(2).getName());
        assertEquals("JavaTime", Team.findTeamById(3).getName());
    }
}