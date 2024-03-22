package ConditionCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.FizzBuzz;

public class FizzBuzzTest {
    @Test
    public void ShouldReturnExeptionIfIsInfThenone(){
        Assertions.assertThrows(IllegalArgumentException.class , ()-> FizzBuzz.fizzBuzz(0));
    }
    @Test
    public void ShouldReturnFizzIfDivisibleThree(){
        Assertions.assertEquals("Fizz",FizzBuzz.fizzBuzz(9));
    }
    @Test
    public void ShouldReturnBuzzIfDivisibleFive(){
        Assertions.assertEquals("Buzz",FizzBuzz.fizzBuzz(10));
    }
    @Test
    public void ShouldReturnFizzBuzzIfDivisibleThreeAndFive(){
        Assertions.assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(30));
    }
}
