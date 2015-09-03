package WorkRoom;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by MacBookEr on 9/2/15.
 */
public class AlgorithmsTest {

    /*
    * TEST SUITE - SHOULD RETURN THE FIBONACCI SEQUENCE UP TO A USER SPECIFIED LIMIT.
    * WHERE THE STARTING INTEGERS ARE ALSO SPECIFIED BY THE USER.
    * */
    @Test
    public void itShouldReturnAFibonacciSequenceUpToSpecifiedLimit() {
        Algorithms algorithms = new Algorithms();
        ArrayList<Integer> fibonacciResult = algorithms.generateFibonacciSequence(1,2,90);

    }



    @Test
    public void itShouldReturnSumOfLastTwoValuesInArrayList() {
        Algorithms algorithms = new Algorithms();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        int result = algorithms.sumOfLastTwoValuesInArrayList(arrayList);
        assertEquals(5, result);
    }


    /*
    * TEST SUITE - SHOULD RETURN THE SUM OF ALL [EVEN, ODD, ALL] NUMBERS IN A COLLECTION
    * */
    @Test
    public void itShouldReturnAllEvenNumbersInACollection() {

    }

    @Test
    public void itShouldReturnAllOddNumbersInACollection() {

    }

    @Test
    public void itShouldAddAllIntegersInACollection() {

    }

}