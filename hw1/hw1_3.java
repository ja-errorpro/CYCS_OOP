import java.util.*;
public class hw1_3 {
    public static void main(String[] args){
        System.out.println("---Pyramid Generator---");
        System.out.print("Enter the height of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){ // output 1 to n lines
            for (int j = 1; j <= n - i; j++){ // output 1 to n-i spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){ // output 1 to 2i-1 stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
