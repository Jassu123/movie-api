package com.movie.demo.service;

import java.util.List;

import com.movie.demo.entities.Movie;

public interface MovieService {

	public Movie addMovie(Movie movie);

	public List<Movie> getAllMovie();

	public Movie updateWatchedMovie(Long id);

	public void deleteMovie(Long id);

	public List<Movie> getAllWatchedMovies();
}
