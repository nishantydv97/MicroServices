package com.movieratingservices.movieratingservices.resources;

import com.movieratingservices.movieratingservices.models.Rating;
import com.movieratingservices.movieratingservices.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class MovieRating {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }
    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String movieId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1234",4),
                new Rating("1235",3)
        );
        UserRating userRating =new UserRating();
        userRating.setUserRatings(ratings);
        return  userRating;
    }
}
