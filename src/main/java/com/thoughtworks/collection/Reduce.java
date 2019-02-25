package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int maximum = this.arrayList.get(0);
        for (Integer integer : this.arrayList) {
            maximum = (integer.compareTo(maximum) > 0) ? integer : maximum;
        }
        return maximum;
    }

    public double getMinimum() {
        int minimum = this.arrayList.get(0);
        for (Integer integer : this.arrayList) {
            minimum = (integer.compareTo(minimum) < 0) ? integer : minimum;
        }
        return minimum;
    }

    public double getAverage() {
        double summary = 0;
        for (Integer integer : this.arrayList) {
            summary += integer;
        }
        return summary / this.arrayList.size();
    }

    public double getOrderedMedian() {
        int medianPosition = this.arrayList.size() / 2;
        if (0 == this.arrayList.size() % 2) {
            return (double)(this.arrayList.get(medianPosition - 1) + this.arrayList.get(medianPosition)) / 2;
        }
        return this.arrayList.get(medianPosition);
    }

    public int getFirstEven() {
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
