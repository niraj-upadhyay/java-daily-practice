import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        int pow = 0;
        int sum = 0;
        int n = num;
        int temp = num;

        while (n != 0) {
            n = n / 10;
            pow++;
        }

        while (num != 0) {
            int r = num % 10;
            sum += (int) Math.pow(r, pow);
            num = num / 10;
        }

        System.out.println("Sum = " + sum);

        if (temp == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

    }
}