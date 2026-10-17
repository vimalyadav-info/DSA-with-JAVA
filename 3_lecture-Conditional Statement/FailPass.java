
import java.util.*;

public class FailPass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        if (marks >= 33 && marks < 100) {
            System.out.println("Pass");
        } else if (marks < 33) {
            System.out.println("Fail");
        } else {
            System.out.println("Not Valid");    
        }
    }

}
