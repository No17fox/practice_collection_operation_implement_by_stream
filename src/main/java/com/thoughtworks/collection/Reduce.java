package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return this.arrayList.stream().max(Comparator.comparing(Integer::valueOf)).get();
    }

    public double getMinimum() {
        return this.arrayList.stream().min(Comparator.comparing(Integer::valueOf)).get();
    }

    public double getAverage() {
        return this.arrayList.stream().collect(Collectors.averagingDouble(Integer::valueOf));
    }

    public double getOrderedMedian() {
        int medianPosition = this.arrayList.size() / 2;
        if (0 == this.arrayList.size() % 2) {
            return (this.arrayList.get(medianPosition - 1) + this.arrayList.get(medianPosition)) / 2.0;
        }
        return this.arrayList.get(medianPosition);
    }

    public int getFirstEven() {
        return this.arrayList.stream().filter(item -> 0 == item % 2).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        return this.arrayList.indexOf(this.getFirstEven());
    }

    public boolean isEqual(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>(this.arrayList);
        list.retainAll(arrayList);
        return list.size() == this.arrayList.size();
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink<Integer> singleLink) {
        this.arrayList.forEach(singleLink::addTailPointer);
        return this.getOrderedMedian();
    }

    public int getLastOdd() {
        List<Integer> oddList = this.arrayList.stream()
                .filter(i -> 1 == i % 2)
                .collect(Collectors.toList());
        return oddList.get(oddList.size() - 1);
    }

    public int getIndexOfLastOdd() {
        return this.arrayList.indexOf(this.getLastOdd());
    }
}
