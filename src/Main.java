import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // divideInts
        try {
            divideInts(2,3);
            divideInts(2,0);
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }

        // getSafeInt
        getSafeInt();

        // sumOfNumbers
        try {
            int[] myList = {1,2,3,4,5};
            sumOfNumbers(myList, 5);
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("\n****\nI'm done!!!\n****\n");
    }

    public static int divideInts (int a, int b) throws ArithmeticException {
        if( b==0 ) {
            throw new ArithmeticException("Divide by zero");
        } else {
            return a/b;
        }
    }

    public static int getSafeInt () {
        // NumberFormatException thrown by parseInt
        // and for an empty string
        int newInt = 0;
        try {
            newInt = Integer.parseInt(new Scanner(System.in).nextLine());
        } catch (NumberFormatException e) {
            getSafeInt();
        }

        return newInt;
    }

    public static int sumOfNumbers (int[] numbers, int length) throws Exception {
        if( length != numbers.length ) {
            throw new Exception("Lengths don't match!");
        } else {
            int total = 0;
            for (int num : numbers) {
                total += num;
            }
            return total;
        }
    }
}
