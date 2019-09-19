package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseLambdaStream {
    public List<String> toUpperCase(List<String> li) {
        List<String> al = li.stream().map(String::toUpperCase).collect(Collectors.toList());
        return al;
    }
}
