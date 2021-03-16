package com.movie.demo.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.demo.dao.MovieDao;
import com.movie.demo.entities.Movie;
import com.movie.demo.repositories.MovieRepository;

@Service
public class MovieDaoImpl implements MovieDao {

	@Autowired
	MovieRepository movieRepository;

	@Override
	public Movie peristMovieData(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepository.save(movie);
	}

	@Override
	public List<Movie> getAllMoviesList() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public Movie updateMovieAsWatched(Long id) {
		// TODO Auto-generated method stub
		Optional<Movie> movieData = movieRepository.findById(id);
		if (movieData.isPresent()) {
			Movie movie = movieData.get();
			movie.setWatched(true);
			return peristMovieData(movie);
		}
		return null;
	}

	@Override
	public void deleteMovieData(Long id) {
		// TODO Auto-generated method stub
		movieRepository.deleteById(id);
	}

	@Override
	public List<Movie> getALLWatchedMovieList() {
		// TODO Auto-generated method stub
		return movieRepository.findAllWatchedMovies();
	}

}
