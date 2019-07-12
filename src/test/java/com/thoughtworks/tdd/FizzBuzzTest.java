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

}
