package com.example.bookmyshowApp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.bookmyshowApp.beans.CinemaHall;

@Repository
public interface CinemaHallRepo extends JpaRepository<CinemaHall, Integer> {

	@Query(" FROM  CinemaHall ch Inner join City c On ch.city=c.id where c.city=:city")
	List<CinemaHall> findByCity(@Param("city") String city);

	CinemaHall findByCinemaHallName(String cinemaHallName);

	

}
