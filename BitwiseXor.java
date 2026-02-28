import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitwise xOR of two numbers");

        System.out.print("Enter the first number = ");
        int a = sc.nextInt();

        System.out.print("Enter the second number = ");
        int b = sc.nextInt();

        int result = a ^ b;

        System.out.println("Bitwise XOR result is = " + result);

        sc.close();
    }
}