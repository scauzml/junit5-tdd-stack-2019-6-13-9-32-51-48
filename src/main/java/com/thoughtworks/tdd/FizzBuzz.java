package com.thoughtworks.tdd;

public class FizzBuzz {

    public  String coverto(Integer num) {
        String result=num.toString();
       if(num%5==0){
           return result = "Buzz";
       }
        if (num % 3 == 0) {
            return  result="Fizz";
        }
        return result;
    }
}
