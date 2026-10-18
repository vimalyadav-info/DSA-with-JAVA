import java.util.Scanner;


//Keep entering number till usersa multiple of 10 .
public   class MULTIPLEOF_10 {
    public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
    do{
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if(n % 10 == 0){
            break;}
            System.out.println(n);
        }while(true);
    }
}
