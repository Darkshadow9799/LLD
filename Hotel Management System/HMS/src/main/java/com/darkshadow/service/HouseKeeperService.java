package com.darkshadow.service;

import com.darkshadow.model.Room;

import java.util.ArrayList;
import java.util.Date;

public interface HouseKeeperService {

    /**
     * Get all the Rooms list which are serviced.
     * @param date
     * @return
     */
    ArrayList<Room> getRoomsServiced(Date date);
}
