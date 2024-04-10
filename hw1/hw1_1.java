import java.util.*;

class NumberSwapper{
    public int a, b;

    public NumberSwapper(int a, int b){
        this.a = a;
        this.b = b;
    }

    /*
     *   Function to swap two numbers using XOR
     *   Proofs:
     *   0. a ^ b means a xor b.
     *   1. let k = a ^ b
     *   2. let n = k ^ b = (a ^ b) ^ b = a ^ (b ^ b) = a ^ 0 = a
     *   3. k ^ n = (a ^ b) ^ a = b ^ (a ^ a) = b ^ 0 = b
     *   4. then we swapped a and b.
     *   @param obj: object of class hw1_1
     *   @return void
     */
    public void swap(){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}

public class hw1_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        NumberSwapper obj = new NumberSwapper(a, b); // Use a class to swap two numbers

        System.out.println("Before swap: a = " + obj.a + ", b = " + obj.b);
        obj.swap();
        System.out.println("After swap: a = " + obj.a + ", b = " + obj.b);
    }
}
