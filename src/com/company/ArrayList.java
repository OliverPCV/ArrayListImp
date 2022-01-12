package com.company;

import java.util.Arrays;

public class ArrayList {

    private final int arrLength = 0;
    private int[] array = new int[arrLength];

    /**
     *
     * TODO: returns size of an array
     */
    public int size(){
        return  array.length;
    }

    /**
     *
     * TODO: Add number
     */
    public void add(int num) {
        int[] cloneArr = new int[array.length + 1];

        System.arraycopy(array, 0, cloneArr, 0, array.length);
        cloneArr[cloneArr.length - 1] = num;
        array = cloneArr;
    }

    public void printArray(){
        System.out.println(Arrays.toString(array));
    }

    /**
     *
     * TODO: Is array empty?
     */
    public boolean isEmpty() {
        return array.length == 0;
    }
    /**
     *
     * TODO: position of given number
     */
    public int indexOf(int num) {
        int indexOf = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == num)
                indexOf = i;
        }
        return indexOf;
    }

    /**
     *
     * TODO: converts the ArrayList into an array
     */
    public int[] toArray() {
        int[] toArray;
        toArray = array;
        return toArray;
    }


    /**
     *
     * TODO: returns a number from a given position
     */
    public int get(int index) {
        return array[index];
    }

    /**
     *
     * TODO: changes the value of a given index to an input numver
     */
    public void set(int index, int num) {
        array[index] = num;
    }

    /**
     *
     * TODO: Does Array contains input number?
     */
    public boolean contains(int num) {
        for (int j : array)
            if (j == num)
                return true;
        return false;
    }


    /**
     *
     * TODO: returns the index of the last number, potřebuju najít poslední číslo duplikátu v poli
     */
    public int lastIndexOf(int number) {
        int counter = 0;
        int[] duplicites = new int[counter];

        /*for (int i = 0; i < array.length; i++) {
            if (i == number){
                counter++;
                for (int j = 0; j < duplicites.length; j++) {
                    duplicites[j] = i;
                    System.out.println(i);
                }
            }
        }*/

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;

                    System.out.println(array[i]);
                    System.out.println(counter);
                }
            }
        }
        return 0;
    }

}

