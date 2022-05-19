package com.example.project.repository;

import com.example.project.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

//    List<Player> findByGoalsScored(int goals);
}
