package com.movie.demo.dao;

import java.util.List;

import com.movie.demo.entities.Movie;

public interface MovieDao {

	public Movie peristMovieData(Movie movie);

	public List<Movie> getAllMoviesList();

	public Movie updateMovieAsWatched(Long id);

	public void deleteMovieData(Long id);

	public List<Movie> getALLWatchedMovieList();

}
