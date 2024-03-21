package BranchCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.Anagram;
import org.src.BinarySearch;

public class BinarySearchTest {
    @Test
    void shouldReturnExceptionIfTheArrayIsNull(){
        int t[]=null;
        Assertions.assertThrows(NullPointerException.class,()-> BinarySearch.binarySearch(t,5));
    }

    @Test
    void shouldReturnMinesOneIfNotexist(){
        int[] t={1,2,3,4};
        Assertions.assertEquals(-1,BinarySearch.binarySearch(t,5));
    }

    @Test
    void shouldReturnPositionIfExist(){
        int[] t={1,2,3,4};
        Assertions.assertEquals(3,BinarySearch.binarySearch(t,4));
    }
}
