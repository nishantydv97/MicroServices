package com.moviecatalogservices.moviecatalogservices.models;

public class CatalogItems {
    private String name;
    private String desc;
    private int rating;

    public CatalogItems(String name, String desc, int id) {
        this.name = name;
        this.desc = desc;
        this.rating = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisc() {
        return desc;
    }

    public void setDisc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
