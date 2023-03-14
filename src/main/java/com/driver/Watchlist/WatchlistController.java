package com.driver.Watchlist;

import Movie.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class WatchlistController {
    //http://localhost:8080/watchlist
    @GetMapping("/watchlist")
    public List<Movie> getDirector(){
        return Arrays.asList(new Movie("ASD","Ashwu"));
    }
}
