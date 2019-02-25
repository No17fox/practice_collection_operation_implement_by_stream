package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        list.add(left);
        while (left != right) {
            if (left < right) {
                left++;
            } else {
                left--;
            }
            list.add(left);
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = this.getListByInterval(left, right);
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : list) {
            if (0 == integer % 2) {
                evenList.add(integer);
            }
        }
        return evenList;
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
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
