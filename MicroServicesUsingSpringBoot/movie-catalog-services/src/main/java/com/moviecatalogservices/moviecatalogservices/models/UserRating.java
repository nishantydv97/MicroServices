package com.moviecatalogservices.moviecatalogservices.models;

import java.util.List;

public class UserRating {
    public UserRating() {

    }

    private List<Rating> userRatings;
    public void setUserRatings(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }
    public List<Rating> getUserRatings(){
        return userRatings;
    }
}
