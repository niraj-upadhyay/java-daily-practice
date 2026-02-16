import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");

        int a = input.nextInt()

        System.out.println("Enter the Second number");

        int b = input.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("The sum of two no is = " + sum);
        System.out.println("The sub of two no is = " + sub);
        System.out.println("The mul of two no is = " + mul);
        System.out.println("The div of two no is = " + div);
        System.out.println("The mod of two no is = " + mod);

    }

}
