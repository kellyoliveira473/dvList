package com.kelly.dslist.controller;
import com.kelly.dslist.DTO.GameListDTO;
import com.kelly.dslist.bunisses.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListServiceService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO>result = gameListServiceService.findAl();
        return result;
    }

}
