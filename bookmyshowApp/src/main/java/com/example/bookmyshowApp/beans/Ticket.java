package com.example.bookmyshowApp.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String movieName;
	private String cinemaHallName;
	private LocalDate bookDatedate;
	private String screenName;
	private String city;
	@OneToMany(mappedBy = "screen",  cascade = CascadeType.ALL)
	//@JsonIgnore
	@Fetch(value=FetchMode.SELECT)
//	@JsonManagedReference
	private List<Seat> seats= new ArrayList<>();
}
