package com.example.logic;

import java.util.List;

public class AverageCalculator {

    public double calculateAverage(List<? extends Number> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The list of numbers must not be null or empty");
        }

        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        return sum / numbers.size();
    }
}
