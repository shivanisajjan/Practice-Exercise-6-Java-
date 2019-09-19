package com.stackroute;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStringLambdaStream {
    public List<String> search(List<String> li) {
        List<String> al= li.stream().filter((s) -> s.startsWith("a")).filter((s) -> s.length()==3).collect(Collectors.toList());;
        return al;
    }
}
