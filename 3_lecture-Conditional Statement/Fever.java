// Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever.

import java.util.Scanner;

public class Fever {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a body Temperature:");
// double temp = 103.5;
        float tem = sc.nextFloat();
        if (tem > 100) {
            System.out.println("Fever, Please meet a Doctor");
        } else {
            System.out.println("your are fit take some rest ");
        }
        sc.close();
    }
}
