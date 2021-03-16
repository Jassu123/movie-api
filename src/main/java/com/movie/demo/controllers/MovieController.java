package com.movie.demo.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.demo.entities.Movie;
import com.movie.demo.service.MovieService;

@RestController
@RequestMapping("api")
public class MovieController {

	@Autowired
	MovieService movieService;

	@PostMapping("/movies")
	public Movie saveMovie(@RequestBody Movie movie) {
		return movieService.addMovie(movie);
	}

	@GetMapping("/movies")
	public List<Movie> getAllMovies() {
		return movieService.getAllMovie();
	}

	@PutMapping("/movies/{id}")
	public Movie updateMovieAsWatched(@PathVariable("id") Long id) {
		return movieService.updateWatchedMovie(id);
	}
	
	@DeleteMapping("/movies/{id}")
	public void deleteMovie(@PathVariable("id") Long id) {
		 movieService.deleteMovie(id);
	}
	
	@GetMapping("/movies/watched")
	public List<Movie> getAllWatchedMovies(){
		return movieService.getAllWatchedMovies();
	}

}
