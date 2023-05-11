package com.solvd.ta.lab2;

import com.solvd.ta.lab2.exceptions.TeamNotFoundException;
import com.solvd.ta.lab2.interfaces.Celebratable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Team implements Celebratable {

    // Logger
    private static final Logger LOGGER = LogManager.getLogger(Team.class);

    // Attributes and variables
    private String name;
    private ArrayList<Player> players;
    private Coach coach;

    //Constructor
    public Team(String name, ArrayList<Player> players, Coach coach) throws TeamNotFoundException {
        this.name = name;
        this.players = players;
        this.coach = coach;

        // Check if the home team or away team is empty
        if (Objects.equals(this.getName(), "")) {

            throw new TeamNotFoundException("Home team or away team not found.");

        }
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
        LOGGER.info(getName() + " players are celebrating!");
    }

    // Method that prints each team's lineup using Consumer
    public void printTeamLineup() {
        players.forEach(player -> LOGGER.info((player.getName())));
    }

    // Method that filters players using Predicate
    public ArrayList<Player> filterPlayers(Predicate<Player> predicate) {
        ArrayList<Player> filteredPlayers = new ArrayList<>();
        for (Player player : players) {
            if (predicate.test(player)) {
                filteredPlayers.add(player);
            }
        }
        return filteredPlayers;
    }

    // Method to display filtered players
    public void displayFilteredPlayers(ArrayList<Player> filteredPlayers) {
        LOGGER.info("Players over 30 in " + this.getName() + ":");
        for (Player player : filteredPlayers) {
            LOGGER.info(player.getName());
        }
    }
}
