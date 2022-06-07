package com.example.bookmyshowApp.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmyshowApp.Repo.BooKTicketRepo;
import com.example.bookmyshowApp.Repo.CinemaHallRepo;
import com.example.bookmyshowApp.Repo.MovieRepo;
import com.example.bookmyshowApp.Repo.ScreenRepo;
import com.example.bookmyshowApp.Repo.SeatRepo;
import com.example.bookmyshowApp.beans.CinemaHall;
import com.example.bookmyshowApp.beans.Screen;
import com.example.bookmyshowApp.beans.Seat;
import com.example.bookmyshowApp.beans.Ticket;

@Service
public class BookTicketService {
	
	@Autowired
	private BooKTicketRepo booKTicketRepo;
	
	@Autowired
	private SeatRepo seatRepo;
	
	@Autowired 
	private CinemaHallRepo cinemaHallRepo;
	
	@Autowired
	private ScreenRepo screenRepo;
	
	@Autowired
	private MovieRepo movieRepo;
	
	@Autowired 
	private SeatRepo repo;
	
	public Ticket bootTicket(Ticket ticket) {
		
		CinemaHall cinemaHall= cinemaHallRepo.findByCinemaHallName(ticket.getCinemaHallName());
		Screen screen=screenRepo.findByScreenName(ticket.getScreenName());
		if(cinemaHall.getScreens().contains(screen)) {
			for(Seat seat:ticket.getSeats()) {
				Seat seat2=seatRepo.findBySeatNumber(seat.getSeatNumber());
				seatRepo.delete(seat2);
				seat2.setIsavalible(false);
				seatRepo.save(seat2);
				
			}
			
			
			
			System.out.println("Hello");
		}
		return booKTicketRepo.save(ticket);
	}

}
