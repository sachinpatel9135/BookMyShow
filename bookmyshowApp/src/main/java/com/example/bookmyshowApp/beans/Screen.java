package com.example.bookmyshowApp.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Screen {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String screenName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cinemaHall_id")
	@JsonBackReference
//	@Fetch(value=FetchMode.SELECT)
	private CinemaHall cinemaHallName;
	

	
	@OneToMany(mappedBy = "screen",  cascade = CascadeType.ALL)
	//@JsonIgnore
	@Fetch(value=FetchMode.SELECT)
	@JsonManagedReference
	private List<Seat> seats= new ArrayList<>();
	
}
