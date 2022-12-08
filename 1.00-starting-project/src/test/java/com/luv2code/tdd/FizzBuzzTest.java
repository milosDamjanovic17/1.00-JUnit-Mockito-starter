package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

     // if number is divisible by 3, write Fizz

     // if number is divisible by 5, write Buzz

     // if number is divisible by 3 & 5, write FizzBuzz

     // if number is NOT divisible by 3 or 5, write the number


     @Test
     @DisplayName("Divisible by three")
     @Order(1)
    void testForDivisibleByThree(){

         String expected = "Fizz";

         assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    @Test
    @DisplayName("Divisible by five")
    @Order(2)
    void testForDivisibleByFive(){

         String expected = "Buzz";

         assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");

    }

    @Test
    @DisplayName("Divisible by three and five")
    @Order(3)
    void testForDivisibleByThreeAndFive(){

         String expected = "FizzBuzz";

         assertEquals(expected, FizzBuzz.compute(15),"Should return FizzBuzz");

    }

    @Test
    @DisplayName("Not Divisible by three or five")
    @Order(4)
    void testForNotDivisibleByThreeOrFive(){

         String expected = "1";

        assertEquals(expected, FizzBuzz.compute(1), "Should return 1");

    }


 }
