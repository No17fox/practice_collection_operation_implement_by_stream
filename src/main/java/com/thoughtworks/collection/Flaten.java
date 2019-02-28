package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> flatenedList = new ArrayList<>();
        for (Integer[] integers : this.array) {
            flatenedList.addAll(Arrays.asList(integers));
        }
        return flatenedList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        return transformToOneDimesional().stream().distinct().collect(Collectors.toList());
    }
}
