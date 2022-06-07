package com.example.bookmyshowApp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmyshowApp.Repo.MovieRepo;
import com.example.bookmyshowApp.beans.Movie;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepo repo;
	
	
	public List<Movie> getMovies() {
		return repo.findAll();
	}
	
	public List<Movie> findByMovieName(String movieName){
		return repo.findByMovieName(movieName);
	}
	
	public List<Movie> findByGenre(String genre){
		return repo.findByGenre(genre);
	}
	public List<Movie> findByLanguage(String language){
		return repo.findByLanguage(language);
	}
	public List<Movie> findByReleaseDate(LocalDate releaseDate){
		return repo.findByReleaseDate(releaseDate);
	}

}
