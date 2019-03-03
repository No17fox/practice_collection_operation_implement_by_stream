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
        List<Integer> evenElements = new ArrayList<>();
        for (int element : array) {
            if (0 == element % 2) {
                evenElements.add(element);
            }
        }
        return evenElements;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> commonElements = new ArrayList<>();
        for (int i : firstArray) {
            for (int j : secondArray) {
                if (i == j) {
                    commonElements.add(i);
                }
            }
        }
        return commonElements;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(firstArray));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(secondArray));
        firstList.addAll(secondList);
        return firstList.stream().distinct().collect(Collectors.toList());
    }
}
