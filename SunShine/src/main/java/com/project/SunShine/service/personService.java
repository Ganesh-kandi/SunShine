package com.project.SunShine.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.SunShine.dao.GuestDao;
import com.project.SunShine.model.Guest;

@Service
public class personService {

	@Autowired
	GuestDao dao;
		public Guest getGuest(String guest) {
			System.out.println("we are in service layer..");
		Guest getGuest= dao.findById(guest).orElse(new Guest());
		if(getGuest!=null) {
			System.out.println("in if"+ getGuest);
			return getGuest;
		}else {
			System.out.println("in else. person not found");
			return null;
		}
		
	}
}
