
import java.util.Scanner;

public class production {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number a:");
        int a = sc.nextInt();
        System.out.print("enter a number b:");
        int b = sc.nextInt();  
        int production = a * b;
        System.out.println("multiple of " + a + " and " + b + " is: " + production);
        sc.close();

    }
}
