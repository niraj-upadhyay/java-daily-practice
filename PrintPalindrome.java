import java.util.Scanner;

public class PrintPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start range = ");
        int start = sc.nextInt();

        System.out.print("Enter end range = ");
        int end = sc.nextInt();

        System.out.println("Palindrome numbers in the range:");

        for (int i = start; i <= end; i++) {

            int num = i;
            int rev = 0;

            while (num != 0) {
                int r = num % 10;
                rev = rev * 10 + r;
                num = num / 10;
            }

            if (rev == i) {
                System.out.println(i);
            }
        }
    }
}
