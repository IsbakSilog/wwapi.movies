package com.mynt.isbak_movie.controller;

import com.mynt.isbak_movie.model.Genre;
import com.mynt.isbak_movie.model.Movie;
import com.mynt.isbak_movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movies/{yearReleased}")
    public List<Movie> getMoviesByYearReleased(@PathVariable int yearReleased){
        return movieService.getMoviesByYearReleased(yearReleased);
    }

    @GetMapping("/movies")
    public List<Movie> findAllByOrderByYearReleasedAsc(){
        return movieService.findAllByOrderByYearReleasedAsc();
    }
//    @GetMapping("/{genre}/{isSequel}")
//    public List<Movie> getByGenreAndIsSequel(@PathVariable Genre genre, @PathVariable boolean isSequel) {
//        return movieService.getByGenreAndIsSequel(genre, isSequel);
//    }
}
