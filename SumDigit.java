import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");

        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            // int r = num%10;
            // sum = sum + r;
            sum = sum + (num % 10);
            num = num / 10;

        }

        System.out.println("Sum of digit of the number = " + sum);

    }
}