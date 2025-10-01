package com.kelly.dslist.bunisses;

import com.kelly.dslist.DTO.GameDTO;
import com.kelly.dslist.DTO.GameMinDTO;
import com.kelly.dslist.entities.Game;
import com.kelly.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game resul =gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(resul);
        return dto;

    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAl(){
       List< Game>result = gameRepository.findAll();
       List<GameMinDTO>dto= result.stream().map(x -> new GameMinDTO(x)).toList();
       return dto;
    }




}
