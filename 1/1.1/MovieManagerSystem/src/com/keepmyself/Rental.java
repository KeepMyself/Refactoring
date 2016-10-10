package com.keepmyself;

/**
 * Created by StudyForever on 2016/10/10.
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented){
        this._movie = movie;
        this._daysRented = daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }
}
