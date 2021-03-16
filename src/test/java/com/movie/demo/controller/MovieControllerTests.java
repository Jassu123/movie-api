package com.movie.demo.controller;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.movie.demo.controllers.MovieController;
import com.movie.demo.entities.Movie;
import com.movie.demo.service.MovieService;

@RunWith(MockitoJUnitRunner.class)
public class MovieControllerTests {

	@InjectMocks
	MovieController movieController;
	
	@Mock
	MovieService movieService;
	
	@Before 
	public void init() { 
		movieService=mock(MovieService.class);
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testsaveMovie() {
		
		Movie movie= new Movie();
		
		movie.setId((long) 1233);
		movie.setTittle("The Avengers");
		movie.setWatched(true);
		movie.setMovieUrl("https://i.chzbgr.com/full/5569379584/hA96709E0/");
		movie.setComment("New York blows up in this!");
		movieController.saveMovie(movie);
	}
	
	@Test
	 public void testdeleteMovie() {
		movieController.deleteMovie((long) 123);
	 }

	@Test
	 public void updateMovieAsWatchedTest() {
		
		movieController.updateMovieAsWatched((long) 865);
	}
	
	
		
		
}

	
	
	
	
	
	
	
	
	
	
	