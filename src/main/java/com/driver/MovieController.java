package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity<>("New movie Added Successfully", HttpStatus.CREATED);
    }
    @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequestBody Director director){
        movieService.addDirector(director);
        return new ResponseEntity<>("New Director added Successfully",HttpStatus.CREATED);
    }
    @PutMapping("/add-movie-director-pair")
    public ResponseEntity<String> addMovieToDirectorPair(@RequestParam String movie,@RequestParam String director){
        movieService.createMovieDirectorPair(movie,director);
        return new ResponseEntity<>("New Director list is created",HttpStatus.CREATED);
    }
    @GetMapping("/get-movie-by-name/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable String name){
        Movie movie = movieService.findMovie(name);
        return new ResponseEntity<>(movie,HttpStatus.CREATED);
    }
    @GetMapping("/get-director-by-name/{name}")
    public ResponseEntity<Director> getDirectorByName(@PathVariable String name){
        Director director = movieService.findDirector(name);
        return new ResponseEntity<>(director,HttpStatus.CREATED);
    }
    @GetMapping("/get-movies-by-director/{director}")
    public ResponseEntity<List<String>> getMovieByDirectorName(@PathVariable String director){
        List<String> movies = movieService.findMoviesFromDirector(director);
        return new ResponseEntity<>(movies,HttpStatus.CREATED);
    }
    @GetMapping("/get-all-movies")
    public ResponseEntity<List<String>> getAllMoviesList(){
        List<String> movies = movieService.findAllMovies();
        return new ResponseEntity<>(movies,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-director-by-name")
    public ResponseEntity<String> deleteDirectorByName(@RequestParam String director){
        movieService.deleteDirector(director);
        return new ResponseEntity<>(director+"Removed Successfully",HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-all-directors")
    public ResponseEntity<String> deleteAllDirectors(){
        movieService.deleteAllDirectors();
        return new ResponseEntity<>("All directors name deleted Successfully",HttpStatus.CREATED);
    }

}
