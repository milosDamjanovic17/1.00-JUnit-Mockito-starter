package com.luv2code.tdd;

public class FizzBuzz {


    public static String compute(int x){

        StringBuilder result = new StringBuilder();

        if(x % 3 == 0){
           result.append("Fizz");
        }

        if(x % 5 == 0){
            result.append("Buzz");
        }

        if (result.isEmpty()){
           result.append(x);
        }

        return result.toString();
    }




/*    public static String compute(int x){

        if((x % 3 == 0) && (x % 5 == 0)){
            return "FizzBuzz";
        }
        else if (x % 3 == 0) {
            return "Fizz";
        }
        else if ( x % 5 == 0 ) {
            return "Buzz";
        }
        else {
            return Integer.toString(x);
        }

    }*/

}
