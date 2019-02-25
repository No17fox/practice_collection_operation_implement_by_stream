package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : this.array) {
            if (0 == integer % 2) {
                evenList.add(integer);
            }
        }
        return evenList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer integer : this.array) {
            if (0 == integer % 3) {
                filteredList.add(integer);
            }
        }
        return filteredList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer integer : firstList) {
            if (secondList.contains(integer)) {
                filteredList.add(integer);
            }
        }
        return filteredList;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer integer : this.array) {
            if (!filteredList.contains(integer)) {
                filteredList.add(integer);
            }
        }
        return filteredList;
    }
}