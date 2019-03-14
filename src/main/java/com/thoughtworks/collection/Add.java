package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        return Stream.iterate(leftBorder, i -> i + 1)
                .limit(rightBorder - leftBorder + 1)
                .filter(item -> 0 == item % 2)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        return Stream.iterate(leftBorder, i -> i + 1)
                .limit(rightBorder - leftBorder + 1)
                .filter(item -> 1 == item % 2)
                .mapToInt(Integer::valueOf)
                .sum();

    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().reduce(0, (acc, cur) -> acc + cur * 3 + 2);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream()
                .map(integer -> 0 == integer % 2 ? integer : integer * 3 + 2)
                .collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> 1 == item % 2).reduce(0, (acc, cur) -> acc + cur * 3 + 5);
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenIndexList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i = i + 2) {
            evenIndexList.add(arrayList.get(i));
        }
        int medianPosition = evenIndexList.size() / 2;
        if (0 == evenIndexList.size() % 2) {
            return (evenIndexList.get(medianPosition) + evenIndexList.get(medianPosition - 1)) / 2.0;
        }
        return evenIndexList.get(medianPosition);
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int summaryOfEvenIndexElements = 0;
        for (int i = 0; i < arrayList.size(); i = i + 2) {
            summaryOfEvenIndexElements += arrayList.get(i);
        }
        return summaryOfEvenIndexElements / Math.ceil(arrayList.size() / 2.0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return (0 == specialElment % 2) && arrayList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> 0 == item % 2).distinct().collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evens = arrayList.stream().filter(item -> 0 == item % 2).collect(Collectors.toList());
        List<Integer> odds = arrayList.stream().filter(item -> 1 == item % 2).collect(Collectors.toList());
        Collections.sort(evens);
        odds.sort(Collections.reverseOrder());
        evens.addAll(odds);
        return evens;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            newArrayList.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return newArrayList;
    }
}
