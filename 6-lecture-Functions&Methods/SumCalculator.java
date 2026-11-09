// calculator function.  example overloading
public class SumCalculator{
    // fuction to calculate int sum
    public static int sum(int a, int b){
        return a+b;
    }
//function to calcutlate Float sum.
    public static float sum(float  a,float  b){
        return a+b;
    }
//sum of 2 num.
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    //sum of 3 num.
    public static float sum(float  a, float  b, float  c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(3,5,6));
        System.out.println (sum(6,4));

        
        
        
    }
}