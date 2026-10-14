
import java.util.Scanner;
public class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Pencil price:");
        float pencilPrice = sc.nextFloat();
        System.out.print("Enter the Pen price:");
        float penPrice = sc.nextFloat();
        System.out.print("Enter the Eraser price:");
        float eraserPrice = sc.nextFloat();
        float totalPrice = (pencilPrice + penPrice + eraserPrice );

        System.out.println("Total price of Pencil, Pen and Eraser is: " + totalPrice);
       
        float GSTBill = totalPrice * 0.18f;
        System.out.println("GST on total bill is: " + GSTBill);
        float finalBill = totalPrice + GSTBill;
        System.out.println("Final bill including GST is: " + finalBill);
        sc.close();

    }
}
