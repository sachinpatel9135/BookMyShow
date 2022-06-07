package com.example.bookmyshowApp.ctrl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmyshowApp.Repo.MovieRepo;
import com.example.bookmyshowApp.beans.Movie;
import com.example.bookmyshowApp.service.MovieService;

@RestController
public class MovieCtrl {

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieRepo repo;

	@GetMapping("/movies")
	public List<Movie> getMovies() {
		return movieService.getMovies();
	}
	
	@GetMapping("/movieName/{movieName}")
	public List<Movie> findByMovieName(@PathVariable("movieName") String movieName){
		return movieService.findByMovieName(movieName);
	}
	
	@GetMapping("/movieGenre/{genre}")
	public List<Movie> findByGenre(@PathVariable("genre") String genre){
		return repo.findByGenre(genre);
	}
	
	@GetMapping("/movieLanguage/{language}")
	public List<Movie> findByLanguage(@PathVariable("language") String language){
		return repo.findByLanguage(language);
	}
	
	@GetMapping("/movieDate/{releaseDate}")
	public List<Movie> findByReleaseDate(@PathVariable("releaseDate")  @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate releaseDate){
		return repo.findByReleaseDate(releaseDate);
	}
	
	@PostMapping("/movie")
	public Movie createMovie(@RequestBody Movie movie) {
		return repo.save(movie);
	}
}
