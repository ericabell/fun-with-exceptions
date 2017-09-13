import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            divideInts(2,3);
            divideInts(2,0);
        } catch(Exception e) {
            System.out.println("Divide by zero attempted!");
        }


        System.out.println("\n****\nI'm done!!!\n****\n");
    }

    public static int divideInts (int a, int b) {
        return a/b;
    }

    public static int getSafeInt () {
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

    public static int sumOfNumbers (int[] numbers, int length) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

}
