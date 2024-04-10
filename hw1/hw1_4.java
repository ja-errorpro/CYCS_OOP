import java.util.*;

public class hw1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double [] scores = new double[10];
        double max = -1, sum = 0, avg = 0;
        for (int i = 0; i < 10; i++) {
            scores[i] = scanner.nextDouble();
            if (scores[i] > max) {
                // if the current number is greater than the max number, update the max number
                max = scores[i];
            }
            sum += scores[i];
        }

        for (int i = 0; i < 10; i++) { // print out all the numbers
            System.out.println("Number " + (i + 1) + ": " + scores[i]);
        }

        System.out.println("The maximum number is: " + max);
        avg = sum / 10; // calculate the average
        System.out.printf("The average is: %.2f\n", avg);

    }
}
