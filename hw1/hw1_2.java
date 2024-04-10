import java.util.*;

public class hw1_2 {
    public static void main(String [] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0){
            // when n is divisible by 3, 5, and 7, n = ( 0 mod 3 ) = ( 0 mod 5 ) = ( 0 mod 7 )
            System.out.println("Number is divisible by 3, 5 and 7");
        }
        else{
            System.out.println("Number is not divisible by 3, 5 and 7");
        }
    }
}
