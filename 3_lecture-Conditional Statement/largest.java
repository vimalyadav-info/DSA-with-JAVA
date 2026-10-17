
import java.util.Scanner;

public class largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number a:");
        int a = sc.nextInt();

        System.out.println("Enter a number b:");
        int b = sc.nextInt();

        System.out.println("Enter a number c:");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is the largest");
        } else if (b > a && b > c  ) {
            System.out.println("b is the largest");
        } else {
            System.out.println("c is the largest");
        }

    }

}
