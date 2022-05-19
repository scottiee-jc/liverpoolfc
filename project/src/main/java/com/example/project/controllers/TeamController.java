package com.example.project.controllers;

import com.example.project.repository.TeamRepository;
import model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("teams")
public class TeamController {

    @Autowired
    TeamRepository teamRepository;


    @GetMapping
    public ResponseEntity<List<Team>> getAllTeams(){
        return new ResponseEntity(teamRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Team>> getTeam(@PathVariable Long id){
        return new ResponseEntity(teamRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Team>> postEstate(@RequestBody Team team){
        teamRepository.save(team);
        return new ResponseEntity(teamRepository.findAll(), HttpStatus.CREATED);
    }
}
