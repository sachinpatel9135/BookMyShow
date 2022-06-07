package com.example.bookmyshowApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmyshowApp.Repo.CityRepo;
import com.example.bookmyshowApp.beans.City;

@Service
public class CityService {
	
	@Autowired
	private CityRepo cityRepo;
	
	
	public List<City> getAllCity(){
		return cityRepo.findAll();
	}
	

}
