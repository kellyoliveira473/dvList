package com.gleice.dvlist.dto;

import com.gleice.dvlist.entites.Gamer;
import jakarta.persistence.Column;

public class GamerMin {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GamerMin(Long id) {
        this.id = id;
    }

    public GamerMin(Gamer entites) {

        id = entites.getId();
        title = entites.getTitle();
        year = entites.getYear();
        imgUrl = entites.getImgUrl();
        shortDescription = entites.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
