// Find Product of  a and b 
//     a=5; b=3


public class ProductOfTwoNum{
    public static int multiply(int a, int b){
    int product =a*b;
    return product;
    
}
public static void main(String args[]){
         int a = 5;
         int b = 3;
         int product = multiply(a,b);
         System.out.println("a*b = " + product);
     }
}
