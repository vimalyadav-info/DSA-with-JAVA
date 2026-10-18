
import java.util.*;

// Reverse a Number
public class ReverseOriginalNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = 13102004;
        int reverse = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n / 10;
        }

        System.out.println("Reversed Number: " + reverse);

        sc.close();
    }
}
