package com.darkshadow.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "location")
public class Location implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;
    private String area;
    private String city;
    private String state;
    private int pin;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Location() {
    }

    public Location(String street, String area, String city, String state, int pin) {
        this.street = street;
        this.area = area;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }
}
