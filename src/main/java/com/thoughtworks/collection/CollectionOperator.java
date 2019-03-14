package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if (left < right) {
            return Stream.iterate(left, i -> i + 1).limit(right - left + 1).collect(Collectors.toList());
        } else {
            return Stream.iterate(left, i -> i - 1).limit(left - right + 1).collect(Collectors.toList());
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = this.getListByInterval(left, right);
        return list.stream().filter(item -> 0 == item % 2).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(item -> 0 == item % 2).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        return Arrays.stream(secondArray)
                .filter(list::contains)
                .boxed()
                .collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(firstArray));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(secondArray));
        firstList.addAll(secondList);
        return firstList.stream().distinct().collect(Collectors.toList());
    }
}
