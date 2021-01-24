package com.fizzbuzz.fizzbuzz;

import org.springframework.stereotype.Component;

@Component
public class Fizzbuzz {
    public String functionFizzBuzz(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }

        if (n % 5 == 0) {
            return "Buzz";
        }

        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        return String.valueOf(n);
    }
}
