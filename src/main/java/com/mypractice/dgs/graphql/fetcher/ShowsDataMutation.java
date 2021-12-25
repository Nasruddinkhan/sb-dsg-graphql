package com.mypractice.dgs.graphql.fetcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mypractice.dgs.graphql.DataDto;
import com.mypractice.dgs.graphql.dto.Show;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class ShowsDataMutation {

    @DgsData(parentType = "Mutation", field = "addShow")
    public Show addShow(DataFetchingEnvironment dataFetchingEnvironment) {

        var input = dataFetchingEnvironment.getArgument("input");
        Show showInput = new ObjectMapper().convertValue(input, Show.class);
        Show show = new Show(showInput.getTitle(), showInput.getReleaseYear());
        System.out.println("Movie Title is " + showInput.getTitle() + " with " + showInput.getReleaseYear() + " release");
        DataDto.shows.add(show);
        return show;
    }
}
