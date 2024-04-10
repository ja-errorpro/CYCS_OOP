import java.util.*;

class PrimeNumberChecker{

    static final boolean PrimeList[] = new boolean[1000000];

    public static void Init(){ // For Eratosthenes_Sieve, O(nloglogn)
        for(int i = 0; i < 1000000; i++){
            // Suppose all numbers are prime
            PrimeList[i] = true;
        }
        PrimeList[0] = PrimeList[1] = false;
        for(int i = 2; i * i < 1000000; i++){
            // If i is prime, then all multiples of i are not prime
            if(PrimeList[i]){
                for(int j = i * i; j < 1000000; j += i){
                    PrimeList[j] = false;
                }
            }
        }
    }

    public static boolean Brute_Force(String num){ // O(sqrt(n))
        long n = Long.parseLong(num);
        if(n < 2){
            return false;
        }
        for(long i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean Eratosthenes_Sieve(int n){ // O(1)
        if(n < 2){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        return PrimeList[n];
    }

    public static boolean isPrime(String num){
        // Check if the number is less than 1000000, use Eratosthenes_Sieve algorithm
        // Otherwise, use Brute_Force algorithm
        long n = Long.parseLong(num);
        if(n < 1000000){
            return Eratosthenes_Sieve((int)n);
        }
        else{
            return Brute_Force(num);
        }
    }


}

public class hw1_5 {
    public static void main(String[] args){
        PrimeNumberChecker.Init();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.next();
        if(PrimeNumberChecker.isPrime(num)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
