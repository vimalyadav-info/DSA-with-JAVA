import java.util.*;

//print sum of the first natural number.
public class sumnaturalnumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num:");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i <= n){
            sum= sum +i;
            i++;
            
        }
        System.out.println(sum);
    
    }
    
}