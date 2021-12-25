package com.mypractice.dgs.graphql;

import com.mypractice.dgs.graphql.dto.Show;

import java.util.ArrayList;
import java.util.List;

public class DataDto {
    private DataDto(){}
    public static List<Show> shows = new ArrayList<>();

    static {
        shows.add(new Show("Stranger Things", 2016));
        shows.add(new Show("Ozark", 2017));
        shows.add(new Show("The Crown", 2016));
        shows.add(new Show("Dead to Me", 2019));
        shows.add(new Show("Orange is the New Black", 2013));
    }
}
