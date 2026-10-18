import java.util.*;

//print Reverse a Number.

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 13102000;
        while(n > 0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n / 10; // n/=10;
        }
        System.out.println();

        

    }
}
