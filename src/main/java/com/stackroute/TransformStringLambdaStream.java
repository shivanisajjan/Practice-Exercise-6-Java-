package com.stackroute;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransformStringLambdaStream {
    public String getString(List<Integer> li) {
        Stream<Integer> stream = li.parallelStream();
        String s = stream.map(i -> foreach(i)).collect(Collectors.joining(","));
        return s;
    }
    private String  foreach(Integer i) {
        if(i % 2 == 0) {
            return "e"+i.toString();
        } else {
            return "o"+i.toString();
        }
    }
}
