package com.stackroute;

import java.util.List;
import java.util.stream.Collectors;

public class ListAverage {

    public Double listAverage(List<Integer> li) {
        Double listaverage = li.stream()
                .collect(Collectors.averagingInt(p -> p));
        return listaverage;
    }
}
