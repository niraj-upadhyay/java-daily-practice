import java.util.Scanner;

public class BitwiseComplement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int a = sc.nextInt();

        int result = ~a;

        System.out.println("Bitwise Complement is = " + result);

        sc.close();
    }
}