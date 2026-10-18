import java.util.*;

//print number 1 to n.(user input)
public class printUserIN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a Num:");
        int range = sc.nextInt();
        int count = 1;
        

        while(count <= range){
            System.out.println(count+" ");
            count++;
            
        }
        
    
    }
    
}