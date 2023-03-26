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

    @PostMapping("/add_movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity<>("New movie Added Successfully", HttpStatus.CREATED);
    }
    @PostMapping("/add_director")
    public ResponseEntity<String> addDirector(@RequestBody Director director){
        movieService.addDirector(director);
        return new ResponseEntity<>("New Director added Successfully",HttpStatus.CREATED);
    }
    @PutMapping("/add_director_movie_pair")
    public ResponseEntity<String> addMovieToDirectorList(@RequestParam String movie,@RequestParam String director){
        movieService.createMovieDirectorPair(movie,director);
        return new ResponseEntity<>("New Director list is created",HttpStatus.CREATED);
    }
    @GetMapping("/get_movie_by_name/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable String name){
        Movie movie = movieService.findMovie(name);
        return new ResponseEntity<>(movie,HttpStatus.CREATED);
    }
    @GetMapping("/get_director_by_name/{name}")
    public ResponseEntity<Director> getDirectorByName(@PathVariable String name){
        Director director = movieService.findDirector(name);
        return new ResponseEntity<>(director,HttpStatus.CREATED);
    }
    @GetMapping("/get_movies_by_director/{director}")
    public ResponseEntity<List<String>> getMovieNamesByDirector(@PathVariable String director){
        List<String> movies = movieService.findMoviesOfDirectors(director);
        return new ResponseEntity<>(movies,HttpStatus.CREATED);
    }
    @GetMapping("/get_all_movies")
    public ResponseEntity<List<String>> getAllMoviesList(){
        List<String> movies = movieService.findAllMovies();
        return new ResponseEntity<>(movies,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete_director_by_name")
    public ResponseEntity<String> deleteDirectorByName(@RequestParam String director){
        movieService.deleteDirector(director);
        return new ResponseEntity<>(director+"Removed Successfully",HttpStatus.CREATED);
    }
    @DeleteMapping("/delete_all_directors")
    public ResponseEntity<String> deleteAllDirectors(){
        movieService.deleteAllDirectors();
        return new ResponseEntity<>("All directors name deleted Successfully",HttpStatus.CREATED);
    }

}
