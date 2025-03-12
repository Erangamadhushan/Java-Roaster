package OOP;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] myNumbers = {12, 34, -13, 45, 89, 456, -657};
        int maxValue = myNumbers[0];

        for(int loopNumber:myNumbers) {
            if(loopNumber > maxValue) {
                maxValue = loopNumber;
            }
        }

        System.out.println("Maximum number of given array :"+maxValue);
    }
}
