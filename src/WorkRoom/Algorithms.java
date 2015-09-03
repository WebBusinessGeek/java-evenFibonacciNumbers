package WorkRoom;

import java.util.ArrayList;

public class Algorithms {

    /*
    * Returns an array list fibonacci sequence of passed in integers up to the specified limit.
    * */
    public ArrayList<Integer> generateFibonacciSequence(int firstInteger, int secondInteger, int limit) {
        ArrayList<Integer> fibonacciSequence = new ArrayList<>();

        fibonacciSequence.add(firstInteger);
        fibonacciSequence.add(secondInteger);

        int sumOfLastTwoValuesInSequence = this.sumOfLastTwoValuesInArrayList(fibonacciSequence);

        while(sumOfLastTwoValuesInSequence < limit) {
            fibonacciSequence.add(sumOfLastTwoValuesInSequence);
            sumOfLastTwoValuesInSequence = this.sumOfLastTwoValuesInArrayList(fibonacciSequence);
        }
        return fibonacciSequence;
    }

    /*
    * Returns the integer sum of the two last values in an array list
    * */
    public int sumOfLastTwoValuesInArrayList(ArrayList<Integer> arrayList) {
        int lastIndex = arrayList.size() - 1;
        int secondToLastIndex = lastIndex - 1;
        return arrayList.get(lastIndex) + arrayList.get(secondToLastIndex);
    }

    /*
    * Returns an ArrayList of all the even integers present in the passed in ArrayList
    * */
    public ArrayList<Integer> extractAllEvenNumbersFromArrayList(ArrayList<Integer> arrayList) {
        ArrayList<Integer> allEvenNumbers = new ArrayList<>();
        int counter = 0;
        while(arrayList.size() > counter) {
            int integerToCheck = arrayList.get(counter);
            if(integerToCheck % 2 == 0) {
                allEvenNumbers.add(integerToCheck);
            }
            counter++;
        }
       return allEvenNumbers;
    }

    public int sumOfAllIntegersInArrayList(ArrayList<Integer> arrayList) {
        int totalToReturn = 0;
        int counter = 0;
        while(arrayList.size() > counter) {
            totalToReturn += arrayList.get(counter);
            counter++;
        }
        return totalToReturn;
    }


}
