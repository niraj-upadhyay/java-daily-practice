import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.print(0);
            return;
        }
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < num; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
