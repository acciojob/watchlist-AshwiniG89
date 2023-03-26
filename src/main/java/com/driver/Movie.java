package com.driver;

public class Movie {
    private String name;
    private int durationInMinutes;
    private double imdbRating;

//    public Movie(){
//
//    }

    public Movie(String name, int duration, double iMBDRating) {
        this.name = name;
        this.durationInMinutes = duration;
        this.imdbRating = iMBDRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int duration) {
        this.durationInMinutes = duration;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double iMBDRating) {
        this.imdbRating = iMBDRating;
    }
}
