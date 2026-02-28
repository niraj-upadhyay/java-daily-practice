import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int a = sc.nextInt();

        System.out.print("Enter number of shifts = ");
        int n = sc.nextInt();

        int result = a >> n;

        System.out.println("Result after Right shift = " + result);

        sc.close();
    }
}