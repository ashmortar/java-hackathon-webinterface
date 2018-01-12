package models;


import java.util.ArrayList;

public class Team {
    private String name;
    private String description;
    private ArrayList<String> members = new ArrayList<>();
    private static ArrayList<Team> instances = new ArrayList<>();
    private int id;


    public Team(String name, String description) {
        this.name = name;
        this.description = description;
        instances.add(this);
        this.id = instances.size();
    }

    //getter methods
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public int getId() {
        return id;
    }


    //other instance specific methods
    public void addMember(String name) {
        members.add(name);
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    //class wide (static) methods
    public static void deleteAllTeams() {
        instances.clear();
    }

    public static ArrayList<Team> getAllTeams() {
        return instances;
    }

    public static Team findTeamById(int id) {
        return instances.get(id-1);
    }
}