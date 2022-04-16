package com.darkshadow.service;

import com.darkshadow.model.HouseKeeper;
import com.darkshadow.model.Room;

import java.util.ArrayList;
import java.util.Date;

public interface HouseKeepingLogService {

    ArrayList<Room> getAllByDate(Date date);

    void addRoomHouseKeepingLogs(Room room, int duration, HouseKeeper houseKeeper);
}
