package com.example.logic;

public class Multiply {


    public int multiply(double a, double b) {
        int result = 0;
        if (a % 1 != 0 || b % 1 != 0) {
            throw  new IllegalArgumentException("Phải nhập vào số nguyên!");
        } else  {
            result = (int) (a * b);
        }
        return result;
    }

}
