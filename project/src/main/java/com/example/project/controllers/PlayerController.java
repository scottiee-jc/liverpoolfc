package com.example.project.controllers;

import com.example.project.repository.PlayerRepository;
import model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("players")
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    //    Handles following:
//    * GET /players
//    * GET /players/:id
//    * GET /players?goalsScored=10

    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayersAndFilters(
            @RequestParam(required = false, name = "goals") Integer goals
    ){
        if (goals != null){
            return new ResponseEntity<>(playerRepository.findByGoalsScored(goals), HttpStatus.OK);
        }
        // GET /players
        return new ResponseEntity<>(playerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Player>> getPlayer(@PathVariable Long id){
        return new ResponseEntity(playerRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Player>> postPlayer(@RequestBody Player player){
        playerRepository.save(player);
        return new ResponseEntity<>(playerRepository.findAll(), HttpStatus.CREATED);
    }
}
