package com.movie.demo.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.movie.demo.dao.MovieDao;
import com.movie.demo.dao.impl.MovieDaoImpl;
import com.movie.demo.entities.Movie;
import com.movie.demo.service.impl.MovieServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class MovieServiceImplTests { 
	
	@InjectMocks
	MovieServiceImpl movieServiceImpl;
	
	@Mock
	MovieService movieService;
	
	@Mock
	MovieDao MovieDao;
	
	@Mock
	MovieDaoImpl movieDaoImpl;
	
	@Test
	public void addMovieTest() {
		
		Movie movie= new Movie();
		
		movie.setId((long) 1233);
		movie.setTittle("The Avengers");
		movie.setWatched(true);
		movie.setMovieUrl("https://i.chzbgr.com/full/5569379584/hA96709E0/");
		movie.setComment("New York blows up in this!");
		
		//PowerMockito.doNothing().when(movie);
		movieService.addMovie(movie);
		//MovieDao.peristMovieData(movie);
		movieDaoImpl.peristMovieData(movie);
	}
	
	@Test
	public void updateWatchedMovieTest() {
		//PowerMockito.when(movie);
		movieService.deleteMovie((long) 235);
	}
	
	@Test
	public void updateWatchedMovie() {
		
		Movie movie= new Movie();
		movie.setWatched(true);
		movieService.updateWatchedMovie((long) 562);

		}
	
	@Test
	public void deleteMovieTest() {
		movieService.deleteMovie((long) 562);
	}

	
}










