// Factorial of a number n. 
//     n=6

public class factorialOfNumber{
    public static int factorial(int n){
    int fact = 1;
    for(int i = 1; i<=n; i++){
        fact = fact*i;
        
    }
    return fact;//factorial of n.
}
public static void main(String args[]){
    System.out.println(factorial(5));
    
}

}
