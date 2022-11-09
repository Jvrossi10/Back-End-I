package com.dh.trainer.controller;

import com.dh.trainer.model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dh.trainer.service.TrainerService;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<Trainer> getTrainer(){
        return trainerService.trainerList();
    }
}
