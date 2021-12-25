package com.mypractice.dgs.graphql.dto;

public class Show {
    private  String title;
    private  Integer releaseYear;
    public Show(String title, Integer releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    public Show(){

    }
    public String getTitle() {
        return title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }
}
