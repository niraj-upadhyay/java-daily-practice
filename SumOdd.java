import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number = ");
        int num2 = sc.nextInt();
        int sum = 0;
        System.out.println("Odd number between " + num1 + " and " + num2);
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.print(" " + i);
            }

        }
        System.out.println("\nsum of Odd number between " + num1 + " and " + num2);
        System.out.print("Sum of odd No = " + sum);

    }
}