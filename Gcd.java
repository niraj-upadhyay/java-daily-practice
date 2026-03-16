import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int min;
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        int gcd = 1;
        int i = 2;

        while (i <= min) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        System.out.println("GCD = " + gcd);

        sc.close();
    }
}
