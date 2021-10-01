package com.example.awtExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        Set<Integer> union = new HashSet<>();
        union.addAll(squares);
        union.addAll(cubes);
        System.out.println(union.size());
        Set<Integer> interSection = new HashSet<>(squares);
        interSection.retainAll(cubes);
        System.out.println(interSection);
        for (int i : interSection) {
            System.out.println(i + " is square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String > words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divide = new HashSet<>();
        String [] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divide.addAll(Arrays.asList(divineWords));

        System.out.println("nature -divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divide);
        System.out.println(diff1);

        System.out.println("divine - nature");
        Set<String > diff2 = new HashSet<>(divide);
        diff2.removeAll(nature);
        System.out.println(diff2);

        Set<String > unionTest = new HashSet<>(nature);
        unionTest.addAll(divide);
        Set<String> interSectionTest = new HashSet<>(nature);
        interSectionTest.retainAll(divide);

        System.out.println("Symmetric difference");
        unionTest.removeAll(interSectionTest);
        System.out.println(unionTest);
    }
}
