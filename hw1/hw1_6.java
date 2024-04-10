import java.util.*;

public class hw1_6 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        long sum = 1;
        for (int i = 2; i <= n; ++i) {
            // 1 + 2 - 3 + 4 - 5 + ... + n
            sum += (i % 2 == 0) ? i : -i;
            // if (i % 2 == 0) {
            //     sum += i;
            // } else {
            //     sum -= i;
            // }
        }

        System.out.println("Sum of the series: " + sum);
    }
}
