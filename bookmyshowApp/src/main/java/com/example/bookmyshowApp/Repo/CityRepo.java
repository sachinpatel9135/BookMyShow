package com.example.bookmyshowApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookmyshowApp.beans.City;

@Repository
public interface CityRepo extends JpaRepository<City, Integer>{

}
