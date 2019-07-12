package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_is_1() {
        //given
        int num=1;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result= fizzBuzz.coverto(num);
        //then
        Assertions.assertEquals("1",result);

    }
    @Test
    public void should_return_3_when_is_Fizz() {
        //given
        int num=3;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result= fizzBuzz.coverto(num);
        //then
        Assertions.assertEquals("Fizz",result);

    }
    @Test
    public void should_return_6_when_is_Fizz() {
        //given
        int num=6;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result= fizzBuzz.coverto(num);
        //then
        Assertions.assertEquals("Fizz",result);

    }
    @Test
    public void should_return_5_when_is_Buzz() {
        //given
        int num=5;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result= fizzBuzz.coverto(num);
        //then
        Assertions.assertEquals("Buzz",result);

    }

    @Test
    public void should_return_10_when_is_Buzz() {
        //given
        int num=10;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result= fizzBuzz.coverto(num);
        //then
        Assertions.assertEquals("Buzz",result);

    }

}
