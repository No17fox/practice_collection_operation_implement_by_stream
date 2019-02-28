package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
//        List<Integer> evenList = new ArrayList<>();
//        for (Integer integer : this.array) {
//            if (0 == integer % 2) {
//                evenList.add(integer);
//            }
//        }
//        return evenList;
        return this.array.stream().filter(item -> 0 == item % 2).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return this.array.stream().filter(item -> 0 == item % 3).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> commonElements = new ArrayList<>(firstList);
        commonElements.retainAll(secondList);
        return commonElements;
    }

    public List<Integer> getDifferentElements() {
//        List<Integer> filteredList = new ArrayList<>();
//        for (Integer integer : this.array) {
//            if (!filteredList.contains(integer)) {
//                filteredList.add(integer);
//            }
//        }
//        return filteredList;
        return this.array.stream().distinct().collect(Collectors.toList());
    }
}