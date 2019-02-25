package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
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
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (0 == integer % 2) {
                evenList.add(integer);
            }
        }
        int medianPosition = evenList.size() / 2;
        if (0 == evenList.size() % 2) {
            return (double)(evenList.get(medianPosition) + evenList.get(medianPosition - 1)) / 2;
        }
        return evenList.get(medianPosition);
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
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            newArrayList.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return newArrayList;
    }
}
