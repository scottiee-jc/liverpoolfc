package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String manager;
    @Column
    private int gamesPlayed;
    @Column
    private int gamesWon;
    @Column
    private int gamesLost;
    @Column
    private int gamesDrawn;
    @Column
    private int goalsFor;
    @Column
    private int goalsAgainst;
    @Column
    private int points;

     /*
        @OneToMany defines the relationship.
        mappedBy attribute: indicates that the entity in this side is the inverse of the relationship.
        The owner (the entity that has the foreign key) is PurchaseOrder

        cascade = CascadeType.ALL attribute: Hibernate will propagate all actions
        e.g. in DBSeeder we save a customer with a List of PurchaseOrders - we don't need to manually save them as
        Hibernate will make sure all the orders from the list will be saved to the corresponding table.
     */

    @JsonIgnoreProperties({"team"})
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;

    public Team(){
    }

    public Team(Long id, String manager, int gamesPlayed, int gamesWon, int gamesLost, int gamesDrawn, int goalsFor, int goalsAgainst, int points, List<Player> players) {
        this.id = id;
        this.manager = manager;
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesDrawn = gamesDrawn;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.points = points;
        this.players = players;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getGamesDrawn() {
        return gamesDrawn;
    }

    public void setGamesDrawn(int gamesDrawn) {
        this.gamesDrawn = gamesDrawn;
    }
}
