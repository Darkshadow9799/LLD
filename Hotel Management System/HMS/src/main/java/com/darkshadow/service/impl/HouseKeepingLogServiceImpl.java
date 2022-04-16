package com.darkshadow.service.impl;

import com.darkshadow.model.HouseKeeper;
import com.darkshadow.model.HouseKeepingLog;
import com.darkshadow.model.Room;
import com.darkshadow.repository.HouseKeepingLogRepository;
import com.darkshadow.service.HouseKeepingLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class HouseKeepingLogServiceImpl implements HouseKeepingLogService {

    @Autowired
    HouseKeepingLogRepository houseKeepingLogRepository;

    @Override
    public ArrayList<Room> getAllByDate(Date date) {
        ArrayList<HouseKeepingLog> houseKeepingLogs = houseKeepingLogRepository.findByDate(date);
        ArrayList<Room> roomsServiced = new ArrayList<>();
        houseKeepingLogs.forEach(houseKeepingLog -> {
            roomsServiced.add(houseKeepingLog.getRoom());
        });
        return roomsServiced;
    }

    @Override
    public void addRoomHouseKeepingLogs(Room room, int duration, HouseKeeper houseKeeper) {
        HouseKeepingLog houseKeepingLog = new HouseKeepingLog(new Date(), duration, room, houseKeeper);
        houseKeepingLogRepository.save(houseKeepingLog);
    }

}
