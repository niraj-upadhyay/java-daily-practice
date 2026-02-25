import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a = sc.nextInt();
        System.out.print("Enter the second number = ");
        int b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        int divide = a / b;
        int modulus = a % b;

        System.out.println("The sum of a and b = " + sum);
        System.out.println("The substraction of a and b = " + sub);
        System.out.println("The multiplication of a and b = " + multi);
        System.out.println("The divide of a and b = " + divide);
        System.out.println("The modulus of a and b = " + modulus);
        sc.close();
    }
}
