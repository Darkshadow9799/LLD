package com.darkshadow.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "houseKeeper")
public class HouseKeeper implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public HouseKeeper() {
    }

    public HouseKeeper(Person person) {
        this.person = person;
    }
}
