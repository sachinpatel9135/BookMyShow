package com.example.bookmyshowApp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmyshowApp.beans.CinemaHall;
import com.example.bookmyshowApp.service.CinemaHallService;

@RestController
public class CinamaHallCtrl {
	
	@Autowired
	private CinemaHallService cinemaHallService;
	
	@GetMapping("/cinemaHall/{city}")
	public List<CinemaHall> getAllCinemaHallsByCity(@PathVariable("city") String city){
		System.out.println("============================================");
		System.out.println(city);
		return cinemaHallService.getAllCinemaHallsByCity(city);
	}
	
	
	

}
