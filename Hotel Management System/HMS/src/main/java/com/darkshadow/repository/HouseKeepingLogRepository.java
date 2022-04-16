package com.darkshadow.repository;

import com.darkshadow.model.HouseKeepingLog;
import com.darkshadow.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;

@Repository
public interface HouseKeepingLogRepository extends JpaRepository<HouseKeepingLog, Long> {
    ArrayList<HouseKeepingLog> findByDate(Date date);
}
