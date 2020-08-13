package com.movieinfoservices.movieinfoservices.resources;

import com.movieinfoservices.movieinfoservices.models.Movies;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieResourceController {
    @RequestMapping("/{movieId}")
    public Movies getMoviesInfo(@PathVariable("movieId") String movieId){
        return new Movies(movieId,"new Transformer");
    }
}
