package com.example.logic;

public class Sum {

    public int sum(double a, double b) {
        int sum = 0;
        if (a % 1 != 0 || b % 1 != 0) {
            throw  new IllegalArgumentException("Phải nhập vào số nguyên!");
        } else  {
            sum = (int) (a + b);
        }
        return sum;
    }


}
