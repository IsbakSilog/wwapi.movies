package com.mynt.isbak_movie.repository;
import com.mynt.isbak_movie.model.Genre;
import com.mynt.isbak_movie.model.Movie;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface MovieRepository  extends CrudRepository<Movie, Long>{

    List<Movie> getMoviesByYearReleased (int yearReleased);
    List<Movie> findAllByOrderByYearReleasedAsc();
   // List<Movie> getByGenreAndIsSequel(Genre genre, boolean isSequel);

    }

