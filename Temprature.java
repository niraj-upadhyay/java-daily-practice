import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your temp in  Fah = ");
        float fah = sc.nextFloat();

        float celcius = (fah - 32) * 5 / 9;

        System.out.println("Temprature = " + celcius);

        sc.close();
    }
}