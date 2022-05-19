package com.example.project.config;

import com.example.project.ProjectApplication;
import com.example.project.repository.TeamRepository;
import model.Player;
import model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;


/*
      A configuration class that implements ApplicationRunner
      Long story short - we put some code in the run method to populate the DB after Spring App is ready.
    */

@Configuration
public class DBSeeder implements ApplicationRunner {

    /*
           Spring 'glues' DBSeder with the implementation of CustomerRepository
           provided by the Spring Data Jpa project
        */

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Team liverpool = new Team(null, "Jurgen Klopp", 37, 27, 2, 8, 91, 25, 89, null);

        Player p1 = new Player(null, "Mohammed", "Salah", "Forward", LocalDate.of(1992, 6, 15), 30, 13, true, liverpool);
        Player p2 = new Player(null, "Alisson", "Becker", "Goalkeeper", LocalDate.of(1992, 10, 2), 0, 0, true, liverpool);
        Player p3 = new Player(null, "Sadio", "Mane", "Forward", LocalDate.of(1992, 4, 10), 20, 6, true, liverpool);
        Player p4 = new Player(null, "Virgil", "Van Dijk", "Defender", LocalDate.of(1991, 7, 8), 3, 1, true, liverpool);
        Player p5 = new Player(null, "Trent", "Alexander-Arnold", "Defender", LocalDate.of(1998, 10, 7), 2, 15, true, liverpool);
        Player p6 = new Player(null, "Joel", "Matip", "Defender", LocalDate.of(1991, 8, 8), 3, 2, true, liverpool);
        Player p7 = new Player(null, "Jordan", "Henderson", "Midfielder", LocalDate.of(1990, 6, 17), 3, 6, true, liverpool);
        Player p8 = new Player(null, "Thiago", "Alcantara", "Midfileder", LocalDate.of(1991, 4, 11), 2, 3, true, liverpool);
        Player p9 = new Player(null, "Fabinho", "Tavares", "Midfielder", LocalDate.of(1993, 10, 23), 6, 1, true, liverpool);
        Player p10 = new Player(null, "Luis", "Diaz", "Forward", LocalDate.of(1997, 1, 13), 22, 8, true, liverpool);
        Player p11 = new Player(null, "Andy", "Robertson", "Defender", LocalDate.of(1994, 3, 11), 2, 12, true, liverpool);

        liverpool.setPlayers(List.of(p1,p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));

        teamRepository.saveAll(List.of(liverpool));
    }

}
