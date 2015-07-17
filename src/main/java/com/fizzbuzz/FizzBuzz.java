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

    public String isMultipleOfThreeAndFive() {

        if(number%3==0&&number%5==0)
            return "FizzBuzz";

        return null;
    }

    public String isNotMultipleOfThreeOrFive() {

        if(number%3!=0&&number%5!=0)
            return "Blah";

        return null;
    }
}
