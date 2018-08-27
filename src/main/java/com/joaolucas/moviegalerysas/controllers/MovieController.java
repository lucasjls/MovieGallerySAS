package com.joaolucas.moviegalerysas.controllers;

import com.joaolucas.moviegalerysas.models.Movie;
import com.joaolucas.moviegalerysas.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/templates")
public class MovieController {

    @Autowired
    MovieServices movieServices;

    public MovieController(MovieServices movieServices){
        this.movieServices = movieServices;
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/pupularmovies", method = RequestMethod.GET)
    public List<Movie> getPopularMovies(){

        return movieServices.getPopularMovies();
    }

}