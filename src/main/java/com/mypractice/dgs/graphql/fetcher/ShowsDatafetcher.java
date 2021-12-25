package com.mypractice.dgs.graphql.fetcher;

import com.mypractice.dgs.graphql.DataDto;
import com.mypractice.dgs.graphql.dto.Show;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class ShowsDataFetcher {


    @DgsQuery
    public List<Show> shows(@InputArgument String titleFilter) {
        if(titleFilter == null) {
            return DataDto.shows;
        }
        return DataDto.shows.stream().filter(s -> s.getTitle().contains(titleFilter)).collect(Collectors.toUnmodifiableList());
    }
}

