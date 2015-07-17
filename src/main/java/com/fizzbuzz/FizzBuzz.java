package com.fizzbuzz;


public class FizzBuzz {


    private int number;

    public FizzBuzz(int i) {
        number=i;


    }

    public String isMultipleOfThree() {
        if(number%3==0)
            return "Fizz";

        return null;
    }

    public String isMultipleOfFive() {
        if(number%5==0)
            return "Buzz";

        return null;
    }
}
