package WorkRoom;

import java.util.ArrayList;

/**
 * Created by MacBookEr on 9/2/15.
 */
public class Algorithms {

    public ArrayList findFibonacciWithLimit(int firstInteger, int secondInteger, int limit) {

        //create array with firstInteger and secondInteger
        ArrayList<Integer> response = new ArrayList<>();

        response.add(firstInteger);
        response.add(secondInteger);

        //add last two values
        int lastSlotInArray = response.size();
        int secondToLastSlotInArray = lastSlotInArray - 1;
        int sumOfLastTwoValuesInArray = response.get(lastSlotInArray) + response.get(secondToLastSlotInArray);

        //check if result is above limit
        for(int i = 0; sumOfLastTwoValuesInArray < limit; i++) {
            response.add(sumOfLastTwoValuesInArray);
        }
        return response;

            //if value is below limit push it to value and do process again
            //if value is equal to or above limit stop process and do not push
        //return the array
    }


}
