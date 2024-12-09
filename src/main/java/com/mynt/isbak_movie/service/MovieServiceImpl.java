package com.mynt.isbak_movie.service;

import com.mynt.isbak_movie.model.Genre;
import com.mynt.isbak_movie.model.Movie;
import com.mynt.isbak_movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;
    public void MovieService(MovieRepository movieRepository){
        this.movieRepository= movieRepository;
        System.out.println("Test commit");
    }


    @Override
    public List<Movie> getMoviesByYearReleased(int yearReleased) {
        return movieRepository.getMoviesByYearReleased(yearReleased);
    }

    @Override
    public List<Movie> findAllByOrderByYearReleasedAsc() {
        return movieRepository.findAllByOrderByYearReleasedAsc();
    }

//    @Override
//    public List<Movie> getByGenreAndIsSequel(Genre genre, boolean isSequel){
//        return movieRepository.getByGenreAndIsSequel();
//    }
/*
    public List<Movie> getByGenreAndIsSequel(Genre genre, boolean isSequel){
        List<Movie> movieL = new ArrayList<>();
        List<Movie> resultlist = new ArrayList<>();

        movieRepository.findAll().forEach(movie -> movieL.add(movie));

        for (Movie movie: movieL){
            if (movie.getIsSequel() == isSequel && movie.getGenre().contains(genre)){
                resultlist.add(movie);
            }
        }
        return resultlist;
    }
*/


}
