package com.kelly.dslist.controller;

import com.kelly.dslist.DTO.GameMinDTO;
import com.kelly.dslist.bunisses.GameService;
import com.kelly.dslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService  gameService;
    @GetMapping
    public List<GameMinDTO>findAll(){
     List<GameMinDTO>result = gameService.findAl();
     return result;
    }
}
