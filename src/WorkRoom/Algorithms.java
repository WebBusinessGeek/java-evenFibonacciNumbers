package WorkRoom;

import java.util.ArrayList;

/**
 * Created by MacBookEr on 9/2/15.
 */
public class Algorithms {

    public ArrayList<Integer> generateFibonacciSequence(int firstInteger, int secondInteger, int limit) {
        //create arraylist
        ArrayList<Integer> fibonacciSequence = new ArrayList<>();

        //push firstInteger and secondInteger to arraylist
        fibonacciSequence.add(firstInteger);
        fibonacciSequence.add(secondInteger);

        for()

        //find sum of the last two values in arrayList ***
        int sumOfLastTwoValuesInSequence = this.sumOfLastTwoValuesInArrayList(fibonacciSequence);

        if(sumOfLastTwoValuesInSequence < limit) {
            fibonacciSequence.add(sumOfLastTwoValuesInSequence);

        }

        //check if sum is less than limit
            //if less than limit
                //push to arraylist
                //find sum of last two values in arrayList ***
            //if equal to or more than limit
                //return arraylist

    }

    public int sumOfLastTwoValuesInArrayList(ArrayList<Integer> arrayList) {
        int lastIndex = arrayList.size() - 1;
        int secondToLastIndex = lastIndex - 1;
        return arrayList.get(lastIndex) + arrayList.get(secondToLastIndex);
    }

}
