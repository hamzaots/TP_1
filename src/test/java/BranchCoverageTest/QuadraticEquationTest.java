package BranchCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.BinarySearch;
import org.src.Palindrome;
import org.src.QuadraticEquation;

public class QuadraticEquationTest {
    @Test
    public void ShouldReturnExceptionIfaIsNull(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> QuadraticEquation.solve(0,1,1));
    }
    @Test
    void shouldReturnOneSolutionIfDeltaIsNull(){
        Double[] t={2.0};
        Assertions.assertArrayEquals(t,QuadraticEquation.solve(1,-4,4));
    }

    @Test
    void shouldReturntwoSolutionsIfDeltaIsPositive(){
        Double[] t={1.0,0.5};
        Assertions.assertEquals(QuadraticEquation.solve(2,-3,1),t);
    }
    @Test

    void shouldReturNullIfDestaIsNegative(){
        Double[] t=null;
        Assertions.assertEquals(QuadraticEquation.solve(1,2,5),t);
    }
}
