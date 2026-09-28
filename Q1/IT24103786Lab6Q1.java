import java.util.Scanner;

public class IT24103786Lab6Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        System.out.println();
        System.out.println("The square of " + num + " is : " + (num * num));
        System.out.println("The square root of " + num + " is : " + Math.sqrt(num));

        sc.close();
    }
}