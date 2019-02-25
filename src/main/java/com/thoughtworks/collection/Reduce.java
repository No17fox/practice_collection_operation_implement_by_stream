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
        for (Integer integer : this.arrayList) {
            if (0 == integer % 2) {
                return integer;
            }
        }
        return -1;
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
        boolean result = true;
        for (Integer integer : this.arrayList) {
            result = result && arrayList.contains(integer);
        }
        return result;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
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
