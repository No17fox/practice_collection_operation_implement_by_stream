package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> flatenedList = new ArrayList<>();
        for (Integer[] integers : this.array) {
            for (Integer integer : integers) {
                flatenedList.add(integer);
            }
        }
        return flatenedList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> flatenedList = new ArrayList<>();
        for (Integer[] integers : this.array) {
            for (Integer integer : integers) {
                if (!flatenedList.contains(integer)) {
                    flatenedList.add(integer);
                }
            }
        }
        return flatenedList;
    }
}
