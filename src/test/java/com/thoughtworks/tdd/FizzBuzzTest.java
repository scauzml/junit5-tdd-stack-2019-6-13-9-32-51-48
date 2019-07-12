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
    public void should_return_Buzz_when_num_is_5() {
        //given
        int num=5;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result= fizzBuzz.coverto(num);
        //then
        Assertions.assertEquals("Buzz",result);

    }

    @Test
    public void should_return_Buzz_when_num_is_10() {
        //given
        int num=10;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result= fizzBuzz.coverto(num);
        //then
        Assertions.assertEquals("Buzz",result);

    }

    @Test
    public void should_return_7_when_is_Whizz() {
        //given
        int num=7;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result= fizzBuzz.coverto(num);
        //then
        Assertions.assertEquals("Whizz",result);

    }
    @Test
    public void should_return_14_when_is_7() {
        //given
        int num=14;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result= fizzBuzz.coverto(num);
        //then
        Assertions.assertEquals("Whizz",result);

    }
    @Test
    public void should_return_FizzBuzz_when_num_is_3_or_5() {
        //given
        int num=15;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result= fizzBuzz.coverto(num);
        //then
        Assertions.assertEquals("FizzBuzz",result);

    }

}
