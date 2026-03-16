import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int max;
        int lcm;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            }
            max++;
        }

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
