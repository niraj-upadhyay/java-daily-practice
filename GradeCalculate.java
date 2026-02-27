import java.util.Scanner;

public class GradeCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks = ");
        int grade = sc.nextInt();

        if (grade > 100 || grade < 0) {
            System.out.println("Not Valid Marks");
        } else if (grade >= 90) {
            System.out.println("Grade A");
        } else if (grade >= 75) {
            System.out.println("Grade B");
        } else if (grade >= 60) {
            System.out.println("Grade C");
        } else if (grade >= 30) {
            System.out.println("Grade D");
        } else if (grade < 30) {
            System.out.println("Grade F");
        } else {
            System.out.println("Not valid");
        }

    }
}