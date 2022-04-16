package com.darkshadow.service.impl;

import com.darkshadow.model.Room;
import com.darkshadow.service.HouseKeeperService;
import com.darkshadow.service.HouseKeepingLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class HouseKeeperServiceImpl implements HouseKeeperService {

    @Autowired
    HouseKeepingLogService houseKeepingLogService;

    @Override
    public ArrayList<Room> getRoomsServiced(Date date) {
        return houseKeepingLogService.getAllByDate(date);
    }
}
