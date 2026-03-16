import java.util.Scanner;

public class PrintArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start range = ");
        int start = sc.nextInt();

        System.out.print("Enter end range = ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int num = i;
            int sum = 0;
            int temp = i;
            int digits = 0;

            // count digits
            while (temp != 0) {
                temp = temp / 10;
                digits++;
            }

            num = i;

            while (num != 0) {
                int r = num % 10;
                // sum += (int) Math.pow(r, digits);
                sum = sum + (int) Math.pow(r, digits);
                num = num / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}