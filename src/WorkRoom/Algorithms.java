package WorkRoom;

import java.util.ArrayList;

public class Algorithms {

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

    public int sumOfLastTwoValuesInArrayList(ArrayList<Integer> arrayList) {
        int lastIndex = arrayList.size() - 1;
        int secondToLastIndex = lastIndex - 1;
        return arrayList.get(lastIndex) + arrayList.get(secondToLastIndex);
    }

}
