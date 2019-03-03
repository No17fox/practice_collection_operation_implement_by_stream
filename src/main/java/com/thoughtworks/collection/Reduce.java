package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
//        int maximum = this.arrayList.get(0);
//        for (Integer integer : this.arrayList) {
//            maximum = integer.compareTo(maximum) > 0 ? integer : maximum;
//        }
//        return maximum;
        return this.arrayList.stream().max(Comparator.comparing(Integer::valueOf)).get();
    }

    public double getMinimum() {
        return this.arrayList.stream().min(Comparator.comparing(Integer::valueOf)).get();
    }

    public double getAverage() {
//        double summary = 0;
//        for (Integer integer : this.arrayList) {
//            summary += integer;
//        }

//        double summary = this.arrayList.stream().reduce(0, (acc, cur) -> acc + cur);
//        return (double) summary / this.arrayList.size();

//        int summary = this.arrayList.stream().mapToInt(Integer::valueOf).sum();
//        return (double) summary / this.arrayList.size();

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
//        for (Integer integer : this.arrayList) {
//            if (0 == integer % 2) {
//                return integer;
//            }
//        }
//        return -1;
        return this.arrayList.stream().filter(item -> 0 == item % 2).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        for (Integer integer : this.arrayList) {
            if (0 == integer % 2) {
                return this.arrayList.indexOf(integer);
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
//        boolean result = true;
//        for (Integer integer : this.arrayList) {
//            result = result && arrayList.contains(integer);
//        }
//        return result;
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
        for (int i = this.arrayList.size() - 1; i < this.arrayList.size(); i--) {
            if (1 == this.arrayList.get(i) % 2) {
                return this.arrayList.get(i);
            }
        }
        return -1;
    }

    public int getIndexOfLastOdd() {
        for (int i = this.arrayList.size() - 1; i < this.arrayList.size(); i--) {
            if (1 == this.arrayList.get(i) % 2) {
                return i;
            }
        }
        return -1;
    }
}
