package models;


import java.util.ArrayList;

public class Team {
    private String name;
    private String description;
    private ArrayList<String> members = new ArrayList<>();


    public Team(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void addMember(String name) {
        members.add(name);
    }
}