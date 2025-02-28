import java.util.Scanner;

public class FactorialCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if(number < 0) {
            System.out.println("Factorial is not defined for negative number.");
        }else{
            long factorial = calculateFactorial(number);
            System.out.println("The Factorial of " + number + " is " + factorial);
        }
        scanner.close();
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}