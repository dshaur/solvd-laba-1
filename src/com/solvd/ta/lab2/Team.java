package com.solvd.ta.lab2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Team implements Celebratable {

    // Logger
    private static final Logger logger = LogManager.getLogger(Team.class);

    // Attributes and variables
    private String name;
    private ArrayList<Player> players;
    private Coach coach;

    //Constructor
    public Team(String name, ArrayList<Player> players, Coach coach) {
        this.name = name;
        this.players = players;
        this.coach = coach;
    }

    // Getters and Setters
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

    // celebrate() method
    @Override
    public void celebrate() {
        logger.info(getName() + " players are celebrating!");
    }

}
