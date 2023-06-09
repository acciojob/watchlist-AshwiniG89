package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public void addMovie(Movie movie){
        movieRepository.saveMovie(movie);
    }
    public void addDirector(Director director){
        movieRepository.saveDirector(director);
    }

    public void createMovieDirectorPair(String movie,String director){
        movieRepository.saveMovieDirectorPair(movie,director);
    }
    public Movie findMovie(String movieName){
       return movieRepository.findMovie(movieName);
    }
    public Director findDirector(String director){
      return movieRepository.findDirector(director);
    }

    public List<String> findMoviesFromDirector(String director){
        return movieRepository.findMoviesByDirector(director);
    }
    public List<String> findAllMovies(){
        return movieRepository.findAllMovie();
    }
    public void deleteDirector(String director){
        movieRepository.deleteDirector(director);
    }
    public void deleteAllDirectors(){
        movieRepository.deleteAllDirector();
    }

}
