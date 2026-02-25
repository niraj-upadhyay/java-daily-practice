import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length = ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth = ");
        int b = sc.nextInt();

        int perimeter = 2 * (l + b);

        System.out.print("perimeter of rectangle  = " + perimeter);

        sc.close();
    }
}