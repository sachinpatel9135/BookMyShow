package com.example.bookmyshowApp.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CinemaHall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String cinemaHallName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "city_id")
//	@Fetch(value=FetchMode.SELECT)
	private City city;
	
	@ManyToMany(mappedBy = "cinemaHalls", cascade = CascadeType.ALL)
	@Fetch(value=FetchMode.SELECT)
	@JsonBackReference
	private List<Movie> movies = new ArrayList<>();
	
	@OneToMany(mappedBy = "cinemaHallName",  cascade = CascadeType.ALL)
	@Fetch(value=FetchMode.SELECT)
	@JsonManagedReference
	private List<Screen> screens= new ArrayList<>();
	
	

}
