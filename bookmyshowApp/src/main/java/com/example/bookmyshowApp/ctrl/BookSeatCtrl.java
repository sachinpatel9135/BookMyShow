package com.example.bookmyshowApp.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmyshowApp.beans.Ticket;
import com.example.bookmyshowApp.service.BookTicketService;

@RestController
public class BookSeatCtrl {

	@Autowired
	private BookTicketService bookTicketService;
	
	
	@PostMapping("/bookTicket")
	public Ticket bootTicket(@RequestBody Ticket ticket) {
		
		return bookTicketService.bootTicket(ticket);
	}

}
