package com.gleice.dvlist.entites;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "tb_game_lis")
public class GamerList {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public GamerList() {

    }

    public GamerList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GamerList gamerList = (GamerList) o;
        return Objects.equals(id, gamerList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
