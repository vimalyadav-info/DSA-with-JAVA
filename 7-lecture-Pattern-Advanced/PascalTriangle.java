
import java.util.Scanner;

//print Pascal Triangle

public class PascalTriangle{

    public static int factorial(int x){
        int result=1;
        for(int i=1; i<=x; i++){
            result =result*i;
        }
        return result;
    }
public static int  nCr(int n,int r){
        int a = factorial (n);
        int b = factorial(r);
        int c = factorial(n-r);
        return a/(b*c);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
    for(int row=1; row<=n; row++){
        for(int col=1; col<=row; col++){
            System.out.print(nCr(row-1,col-1)+ " ");
        }
        System.out.println();
    }
    sc.close();
}
}
    