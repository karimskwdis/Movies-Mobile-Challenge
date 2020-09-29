package com.swvl.swvlchallenge.ui.main;

import com.swvl.swvlchallenge.data.model.Movie;

/**
 * Created by Karim Abdell Salam on 29,September,2020
 */
public interface MainNavigator {
    void startSearching(String action, String query);

    void openMovieActivity(Movie movie);
}
