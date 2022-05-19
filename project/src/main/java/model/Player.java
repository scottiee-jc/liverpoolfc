package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player<T>{
    @Id
    @Column(name = "playerId", nullable = false)
    private Long playerId;

    private String firstName;
    private String lastName;
    private int goals;
    private int assists;
    private boolean isStarting11;

    public Player(){
    }

    public Player(Long playerId, String firstName, String lastName, int goals, int assists, boolean isStarting11) {
        this.playerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.goals = goals;
        this.assists = assists;
        this.isStarting11 = isStarting11;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public boolean isStarting11() {
        return isStarting11;
    }

    public void setStarting11(boolean starting11) {
        isStarting11 = starting11;
    }
}
