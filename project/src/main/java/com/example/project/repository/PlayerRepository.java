package com.example.project.repository;

import model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.Id;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
