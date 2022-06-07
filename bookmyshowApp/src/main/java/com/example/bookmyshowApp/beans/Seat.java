package com.example.bookmyshowApp.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private int seatNumber;
	private boolean isavalible ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "screen_id")
//	@Fetch(value=FetchMode.SELECT)
	@JsonBackReference
	private Screen screen;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
//	@JoinColumn(name = "ticket_id")
	private Ticket ticket;;
}
