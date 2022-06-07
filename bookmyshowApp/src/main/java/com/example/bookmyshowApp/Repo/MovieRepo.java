package com.example.bookmyshowApp.Repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookmyshowApp.beans.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer>{
	
	List<Movie> findByMovieName(String movieName);
	
	List<Movie> findByGenre(String genre);
	List<Movie> findByLanguage(String language);
	List<Movie> findByReleaseDate(LocalDate releaseDate);
	

}
