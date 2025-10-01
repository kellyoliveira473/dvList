package com.kelly.dslist.DTO;

import com.kelly.dslist.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
public class GameListDTO {
    private Long id;
    private String name;
    public GameListDTO (GameList entity){
        id= entity.getId();
        name=entity.getName();
    }
}
