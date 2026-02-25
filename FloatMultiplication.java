import java.util.Scanner;

public class FloatMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first float no = ");
        float a = sc.nextFloat();

        System.out.print("Enter the second float no = ");
        float b = sc.nextFloat();

        float multiply = a * b;

        System.out.println("Product of two no is = " + multiply);

        sc.close();
    }
}