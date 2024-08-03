package com.example.logic;

public class GetElement {
    public int getElement(int[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        return array[index];
    }

}
