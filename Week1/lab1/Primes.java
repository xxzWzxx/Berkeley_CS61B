package week1.lab1;

public class Primes {
    public static void main(String[] args) {
        printPrimes(Integer.parseInt(args[0]));
    }

    public static void printPrimes(int limit){
        for (int i = 2; i <= limit; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num){

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }      
        }
        return true;
    }
}
