import java.util.*;

public class hw2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, degree;
        System.out.print("Enter the first edge of the triangle: ");
        a = scanner.nextDouble();
        System.out.print("Enter the second edge of the triangle: ");
        b = scanner.nextDouble();
        System.out.print("Enter the degree between the first and second edge: ");
        degree = scanner.nextDouble();
        // Calculate the third edge of the triangle by the cosine theorem
        c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(degree)));
        System.out.println("\033[1;32mThe third edge of the triangle is \033[0m" + c);

    }
}
