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
        throw new NotImplementedException();
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
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
        throw new NotImplementedException();
    }
}
