package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
//        List<Integer> list = new ArrayList<>();
//        while (number - this.random.nextInt(3) > 0) {
//            number -= this.random.nextInt(3);
//            list.add(number);
//        }
//        return list;
        int interval = this.random.nextInt(3);
        return Stream.iterate(number - interval, i -> i - interval)
                .limit(number / interval)
                .collect(Collectors.toList());
    }
}
