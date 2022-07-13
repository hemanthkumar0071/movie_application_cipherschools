package com.example.demo.movies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	
	
	 List<Movie> movies = new ArrayList<>(Arrays.asList(
				new Movie("avengers","avengers endgame","watch this movie to know how earth saved from thanos."),
				new Movie("kgf","kgf chapter 2","very bad movie."),
				new Movie("karate","karate kid 2","a kid from newyork shifts to china due to her mom job")
			
				));
	 public List<Movie> getAllMovies(){
		 //return movies;
		 ArrayList<Movie> moviesarr = new ArrayList<>();
		 movieRepository.findAll().forEach(moviesarr::add);
		 
		 return moviesarr;
		
	}
	 
	public Optional<Movie> getMovie(String id) {
		//return 
				//movies.stream().filter(mov->mov.getId().equals(id))
				//.findFirst().get();
		return movieRepository.findById(id);
		
		 
	}
	
	//public void addMovie(Movie m) {
		//movies.add(m);
		
	//}
	
	public void addMovie(Movie m) {
		movieRepository.save(m);
		
	}
	
	public void updateMovie(Movie mov, String id) {
		movieRepository.save(mov);
		
	}
	
	public void deleteMovie(String id) {
		movieRepository.deleteById(id);
	}
	
	
	
	
}
