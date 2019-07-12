package com.thoughtworks.tdd;

public class FizzBuzz {

    public  String coverto(Integer num) {
        String result=num.toString();
        if (num % 3 == 0) {
            result="Fizz";
        }
        return result;
    }
}
