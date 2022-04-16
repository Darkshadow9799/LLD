package com.darkshadow.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "houseKeepingLog")
public class HouseKeepingLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Date uploadDate;
    private int duration;

    @ManyToMany
    private Room room;

    @ManyToMany
    private HouseKeeper houseKeeper;

    public HouseKeeper getHouseKeeper() {
        return houseKeeper;
    }

    public void setHouseKeeper(HouseKeeper houseKeeper) {
        this.houseKeeper = houseKeeper;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public HouseKeepingLog() {
    }

    public HouseKeepingLog(Date uploadDate, int duration, Room room, HouseKeeper houseKeeper) {
        this.uploadDate = uploadDate;
        this.duration = duration;
        this.room = room;
        this.houseKeeper = houseKeeper;
    }
}
