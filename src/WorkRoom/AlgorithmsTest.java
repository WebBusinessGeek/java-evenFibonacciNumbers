package WorkRoom;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AlgorithmsTest {

    @Test
    public void itShouldReturnTheSumOfAllEvenNumbersInFibonacciSequenceUpToSpecifiedLimit() {
        Algorithms algorithms = new Algorithms();
        int firstInteger = 1;
        int secondInteger = 2;
        int limit = 4000000;
        int result = algorithms.sumOfAllEvenNumbersInFibonacciSequence(firstInteger, secondInteger, limit);
        assertEquals(4613732, result);
    }


    /*
    * TEST SUITE - SHOULD RETURN THE FIBONACCI SEQUENCE UP TO A USER SPECIFIED LIMIT.
    * WHERE THE STARTING INTEGERS ARE ALSO SPECIFIED BY THE USER.
    * */
    @Test
    public void itShouldReturnAFibonacciSequenceUpToSpecifiedLimit() {
        Algorithms algorithms = new Algorithms();
        ArrayList<Integer> fibonacciResult = algorithms.generateFibonacciSequence(1,2,90);
        int lastIndex = fibonacciResult.size() - 1;
        int result = fibonacciResult.get(lastIndex);
        assertEquals(89, result);
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
    * TEST SUITE - SHOULD RETURN THE SUM OF ALL EVEN NUMBERS IN A COLLECTION
    * */
    @Test
    public void itShouldReturnAnArrayListOfAllEvenNumbersFromALargerArrayList() {
        Algorithms algorithms = new Algorithms();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(8);
        ArrayList<Integer> results = algorithms.extractAllEvenNumbersFromArrayList(arrayList);
        int sizeOfArrayList = results.size();
        int lastIndex = sizeOfArrayList - 1;
        int result = results.get(lastIndex);
        assertEquals(3, sizeOfArrayList);
        assertEquals(8, result);
    }

    @Test
    public void itShouldAddAllIntegersInAnArrayList() {
        Algorithms algorithms = new Algorithms();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(8);
        int result = algorithms.sumOfAllIntegersInArrayList(arrayList);
        assertEquals(18, result);
    }

}