package com.project.SunShine.contolller;



import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.SunShine.model.Guest;
import com.project.SunShine.service.personService;

@RestController
public class Controller {

	@Autowired
	personService personService;
	
	
	@GetMapping(value="/getPerson", produces = MediaType.APPLICATION_JSON_VALUE)
	public Guest PersonsController(@RequestParam String guest) {
		Guest getGuest=personService.getGuest(guest);
		System.out.println(getGuest);
		if(guest!=null) {
			return getGuest;
		}
		else {
			return getGuest;
		}
		
	}
	
	
}
