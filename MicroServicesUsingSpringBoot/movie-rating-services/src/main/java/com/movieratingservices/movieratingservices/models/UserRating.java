package com.movieratingservices.movieratingservices.models;

import java.util.List;

public class UserRating {
    private List<Rating> userRatings;
    public void setUserRatings(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }
    public List<Rating> getUserRatings(){
        return userRatings;
    }
}
