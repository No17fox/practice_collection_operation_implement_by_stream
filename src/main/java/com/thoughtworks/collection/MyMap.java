package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return this.array.stream().map(item -> item * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return this.array.stream().map(item -> this.letters[item - 1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        List<String> letterArray = new ArrayList<>();
        for (Integer number : array) {
            int firstLetterIndex = (number - 1) / this.letters.length;
            int secondLetterIndex = (number - 1) % this.letters.length;
            String letter;
            if (firstLetterIndex < 1) {
                letter = this.letters[secondLetterIndex];
            } else {
                letter = this.letters[firstLetterIndex - 1] + this.letters[secondLetterIndex];
            }
            letterArray.add(letter);
        }
        return letterArray;
    }

    public List<Integer> sortFromBig() {
        this.array.sort(Collections.reverseOrder());
        return this.array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(this.array);
        return this.array;
    }
}
