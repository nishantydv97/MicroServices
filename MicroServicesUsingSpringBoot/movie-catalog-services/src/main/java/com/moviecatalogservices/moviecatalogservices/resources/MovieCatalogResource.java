package com.moviecatalogservices.moviecatalogservices.resources;

import com.moviecatalogservices.moviecatalogservices.models.CatalogItems;
import com.moviecatalogservices.moviecatalogservices.models.Movies;
import com.moviecatalogservices.moviecatalogservices.models.Rating;
import com.moviecatalogservices.moviecatalogservices.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private WebClient.Builder webClientBuilder;
    @RequestMapping("/{userId}")
    public List<CatalogItems> getCatalog(@PathVariable("userId") String userid){

        //RestTemplate restTemplate = new RestTemplate();
        /*
        List<Rating> ratings = Arrays.asList(
                new Rating("1234",4),
                new Rating("1235",3)
        );
         */
        UserRating ratings = restTemplate.getForObject("http://moving-rating-service/ratings/users/"+userid, UserRating.class);
        return ratings.getUserRatings().stream().map(rating -> {
            System.out.println("rating is "+ rating.getMovieId());
            Movies movies = restTemplate.getForObject("http://movie-info-services/movies/" + rating.getMovieId(), Movies.class);
            /*
            for reactive Asynchronous programming
            Movies movies = webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8082/movies/" + rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movies.class)
                    .block();

             */
            return new CatalogItems(movies.getName(), "Desc", rating.getRate());
        }).collect(Collectors.toList());

    }
}
