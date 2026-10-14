import java.util.Scanner;


public class areacircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle:");
        int r = sc.nextInt();
        Double area = 3.14 *r*r;
        System.out.println("area of circle is:"+area);
        sc.close();

    }
}
