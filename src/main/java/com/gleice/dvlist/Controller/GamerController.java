package com.gleice.dvlist.Controller;
import com.gleice.dvlist.Service.GamerService;
import com.gleice.dvlist.dto.GamerMin;
import com.gleice.dvlist.entites.Gamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/gamer")
public class GamerController {
    @Autowired
    private GamerService gamerService;

    @GetMapping
    public List<GamerMin> finAll(){
    List<GamerMin>dto=gamerService.findAll();
    return dto;
    }

}
