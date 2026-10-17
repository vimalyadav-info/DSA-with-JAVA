import java.util.Scanner;
public class oddeven {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number a:");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("a is even: " + num);
        } else {
            System.out.println("a is odd: " + num);
        }
 
    
    
    
    }
    



}
