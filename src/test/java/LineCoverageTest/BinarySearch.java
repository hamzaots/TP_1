package LineCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearch {
    @Test
    void shouldReturnExceptionIfTheArrayIsNull(){
        int t[]=null;
        Assertions.assertThrows(NullPointerException.class,()-> org.src.BinarySearch.binarySearch(t,5));
    }

    @Test
    void shouldReturnMinesOneIfNotexist(){
        int[] t={1,2,3,4};
        Assertions.assertEquals(-1, org.src.BinarySearch.binarySearch(t,5));
    }

    @Test
    void shouldReturnPositionIfExist(){
        int[] t={1,2,3,4};
        Assertions.assertEquals(3, org.src.BinarySearch.binarySearch(t,4));
    }
}
