package com.mynt.isbak_movie.service;

import com.mynt.isbak_movie.model.Genre;
import com.mynt.isbak_movie.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getMoviesByYearReleased (int yearReleased);
    List<Movie> findAllByOrderByYearReleasedAsc();
   //List<Movie> getByGenreAndIsSequel(Genre genre, boolean isSequel);



    }

