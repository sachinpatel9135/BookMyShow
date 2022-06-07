package com.example.bookmyshowApp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmyshowApp.beans.City;
import com.example.bookmyshowApp.service.CityService;

@RestController
public class Cityctrl {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping("/city")
	public List<City> getAllCity(){
		return cityService.getAllCity();
	}

}
