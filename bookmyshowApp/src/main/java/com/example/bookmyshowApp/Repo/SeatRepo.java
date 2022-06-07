package com.example.bookmyshowApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookmyshowApp.beans.Seat;

@Repository
public interface SeatRepo extends JpaRepository<Seat, Integer>{

	Seat findBySeatNumber(int seatNumber);

}
