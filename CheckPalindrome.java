import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        while (num != 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }

        if (original == rev) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is Not a Palindrome number");
        }
    }
}