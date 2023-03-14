package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Repository
public class MovieRepository {
    private HashMap<String,Movie>movieMap;
    private HashMap<String,Director>directorMap;
    private HashMap<String, List<String>>directorMoviesMap;

    public MovieRepository() {
        this.movieMap =new HashMap<String,Movie>();
        this.directorMap = new HashMap<String,Director>();
        this.directorMoviesMap = new HashMap<String, List<String>>();
    }

    public void saveMovie(Movie movie){
        movieMap.put(movie.getName(),movie);
    }
    public void saveDirector(Director director){
        directorMap.put(director.getDirectorName(),director);
    }

    public void saveMovieDirectorPair(String movie,String director){
        if(movieMap.containsKey(movie) && directorMap.containsKey(director)){
//            movieMap.put(movie,movieMap.get(movie));
//            directorMap.put(director,directorMap.get(director));
            List<String> currentMovies = new ArrayList<>();
            if(directorMoviesMap.containsKey(director)){
                currentMovies = directorMoviesMap.get(director);
                currentMovies.add(movie);
                directorMoviesMap.put(director,currentMovies);
            }
        }
    }
    public Movie findMovie(String movie){
        return movieMap.get(movie);
    }
    public Director findDirector(String director){
        return directorMap.get(director);
    }

    public List<String> findMoviesByDirector(String director) {
        List<String> movieList = new ArrayList<String>();
        if (directorMoviesMap.containsKey(director)) {
            movieList = directorMoviesMap.get(director);
        }
        return movieList;
    }

    public List<String> findAllMovie(){
        return new ArrayList<>(movieMap.keySet());
    }

    public void deleteDirector(String director){
        List<String> movies = new ArrayList<String>();
        if(directorMoviesMap.containsKey(director)){
            movies = directorMoviesMap.get(director);
            for(String movie:movies){
                if(movieMap.containsKey(movie)){
                    movieMap.remove(movie);
                }
            }
            directorMoviesMap.remove(director);
        }
        if(directorMap.containsKey(director)){
            directorMap.remove(director);
        }
     }
     public void deleteAllDirector(){
         HashSet<String> movieSet = new HashSet<String>();
         for(String director: directorMoviesMap.keySet()){
             for(String movie:directorMoviesMap.get(director)){
                 movieSet.add(movie);
             }
         }
         for(String movie:movieSet){
             if(movieMap.containsKey(movie)){
                 movieMap.remove(movie);
             }
         }
     }
}
