package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        if (1 == leftBorder % 2) {
            leftBorder++;
        }
        if (1 == rightBorder % 2) {
            rightBorder--;
        }
        int summary = 0;
        while (leftBorder <= rightBorder) {
            summary += leftBorder;
            leftBorder += 2;
        }
        return summary;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        if (0 == leftBorder % 2) {
            leftBorder++;
        }
        if (0 == rightBorder % 2) {
            rightBorder--;
        }
        int summary = 0;
        while (leftBorder <= rightBorder) {
            summary += leftBorder;
            leftBorder += 2;
        }
        return summary;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int summary = 0;
        for (Integer integer : arrayList) {
            summary += integer * 3 + 2;
        }
        return summary;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (1 == integer % 2) {
                newArrayList.add(integer * 3 + 2);
            } else {
                newArrayList.add(integer);
            }
        }
        return newArrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int summary = 0;
        for (Integer integer : arrayList) {
            if (1 == integer % 2) {
                summary += integer * 3 + 5;
            }
        }
        return summary;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenIndexList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i = i + 2) {
            evenIndexList.add(arrayList.get(i));
        }
        int medianPosition = evenIndexList.size() / 2;
        if (0 == evenIndexList.size() % 2) {
            return (double)(evenIndexList.get(medianPosition) + evenIndexList.get(medianPosition - 1)) / 2;
        }
        return evenIndexList.get(medianPosition);
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int summayOfEven = 0;
        int numberOfEven = 0;
        for (Integer integer : arrayList) {
            if (0 == integer % 2) {
                summayOfEven += integer;
                numberOfEven++;
            }
        }
        return summayOfEven / numberOfEven;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return (0 == specialElment % 2) && arrayList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if ((0 == integer % 2) && !newArrayList.contains(integer)) {
                newArrayList.add(integer);
            }
        }
        return newArrayList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (0 == integer % 2) {
                evens.add(integer);
            } else {
                odds.add(integer);
            }
        }
        Collections.sort(evens);
        odds.sort(Collections.reverseOrder());
        List<Integer> sortedList = new ArrayList<>(evens);
        sortedList.addAll(odds);
        return sortedList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            newArrayList.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return newArrayList;
    }
}
