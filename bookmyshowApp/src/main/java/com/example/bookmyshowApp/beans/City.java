package com.example.bookmyshowApp.beans;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class City {
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String street;
	private String city;
	private String pincode;
	private String country;

	@OneToMany(mappedBy = "city",  cascade = CascadeType.ALL)
	@JsonIgnore
	@Fetch(value=FetchMode.SELECT)
	private List<CinemaHall> cinemaHalls= new ArrayList<>();

}
