// // sum of two numbers without user input.

// public class sum {
//     public static void main(String args[] ) {
//         int a = 10; 
//         int b = 20;
//         int sum = a + b;

//         System.out.println("Sum of " + a + " and " + b + " is: " + sum);
//     }
// }
 
// sum of two numbers with user input.
import java.util.Scanner;
public class sum {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in );
        System.out.println("enter a number a:");
        int a = sc.nextInt();
        System.out.println("enter a number b:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of " + a + "and " + b + "is:" +sum);
        sc.close();

    }
}