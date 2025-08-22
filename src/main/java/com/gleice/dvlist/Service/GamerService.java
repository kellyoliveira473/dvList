package com.gleice.dvlist.Service;

import com.gleice.dvlist.dto.GamerMin;
import com.gleice.dvlist.entites.Gamer;
import com.gleice.dvlist.repository.GamerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamerService {
    @Autowired
   private GamerRepository gamerRepository;

   public List<GamerMin> findAll(){
     var resul =gamerRepository.findAll();
     List<GamerMin>dto= resul.stream().map(x-> new GamerMin(x)).toList();
     return dto;
   }
}
