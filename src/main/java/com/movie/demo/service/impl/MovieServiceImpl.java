package com.movie.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.demo.dao.MovieDao;
import com.movie.demo.entities.Movie;
import com.movie.demo.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDao movieDao;

	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieDao.peristMovieData(movie);
	}

	@Override
	public List<Movie> getAllMovie() {
		// TODO Auto-generated method stub
		return movieDao.getAllMoviesList();
	}

	@Override
	public Movie updateWatchedMovie(Long id) {
		// TODO Auto-generated method stub
		return movieDao.updateMovieAsWatched(id);
	}

	@Override
	public void deleteMovie(Long id) {
		// TODO Auto-generated method stub
		movieDao.deleteMovieData(id);
	}

	@Override
	public List<Movie> getAllWatchedMovies() {
		// TODO Auto-generated method stub
		return movieDao.getALLWatchedMovieList();
	}

}
