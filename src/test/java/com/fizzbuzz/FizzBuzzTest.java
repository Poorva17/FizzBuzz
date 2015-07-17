package com.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz number;

    @Test
    public void shouldPrintFizz(){
        number=new FizzBuzz(3);

        String result=number.isMultipleOfThree();
        assertEquals("Fizz",result);
    }

    @Test
    public void shouldPrintBuzz(){
        number=new FizzBuzz(5);
        String result=number.isMultipleOfFive();
        assertEquals("Buzz",result);
    }


}
