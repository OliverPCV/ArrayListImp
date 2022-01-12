package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    ArrayList list = new ArrayList();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(1);
    list.add(6);
    list.add(7);
    list.printArray();

    list.set(1, 5); // změní dvojku na pětku

    System.out.println("Empty question mark: "+ list.isEmpty());
    System.out.println("IndexOf: " + list.indexOf(3));
    System.out.println("Number from position 3: " + list.get(3));
    System.out.println("Velikost údu pole: " + list.size());
    System.out.println("Contains number 4 question mark: " + list.contains(4));
    System.out.println("Contains number 12 question mark: " + list.contains(12));
    System.out.println(list.lastIndexOf(1));

    }
}
