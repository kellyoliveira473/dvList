package com.gleice.dvlist.entites;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


import java.util.Objects;
@Embeddable
public class BelongingPk {
    @ManyToOne
    @JoinColumn(name = "gamer_id")
    private Gamer gamer;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GamerList list;

    public BelongingPk() {
    }

    public BelongingPk(Gamer gamer, GamerList list) {
        this.gamer = gamer;
        this.list = list;
    }

    public Gamer getGamer() {
        return gamer;
    }

    public void setGamer(Gamer gamer) {
        this.gamer = gamer;
    }

    public GamerList getList() {
        return list;
    }

    public void setList(GamerList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPk that = (BelongingPk) o;
        return Objects.equals(gamer, that.gamer) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gamer, list);
    }
}
