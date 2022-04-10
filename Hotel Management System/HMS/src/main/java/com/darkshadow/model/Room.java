package com.darkshadow.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "room")
public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private RoomStyle roomStyle;
    private RoomStatus roomStatus;
    private double roomPrice;
    private ArrayList<RoomKey> roomKeys;
    private ArrayList<HouseKeepingLog> houseKeepingLogs;

    public RoomStyle getRoomStyle() {
        return roomStyle;
    }

    public void setRoomStyle(RoomStyle roomStyle) {
        this.roomStyle = roomStyle;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public ArrayList<RoomKey> getRoomKeys() {
        return roomKeys;
    }

    public void setRoomKeys(ArrayList<RoomKey> roomKeys) {
        this.roomKeys = roomKeys;
    }

    public ArrayList<HouseKeepingLog> getHouseKeepingLogs() {
        return houseKeepingLogs;
    }

    public void setHouseKeepingLogs(ArrayList<HouseKeepingLog> houseKeepingLogs) {
        this.houseKeepingLogs = houseKeepingLogs;
    }

    public Room() {
    }

    public Room(RoomStyle roomStyle, RoomStatus roomStatus, double roomPrice, ArrayList<RoomKey> roomKeys, ArrayList<HouseKeepingLog> houseKeepingLogs) {
        this.roomStyle = roomStyle;
        this.roomStatus = roomStatus;
        this.roomPrice = roomPrice;
        this.roomKeys = roomKeys;
        this.houseKeepingLogs = houseKeepingLogs;
    }
}
