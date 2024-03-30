package com.project.SunShine.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.SunShine.dao.GuestDao;
import com.project.SunShine.model.Guest;

@Service
public class GuestService {

	@Autowired
	GuestDao dao;
		public Guest getGuest(Integer guest) {
			System.out.println("we are in service layer..");
		Guest getGuest= dao.findById(guest).get();
		if(getGuest!=null) {
			System.out.println("in if"+ getGuest);
			return getGuest;
		}else {
			System.out.println("in else. person not found");
			return null;
		}
		
	}
		public List<Guest> getGuestList() {
			
			return dao.findAll();
		}
		public void saveGuest(Guest guest) {
			dao.save(guest);
		}
		
		public void saveGuestList(List<Guest> guest) {
			dao.saveAll(guest);
		}
}
