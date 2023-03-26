package com.driver;

public class Movie {
    private String name;
    private int duration;
    private double iMBDRating;

    public Movie(){

    }

    public Movie(String name, int duration, double iMBDRating) {
        this.name = name;
        this.duration = duration;
        this.iMBDRating = iMBDRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getiMBDRating() {
        return iMBDRating;
    }

    public void setiMBDRating(double iMBDRating) {
        this.iMBDRating = iMBDRating;
    }
}
