package WorkRoom;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MacBookEr on 9/2/15.
 */
public class AlgorithmsTest {

    @Test
    public void shouldReturnFibonacciSequenceUpToLimitSpecified() {
        Algorithms algorithms = new Algorithms();
        int[] correctFibonacciUpTo90 = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        assertEquals(correctFibonacciUpTo90, algorithms.findFibonacciWithLimit(1, 2, 90));
    }

}