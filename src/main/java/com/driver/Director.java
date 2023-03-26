package com.driver;

public class Director {
    private String directorName;
    private int numberOfMovies;
    private double iMBDRatings;

//    public Director(){
//
//    }

    public Director(String directorName, int numberOfMovies, double iMBDRatings) {
        this.directorName = directorName;
        this.numberOfMovies = numberOfMovies;
        this.iMBDRatings = iMBDRatings;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public double getiMBDRatings() {
        return iMBDRatings;
    }

    public void setiMBDRatings(double iMBDRatings) {
        this.iMBDRatings = iMBDRatings;
    }
}
