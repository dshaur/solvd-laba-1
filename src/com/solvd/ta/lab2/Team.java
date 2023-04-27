package com.solvd.ta.lab2;

import java.util.ArrayList;

public class Team implements Celebratable {
    private String name;
    private ArrayList<Player> players;
    private Coach coach;

    public Team(String name, ArrayList<Player> players, Coach coach) {
        this.name = name;
        this.players = players;
        this.coach = coach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @Override
    public void celebrate() {
        System.out.println(getName() + " players are celebrating!");
    }

}
