import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tha first no = ");
        int a = sc.nextInt();

        System.out.print("Enter tha second no = ");
        int b = sc.nextInt();

        System.out.print("Enter tha third no = ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " No is greater");
        } else if (b >= a && b >= c) {
            System.out.println(b + " No is greater");
        } else {
            System.out.println(c + " No is greater");
        }

    }
}
