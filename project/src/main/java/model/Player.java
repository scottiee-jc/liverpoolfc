package model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "players")
public class Player{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String firstName;
    @Column
    private String lastName;

    @Column
    private String position;
    @Column
    private LocalDate dateOfBirth;
    @Column(name = "goals")
    private int goals;
    @Column
    private int assists;
    @Column
    private boolean isStarting11;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    public Player(){
    }

    public Player(Long id, String firstName, String lastName, String position, LocalDate dateOfBirth, int goals, int assists, boolean isStarting11, Team team) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.goals = goals;
        this.assists = assists;
        this.isStarting11 = isStarting11;
        this.team = team;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
