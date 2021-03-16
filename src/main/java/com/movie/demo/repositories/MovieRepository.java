package com.movie.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movie.demo.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	@Query(value = "Select * from Movie where watched='true'", nativeQuery = true)
	List<Movie> findAllWatchedMovies();
}
