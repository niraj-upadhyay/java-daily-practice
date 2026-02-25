import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal = ");
        double p = sc.nextDouble();

        System.out.print("Enter the Rate = ");
        double r = sc.nextDouble();

        System.out.print("Enter the Time = ");
        double t = sc.nextDouble();

        double SI = (p * r * t) / 100;

        System.out.println("Simple Interest = " + SI);

        sc.close();
    }
}