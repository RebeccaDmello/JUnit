package com.finalexam.service;

public class FBService {

    /**
     * If number is divisible by 3, return "Fizz". If divisible by 5,
     * return "Buzz", and if divisible by both, return "FizzBuzz". Otherwise,
     * return the number itself.
     *
     * Throw IllegalArgumentException for values < 1
     */
    public String fBuzz(int number) {

            if(number <= 0) {
                throw new IllegalArgumentException("Invalid Value");
            }
            else {
                if (number % 3 == 0 && number % 5 == 0) {
                    return "FizzBuzz";
                } else if (number % 3 == 0) {
                    return "Fizz";
                } else if (number % 5 == 0) {
                    return "Buzz";
                } else {
                    return number + "";
                }
            }
    }
}
