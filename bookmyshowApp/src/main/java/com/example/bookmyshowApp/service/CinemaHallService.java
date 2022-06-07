package com.example.bookmyshowApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmyshowApp.Repo.CinemaHallRepo;
import com.example.bookmyshowApp.beans.CinemaHall;

@Service
public class CinemaHallService {
	
	@Autowired
	private CinemaHallRepo cinemaHallRepo;
	
	public List<CinemaHall> getAllCinemaHalls(){
		return cinemaHallRepo.findAll();
	}
	
	public List<CinemaHall> getAllCinemaHallsByCity(String city){
		return cinemaHallRepo.findByCity(city);
	}
	
	

}
