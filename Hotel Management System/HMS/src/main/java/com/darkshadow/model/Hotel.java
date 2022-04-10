package com.darkshadow.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "hotel")
public class Hotel implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String hotelName;
    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;
    private ArrayList<Room> rooms;

    public Location getLocation() {
        return location;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Hotel() {
    }

    public Hotel(String hotelName, Location location, ArrayList<Room> rooms) {
        this.hotelName = hotelName;
        this.location = location;
        this.rooms = rooms;
    }
}
