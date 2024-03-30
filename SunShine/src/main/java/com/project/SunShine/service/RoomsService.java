package com.project.SunShine.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.SunShine.dao.RoomsDao;
import com.project.SunShine.model.Rooms;

@Service
public class RoomsService {
	@Autowired
	RoomsDao roomsDao;
	
	public void saveRoom(Rooms room) {
		roomsDao.save(room);
	}
	
	public Rooms getRoom(Integer roomId) {
		System.out.println("we are in service layer..");
	Rooms getRoom= roomsDao.findById(roomId).get();
	return getRoom;
	
}

}
